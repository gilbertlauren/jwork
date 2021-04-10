import java.text.SimpleDateFormat;

/**
 * Merupakan file subclass untuk Invoice
 * @author Gilbert Lauren
 * @version 1 April 2021
 */
public class EwalletPayment extends Invoice
{
    private static final PaymentType PAYMENT_TYPE = PaymentType.EwalletPayment;
    private Bonus bonus;

    /**
     * Constructor for objects of class EwalletPayment
     */
    public EwalletPayment(int id, Job job, Jobseeker jobseeker, InvoiceStatus invoiceStatus)
    {
        super(id, job, jobseeker, invoiceStatus);
    }
    public EwalletPayment(int id, Job job, Jobseeker jobseeker,Bonus bonus, InvoiceStatus invoiceStatus)
    {
        super(id, job, jobseeker, invoiceStatus);
        this.bonus = bonus;
    }
    /**
     * merupakan getter getPaymentType dari EwalletPayment
     * @return PAYMENT_TYPE
     */
    public PaymentType getPaymentType (){
        return PAYMENT_TYPE;
    }
    /**
     * merupakan getter getBonus dari EwalletPayment
     * @return bonus
     */
    public Bonus getBonus (){
        return bonus;
    }
    /**
     * merupakan setter Bonus dari EwalletPayment
     * @param bonus
     */
    public void setBonus (Bonus bonus) {
        this.bonus = bonus;
    }
    /**
     * merupakan setter TotalFee dari EwalletPayment
     * @param TotalFee
     */
    public void setTotalFee() {
        if (bonus != null) {
                  if (bonus.getActive() && (super.getJob().getFee() > bonus.getMinTotalFee())) {
                super.totalFee = super.getJob().getFee() + bonus.getExtraFee();
            } else {
                super.totalFee = super.getJob().getFee();
            }
        } else {
                super.totalFee = super.getJob().getFee();
        }
    }
    public String toString() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMMM yyyy");
            return
               "\nId = " + super.getId() +
               "\nId Job = " + super.getJob().getId()+
               "\nDate = " + simpleDateFormat.format(super.getDate().getTime()) +
               "\nSeeker= " + super.getJobseeker().getName() +
               "\nFee= " + super.totalFee +
               "\nStatus = " + super.getInvoiceStatus() +
               "\nPaymentType = " + getPaymentType();
    //public void printData(){
    //    System.out.println("=============== INVOICE ===============");
    //    System.out.println("ID: " + super.getId());
    //    System.out.println("ID Job: " + super.getJob().getId());
    //    System.out.println("Date: " + super.getDate());
    //    System.out.println("Seeker: " + super.getJobseeker().getName());
    //    if (bonus != null && bonus.getActive() && (super.getJob().getFee() > bonus.getMinTotalFee())){
    //        System.out.println("Referal Code: " + bonus.getReferralCode());
    //    }
    //    System.out.println("Fee: " + super.totalFee);
    //    System.out.println("Status: " + super.getInvoiceStatus().toString());
    //    System.out.println("Payment Type: " + getPaymentType().toString());
    }
}
