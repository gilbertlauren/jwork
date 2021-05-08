import java.util.ArrayList;

public class DatabaseInvoice {
    private static ArrayList<Invoice> INVOICE_DATABASE = new ArrayList<>();
    private static int lastId = 0;

    public static ArrayList<Invoice> getInvoiceDatabase() {
        return INVOICE_DATABASE;
    }

    public static Invoice getInvoiceById(int id) throws InvoiceNotFoundExecption {
        //Looping for checking the input
        for (Invoice listInvoice : INVOICE_DATABASE) {
            if (listInvoice.getId() == id) {
                return listInvoice;
            }
        }
        throw new InvoiceNotFoundExecption(id);
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
    public static boolean addInvoice(Invoice invoice) throws OngoingInvoiceAlreadyExistsException{
        //Loop for Checking the input
        for (Invoice i : INVOICE_DATABASE) {
            if (i.getInvoiceStatus() == InvoiceStatus.OnGoing || i.getId() == invoice.getId()) {
                throw new OngoingInvoiceAlreadyExistsException(i);
            }
        }
        INVOICE_DATABASE.add(invoice);
        lastId = invoice.getId();
        return true;
    }
    public static boolean removeInvoice(int id) throws InvoiceNotFoundExecption{
        for (Invoice invoice : INVOICE_DATABASE) {
            if (invoice.getId() == id) {
                INVOICE_DATABASE.remove(invoice);
                return true;
            }
        }
        throw new InvoiceNotFoundExecption(id);
    }
    public static int getLastId() {
        return lastId;
    }
}
