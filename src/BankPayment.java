import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * Merupakan file subclass untuk Invoice
 * @author Gilbert Lauren
 * @version 3 April 2021
 */
public class BankPayment extends Invoice {
    private static final PaymentType PAYMENT_TYPE = PaymentType.BankPayment;
    private int adminFee;

    /**
     * Constructor for objects of class BankPayment
     */
    public BankPayment(int id, ArrayList<Job> jobs, Jobseeker jobseeker) {
        super(id, jobs, jobseeker);
    }

    public BankPayment(int id, ArrayList<Job> jobs, Jobseeker jobseeker, int adminFee) {
        super(id, jobs, jobseeker);
        this.adminFee = adminFee;
    }

    /**
     * merupakan getter getPaymentType dari BankPayment
     *
     * @return PAYMENT_TYPE
     */
    public PaymentType getPaymentType() {
        return PAYMENT_TYPE;
    }

    /**
     * merupakan getter AdminFee dari BankPayment
     *
     * @return adminFee
     */
    public int getAdminFee() {
        return adminFee;
    }

    /**
     * merupakan setter AdminFee dari BankPayment
     *
     * @param AdminFee
     */
    public void setAdminFee(int adminFee) {
        this.adminFee = adminFee;
    }

    /**
     * merupakan setter TotalFee dari BankPayment
     *
     * @param TotalFee
     */
    public void setTotalFee() {
        for (Job job : super.getJobs()) {
            super.totalFee += job.getFee();
        }
        if (adminFee != 0) {
            super.totalFee -= adminFee;
        }
    }

    public String toString() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMMM yyyy");
        String listJobs = "";
        for (Job job : super.getJobs()) {
            listJobs += job.getId() + " ";
            return
                    "\nId = " + super.getId() +
                            "\nId Job = " + listJobs +
                            "\nDate = " + simpleDateFormat.format(super.getDate().getTime()) +
                            "\nJobseeker= " + super.getJobseeker().getName() +
                            "\nAdmin Fee= " + adminFee +
                            "\nTotal Fee= " + totalFee +
                            "\nStatus = " + super.getInvoiceStatus() +
                            "\nPaymentType = " + getPaymentType();
        }
        //public void printData(){
        //    System.out.println("=============== INVOICE ===============");
        //    System.out.println("ID: " + super.getId());
        //    System.out.println("Job: " + super.getJob().getId());
        //    System.out.println("Date: " + super.getDate());
        //    System.out.println("Jobseeker: " + super.getJobseeker().getName());
        //    System.out.println("Admin Fee: " + adminFee);
        //    System.out.println("Total Fee: " + totalFee);
        //   System.out.println("Status: " + super.getInvoiceStatus().toString());
        //    System.out.println("Payment Type: " + getPaymentType().toString());
        //}
        return listJobs;
    }
}