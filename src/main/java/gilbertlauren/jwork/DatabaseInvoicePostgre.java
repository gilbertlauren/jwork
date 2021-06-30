package gilbertlauren.jwork;

import javax.crypto.spec.IvParameterSpec;
import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
/**
 * Modifies or Read invoice Table in Database
 *
 * @author Gilbert Lauren
 * @version 06/28/2021
 * @see Invoice
 */
public class DatabaseInvoicePostgre {
    /**
     * Get All Invoice from invoice table
     *
     * @return ArrayList of Invoice
     */
    public static ArrayList<Invoice> getAllInvoice() {
        Connection c = DatabaseConnection.connection();
        ArrayList<Invoice> invoices = new ArrayList<>();

        try {
            PreparedStatement stmt = c.prepareStatement("SELECT * FROM invoice;");
            ResultSet rs = stmt.executeQuery();
            Invoice invoice = null;
            while (rs.next()) {
                invoice = retrieveInvoice(rs);
                invoices.add(invoice);
            }
            rs.close();
            stmt.close();
            c.close();
            return invoices;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return null;
        }

    }

    /**
     * Get the last id of Invoice available
     *
     * @return int id of last Invoice
     */
    public static int getLastId() {
        int lastId = 0;
        Connection c = DatabaseConnection.connection();
        try {
            PreparedStatement stmt = c.prepareStatement("SELECT id FROM invoice ORDER BY id DESC LIMIT 1;");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                lastId = rs.getInt("id");
            }
            rs.close();
            stmt.close();
            c.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return lastId;
    }

    /**
     * Get an Invoice from database with specified id
     *
     * @param id id of Invoice
     * @return Invoice Object
     */
    public static Invoice getInvoiceById(int id) {
        Connection c = DatabaseConnection.connection();
        try {
            PreparedStatement stmt = c.prepareStatement("SELECT * FROM invoice WHERE id  = ?;");
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            Invoice invoice = null;
            while (rs.next()) {
                invoice = retrieveInvoice(rs);
            }
            rs.close();
            stmt.close();
            c.close();
            return invoice;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return null;
        }
    }

    /**
     * Get all Invoice with specified Jobseeker Id
     *
     * @param jobseekerId id of Jobseeker
     * @return ArrayList of Invoice
     */
    public static ArrayList<Invoice> getInvoiceByJobseeker(int jobseekerId) {
        Connection c = DatabaseConnection.connection();
        ArrayList<Invoice> invoices = new ArrayList<>();

        try {
            PreparedStatement stmt = c.prepareStatement("SELECT * FROM invoice WHERE jobseeker_id = ?;");
            stmt.setInt(1, jobseekerId);
            ResultSet rs = stmt.executeQuery();
            Invoice invoice = null;
            while (rs.next()) {
                invoice = retrieveInvoice(rs);
                invoices.add(invoice);
            }
            rs.close();
            stmt.close();
            c.close();
            return invoices;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return null;
        }

    }

