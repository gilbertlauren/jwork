/**
 * Merupakan file subclass untuk Invoice
 * @author Gilbert Lauren
 * @version 3 April 2021
 */
public class BankPayment extends Invoice
{
    private static final PaymentType PAYMENT_TYPE = PaymentType.BankPayment;
    private int adminFee;
    /**
     * Constructor for objects of class BankPayment
     */
    public BankPayment(int id, Job job, String date, Jobseeker jobseeker, InvoiceStatus invoiceStatus)
    {
        super(id, job, date, jobseeker, invoiceStatus);
    }
    public BankPayment(int id, Job job, String date, Jobseeker jobseeker, InvoiceStatus invoiceStatus, int adminFee)
    {
        super(id, job, date, jobseeker, invoiceStatus);
        this.adminFee = adminFee;
    }
    /**
     * merupakan getter getPaymentType dari BankPayment
     * @return PAYMENT_TYPE
     */
    public PaymentType getPaymentType (){
        return PAYMENT_TYPE;
    }
    /**
     * merupakan getter AdminFee dari BankPayment
     * @return adminFee
     */
    public int getAdminFee (){
        return adminFee;
    }
    /**
     * merupakan setter AdminFee dari BankPayment
     * @param AdminFee
     */
    public void setAdminFee (int adminFee) {
        this.adminFee = adminFee;
    }
    /**
     * merupakan setter TotalFee dari BankPayment
     * @param TotalFee
     */
    public void setTotalFee() {
        if (adminFee != 0) {
            super.totalFee = super.getJob().getFee() - adminFee;
            } else {
            super.totalFee = super.getJob().getFee();
        }
    }
    public void printData(){
        System.out.println("=============== INVOICE ===============");
        System.out.println("ID: " + super.getId());
        System.out.println("Job: " + super.getJob().getId());
        System.out.println("Date: " + super.getDate());
        System.out.println("Jobseeker: " + super.getJobseeker().getName());
        System.out.println("Admin Fee: " + adminFee);
        System.out.println("Total Fee: " + totalFee);
        System.out.println("Status: " + super.getInvoiceStatus().toString());
        System.out.println("Payment Type: " + getPaymentType().toString());
    }
}