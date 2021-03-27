/**
 * Merupakan file class untuk Invoice
 * @author Gilbert Lauren
 * @version 18 Maret 2021
 */
public class Invoice /** inisiasi class */
{
    private int id, idJob, totalFee; /** inisiasi variabel */
    private String date;
    private Jobseeker jobseeker;
    private PaymentType paymentType;
    private InvoiceStatus status;
    /**
     * Constructor for objects of class Invoice
     * @param id id dari Invoice
     * @param idJob id job dari Invoice
     * @param totalFee total gaji dari Invoice
     * @param date tanggal dari Invoice
     * @param jobseeker pencari perkerjaan dari Invoice
     */
    public Invoice(int id, int idJob, String date, int totalFee, Jobseeker jobseeker, PaymentType paymentType, InvoiceStatus status) {
        this.id = id;
        this.idJob = idJob;
        this.date = date;
        this.totalFee = totalFee;
        this.jobseeker = jobseeker;
        this.paymentType = paymentType;
        this.status = status;
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
    public int getIdJob() {
        return idJob;
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
    public PaymentType getPaymentType() {
        return paymentType;
    }
    /**
     * merupakan getter InvoiceStatus dari Invoice
     * @return InvoiceStatus
     */
    public InvoiceStatus getInvoiceStatus() {
        return status;
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
    public void setIdJobs(int idJobs) {
        this.idJob = idJob;
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
    public void setTotalFee (int totalFee) {
        this.totalFee = totalFee;
    }
    /**
     * merupakan setter Jobseeker dari Invoice
     * @param jobseeker
     */
    public void setJobseeker (Jobseeker jobseeker) {
        this.jobseeker = jobseeker;
    }
    /**
     * merupakan setter PaymentType dari Invoice
     * @param PaymentType
     */
    public void setPaymentType (PaymentType paymentType) {
        this.paymentType = paymentType;
    }
    /**
     * merupakan setter InvoiceStatus dari Invoice
     * @param PaymentType
     */
    public void setInvoiceStatus (InvoiceStatus status) {
        this.status = status;
    }
    /**
     * method untuk print dari Invoice
     * outputnya adalah berupa jumlah gaji
     */
    public void printData(){
        System.out.println("=============== INVOICE ===============");
        System.out.println("ID: " + id);
        System.out.println("ID Job: " + idJob);
        System.out.println("Date: " + date);
        System.out.println("Seeker: " + jobseeker.getName());
        System.out.println("Fee: " + totalFee);
        System.out.println("Status: " + status);
    }
}
