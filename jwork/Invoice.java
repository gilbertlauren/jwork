/**
 * Merupakan file class untuk Invoice
 * @author Gilbert Lauren
 * @version 18 Maret 2021
 */
public abstract class Invoice /** inisiasi class */
{
    private int id; /** inisiasi variabel */
    private Job job;
    private String date;
    protected int totalFee;
    private Jobseeker jobseeker;
    private InvoiceStatus invoiceStatus;
    /**
     * Constructor for objects of class Invoice
     * @param id id dari Invoice
     * @param idJob id job dari Invoice
     * @param totalFee total gaji dari Invoice
     * @param date tanggal dari Invoice
     * @param jobseeker pencari perkerjaan dari Invoice
     */
    public Invoice(int id, Job job, String date, Jobseeker jobseeker, InvoiceStatus invoiceStatus) {
        this.id = id;
        this.job = job;
        this.date = date;
        this.jobseeker = jobseeker;
        this.invoiceStatus = invoiceStatus;
    }
    /**
     * merupakan getter Id dari Invoice
     * @return id
     */
    public int getId() {
        return id;
    }
    /**
     * merupakan getter IdJob dari Invoice
     * @return idJob
     */
    public Job getJob() {
        return job;
    }
    /**
     * merupakan getter Date dari Invoice
     * @return Date
     */
    public String getDate() {
        return date;
    }
    /**
     * merupakan getter TotalFee dari Invoice
     * @return totalFee
     */
    public int getTotalFee() {
        return totalFee;
    }
    /**
     * merupakan getter Jobseeker dari Invoice
     * @return jobseeker
     */
    public Jobseeker getJobseeker() {
        return jobseeker;
    }
    /**
     * merupakan getter PaymentType dari Invoice
     * @return PaymentType
     */
    public abstract PaymentType getPaymentType();
    /**
     * merupakan getter InvoiceStatus dari Invoice
     * @return InvoiceStatus
     */
    public InvoiceStatus getInvoiceStatus() {
        return invoiceStatus;
    }
    /**
     * merupakan setter Id dari Invoice
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * merupakan setter IdJobs dari Invoice
     * @param id
     */
    public void setJob(Job job) {
        this.job = job;
    }
    /**
     * merupakan setter Date dari Invoice
     * @param date
     */
    public void setDate (String date) {
        this.date = date;
    }
    /**
     * merupakan setter TotalFee dari Invoice
     * @param totalFee
     */
    public abstract void setTotalFee ();
    /**
     * merupakan setter Jobseeker dari Invoice
     * @param jobseeker
     */
    public void setJobseeker (Jobseeker jobseeker) {
        this.jobseeker = jobseeker;
    }
    /**
     * merupakan setter InvoiceStatus dari Invoice
     * @param PaymentType
     */
    public void setInvoiceStatus (InvoiceStatus status) {
        this.invoiceStatus = invoiceStatus;
    }
    /**
     * method untuk print dari Invoice
     * outputnya adalah berupa jumlah gaji
     */
    public abstract void printData();
     //   System.out.println("=============== INVOICE ===============");
     //   System.out.println("ID: " + id);
     //   System.out.println("ID Job: " + job);
     //   System.out.println("Date: " + date);
     //   System.out.println("Seeker: " + jobseeker.getName());
     //   System.out.println("Fee: " + totalFee);
     //   System.out.println("Status: " + invoiceStatus);
}
