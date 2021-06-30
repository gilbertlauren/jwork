package gilbertlauren.jwork;
import java.util.ArrayList;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Invoice of a job for the job seeker
 * <p>
 * Contains the nessecary info about a job taken by the jobseeker
 *
 * @author Gilbert Lauren
 * @version 03/18/2021
 */
public abstract class Invoice /** inisiasi class */
{
    private int id; /** inisiasi variabel */
    private ArrayList<Job> jobs;
    private Calendar date;
    protected int totalFee;
    private Jobseeker jobseeker;
    private InvoiceStatus invoiceStatus;
    /**
     * Constructor of Invoice Class
     *
     * @param id        id of Invoice
     * @param jobs      Job's id of Invoice
     * @param jobseeker Jobseeker class of Invoice
     * @see Jobseeker
     */
    public Invoice(int id, ArrayList<Job> jobs, Jobseeker jobseeker) {
        this.id = id;
        this.jobs = jobs;
        date = new GregorianCalendar();
        this.jobseeker = jobseeker;
        this.invoiceStatus = InvoiceStatus.OnGoing;
    }
    /**
     * Accessor of field "id" in Invoice Class
     *
     * @return int returns the id of an Invoice
     */
    public int getId() {
        return id;
    }
    /**
     * Accessor of field "idJob" in Invoice Class
     *
     * @return int returns the idJob of an Invoice
     */
    public  ArrayList<Job> getJobs() {
        return jobs;
    }
    /**
     * Accessor of field "date" in Invoice Class
     *
     * @return String returns the date of an Invoice
     */
    public Calendar getDate() {
        return date;
    }
    /**
     * Accessor of field "totalFee" in Invoice Class
     *
     * @return int returns the totalFee of an Invoice
     */
    public int getTotalFee() {
        return totalFee;
    }
    /**
     * Accessor of field "Jobseeker" in Invoice Class
     *
     * @return Jobseeker returns the jobseeker class of an Invoice
     */
    public Jobseeker getJobseeker() {
        return jobseeker;
    }
    /**
     * Accessor of PAYMENT_TYPE
     *
     * @see EwalletPayment
     */
    public abstract PaymentType getPaymentType();
    /**
     * Accessor of field "invoiceStatus" in Invoice Class
     *
     * @return InvoiceStatus returns the invoice status enum of an Invoice
     */
    public InvoiceStatus getInvoiceStatus() {
        return invoiceStatus;
    }
    /**
     * Mutator of field "id" in Invoice Class
     *
     * @param id new id for an Invoice
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * Mutator of field "idJob" in Invoice Class
     *
     * @param jobs new idJob for an Invoice
     */
    public void setJobs(ArrayList<Job> jobs) {
        this.jobs = jobs;
    }
    /**
     * Mutator of field "date" in Invoice Class
     *
     * @param date new date for an Invoice
     */
    public void setDate (Calendar date) {
        this.date = date;
    }
    public void setDate (int year, int month, int dayOfMonth) {
        this.date = new GregorianCalendar(year, month, dayOfMonth);
    }
    /**
     * Mutator of field "totalFee" in Invoice Class
     */
    public abstract void setTotalFee();
    /**
     * Mutator of field "jobseeker"  in Invoice Class
     *
     * @param jobseeker new jobseeker for an Invoice
     */
    public void setJobseeker (Jobseeker jobseeker) {
        this.jobseeker = jobseeker;
    }
    /**
     * Mutator of field "invoiceStatus"  in Invoice Class
     *
     * @param status new invoice status for an Invoice
     */
    public void setInvoiceStatus (InvoiceStatus status) {
        this.invoiceStatus = status;
    }
    /**
     * Prints out the data of Invoice
     */
    public abstract String toString();
       // SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMMM yyyy");
    //public abstract void printData();
     //   System.out.println("=============== INVOICE ===============");
     //   System.out.println("ID: " + id);
     //   System.out.println("ID Job: " + job);
     //   System.out.println("Date: " + date);
     //   System.out.println("Seeker: " + jobseeker.getName());
     //   System.out.println("Fee: " + totalFee);
     //   System.out.println("Status: " + invoiceStatus);
}