    /**
     * Insert a new Invoice to the database
     *
     * @param invoice new Invoice
     * @return whether Invoice is successfully inserted
     * @throws OngoingInvoiceAlreadyExistsException
     */
    public static boolean insertInvoice(Invoice invoice) throws OngoingInvoiceAlreadyExistsException {
        Connection c = DatabaseConnection.connection();
        try {
            PreparedStatement stmt = c.prepareStatement("SELECT id, invoice_status FROM invoice WHERE jobseeker_id = ? AND invoice_status = ? ORDER BY id DESC LIMIT 1;");
            stmt.setInt(1, invoice.getJobseeker().getId());
            stmt.setString(2, InvoiceStatus.OnGoing.toString());

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                rs.close();
                stmt.close();
                c.close();
                throw new OngoingInvoiceAlreadyExistsException(invoice);
            }
            stmt = c.prepareStatement("INSERT INTO invoice " +
                    "(id,jobs,total_fee,date,jobseeker_id,invoice_status,payment_type,bonus_id,admin_fee) " +
                    "VALUES (?,?,?,?,?,?,?,?,?);");

            stmt.setInt(1, invoice.getId());
            stmt.setInt(3, invoice.getTotalFee());
            stmt.setDate(4, new Date(invoice.getDate().getTimeInMillis()));
            stmt.setInt(5, invoice.getJobseeker().getId());
            stmt.setString(6, invoice.getInvoiceStatus().toString());
            stmt.setString(7, invoice.getPaymentType().toString());

            List<Integer> list = new ArrayList<>();
            for (Job job : invoice.getJobs()) {
                list.add(job.getId());
            }
            Integer[] jobId = list.toArray(new Integer[0]);
            Array jobs = c.createArrayOf("INTEGER", jobId);
            stmt.setArray(2, jobs);


            if (invoice.getPaymentType() == PaymentType.BankPayment) {
                BankPayment bankPayment = (BankPayment) invoice;
                stmt.setNull(8, Types.INTEGER);
                stmt.setInt(9, bankPayment.getAdminFee());
            }
            if (invoice.getPaymentType() == PaymentType.EwalletPayment) {
                EwalletPayment ewalletPayment = (EwalletPayment) invoice;
                stmt.setInt(8, ewalletPayment.getBonus().getId());
                stmt.setNull(9, Types.INTEGER);
            }

            stmt.executeUpdate();
            rs.close();
            stmt.close();
            c.close();
            return true;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return false;
        }
    }

    /**
     * Delete an Invoice of specified Id in database
     *
     * @param id Id of Invoice
     * @return whether Deletion is successful
     */
    public static boolean removeInvoice(int id) {
        Connection c = DatabaseConnection.connection();
        try {
            PreparedStatement stmt = c.prepareStatement("DELETE FROM invoice where id = ?;");
            stmt.setInt(1, id);
            stmt.executeUpdate();
            stmt.close();
            c.close();
            return true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return false;
        }
    }

    /**
     * Update the status of Invoice
     *
     * @param id            id of Invoice
     * @param invoiceStatus status of Invoie
     * @return whether update is successful
     */
    public static boolean changeInvoiceStatus(int id, InvoiceStatus invoiceStatus) {
        Connection c = DatabaseConnection.connection();
        try {
            PreparedStatement stmt = c.prepareStatement("UPDATE invoice SET invoice_status = ? where id = ?;");
            stmt.setString(1, invoiceStatus.toString());
            stmt.setInt(2, id);
            stmt.executeUpdate();
            stmt.close();
            c.close();
            return true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return false;
        }
    }

    /**
     * Use ResultSet to retrieve Invoice data
     *
     * @param rs ResultSet to be passed
     * @return Invoice Object
     */
    private static Invoice retrieveInvoice(ResultSet rs) {
        Invoice invoice = null;
        try {
            int id = rs.getInt("id");
            Array jobsArray = rs.getArray("jobs");
            Integer[] jobsId = (Integer[]) jobsArray.getArray();


            ArrayList<Job> jobs = new ArrayList<>();
            for (int j : jobsId) {
                jobs.add(DatabaseJobPostgre.getJobById(j));
            }


            int totalFee = rs.getInt("total_fee");
            Calendar date = new GregorianCalendar();
            date.setTime(rs.getDate("date"));

            Jobseeker jobseeker = DatabaseJobseekerPostgre.getJobseekerById(rs.getInt("jobseeker_id"));
            InvoiceStatus invoiceStatus = InvoiceStatus.valueOfLabel(rs.getString("invoice_status"));
            PaymentType paymentType = PaymentType.valueOfLabel(rs.getString("payment_type"));
            if (paymentType == PaymentType.BankPayment) {
                int adminFee = rs.getInt("admin_fee");
                invoice = new BankPayment(id, jobs, jobseeker, adminFee);
                invoice.setDate(date);
                invoice.setTotalFee();
                invoice.setInvoiceStatus(invoiceStatus);
                return invoice;
            }
            if (paymentType == PaymentType.EwalletPayment) {
                Bonus bonus = DatabaseBonusPostgre.getBonusById(rs.getInt("bonus_id"));
                invoice = new EwalletPayment(id, jobs, jobseeker, bonus);
                invoice.setDate(date);
                invoice.setTotalFee();
                invoice.setInvoiceStatus(invoiceStatus);
                return invoice;
            }
            return null;

        } catch (SQLException | BonusNotFoundException throwables) {
            throwables.printStackTrace();
            return null;
        }
    }
}