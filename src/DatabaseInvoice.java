import java.util.ArrayList;

public class DatabaseInvoice {
    private static ArrayList<Invoice> INVOICE_DATABASE = new ArrayList<>();
    private static int lastId = 0;

    public static ArrayList<Invoice> getInvoiceDatabaseDatabase() {
        return INVOICE_DATABASE;
    }
    public static int getLastId(){
        return lastId;
    }
    public static Invoice getInvoiceById(int id) {
        for (Invoice invoice : INVOICE_DATABASE) {
            if (invoice.getId() == id) {
                return invoice;
            }
        }
        return null;
    }
    public static ArrayList<Invoice>getInvoiceByJobseekerId(int jobseekerId) {
        ArrayList<Invoice> invoices = new ArrayList<>();
        for (Invoice invoice : INVOICE_DATABASE) {
            if (invoice.getJobseeker().getId() == jobseekerId) {
                invoices.add(invoice);
            }
        }
        if (invoices.isEmpty()) {
            return null;
        } else{
            return invoices;
        }
    }
    public static boolean addInvoice(Invoice invoice) {
        INVOICE_DATABASE.add(invoice);
        lastId=invoice.getId();
        return true;
    }
    public static boolean removeInvoice(int id) {
        for (Invoice invoice : INVOICE_DATABASE) {
            if (invoice.getId()==id) {
                INVOICE_DATABASE.remove(invoice);
                return true;
            }
        }
        return false;
    }
}
