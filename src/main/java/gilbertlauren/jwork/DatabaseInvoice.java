package gilbertlauren.jwork;
import java.util.ArrayList;
/**
 * Class Database Invoice
 *
 * @author Gilbert Lauren
 * @version 06/28/2021
 */
public class DatabaseInvoice {
    private static ArrayList<Invoice> INVOICE_DATABASE = new ArrayList<>();
    private static int lastId = 0;

    public static ArrayList<Invoice> getInvoiceDatabase() {
        return INVOICE_DATABASE;
    }
    /**
     * getter for invoice by id
     * @param id
     * @return
     * @throws InvoiceNotFoundExecption
     */
    public static Invoice getInvoiceById(int id) throws InvoiceNotFoundExecption {
        //Looping for checking the input
        for (Invoice listInvoice : INVOICE_DATABASE) {
            if (listInvoice.getId() == id) {
                return listInvoice;
            }
        }
        throw new InvoiceNotFoundExecption(id);
    }
    /**
     * getter invoice by jobseeker
     * @param jobseekerId
     *
     */
    public static ArrayList<Invoice> getInvoiceByJobseeker(int jobseekerId) {
        ArrayList<Invoice> invoiceListByJobseeker = new ArrayList<Invoice>(0);
        //Looping for checking the input
        for (Invoice listInvoice : INVOICE_DATABASE) {
            if (listInvoice.getJobseeker().getId() == jobseekerId) {
                invoiceListByJobseeker.add(listInvoice);
            } else {
                invoiceListByJobseeker = null;
            }
        }
        return invoiceListByJobseeker;
    }
    /**
     * add invoice function
     * @param invoice
     * @return
     * @throws OngoingInvoiceAlreadyExistsException
     */
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
    /**
     * change invoice status function
     * @param id
     * @param invoiceStatus
     * @return
     */
    public static boolean changeInvoiceStatus(int id, InvoiceStatus invoiceStatus) {
        for (Invoice invoice : INVOICE_DATABASE) {
            if (invoice.getId() == id) {
                invoice.setInvoiceStatus(invoiceStatus);
                return true;
            }
        }
        return false;
    }
    /**
     * Removing Invoice by Id
     * @param id
     * @return
     * @throws InvoiceNotFoundExecption
     */
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
