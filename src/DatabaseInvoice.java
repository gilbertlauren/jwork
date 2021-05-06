import java.util.ArrayList;

public class DatabaseInvoice {
    private static ArrayList<Invoice> INVOICE_DATABASE = new ArrayList<>();
    private static int lastId = 0;

    public static ArrayList<Invoice> getInvoiceDatabase() {
        return INVOICE_DATABASE;
    }

    public static Invoice getInvoiceById(int id) {
        //Looping for checking the input
        for (Invoice listInvoice : INVOICE_DATABASE) {
            if (listInvoice.getId() == id) {
                return listInvoice;
            }
        }
        return null;
    }

    public static ArrayList<Invoice> getInvoiceByJobseeker(int jobseekerId) {
        ArrayList<Invoice> invoiceListByJobseeker = new ArrayList<Invoice>(0);
        //Looping fo checking the input
        for (Invoice listInvoice : INVOICE_DATABASE) {
            if (listInvoice.getJobseeker().getId() == jobseekerId) {
                invoiceListByJobseeker.add(listInvoice);
            } else {
                invoiceListByJobseeker = null;
            }
        }
        return invoiceListByJobseeker;
    }

    //Mutator
    public static boolean addInvoice(Invoice invoice) {
        //Loop for Checking the input
        for (Invoice listInvoice : INVOICE_DATABASE) {
            if (invoice.getJobseeker().equals(listInvoice.getJobseeker()) && invoice.getInvoiceStatus() == InvoiceStatus.OnGoing) {
                return false;
            }
        }
        INVOICE_DATABASE.add(invoice);
        lastId = invoice.getId();
        return true;
    }
    public static int getLastId() {
        return lastId;
    }
}
