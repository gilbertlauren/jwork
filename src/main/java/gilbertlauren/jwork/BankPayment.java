package gilbertlauren.jwork;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * Subclass of Invoice, defining payment using Bank Payment
 *
 * @author Gilbert Lauren
 * @version 04/03/2021
 */
public class BankPayment extends Invoice {
    private static final PaymentType PAYMENT_TYPE = PaymentType.BankPayment;
    private int adminFee;

    /**
     * Constructor of BankPayment
     *
     * @param id        id of Invoice
     * @param jobs      Job in Invoice
     * @param jobseeker Jobseeker in Invoice
     */
    public BankPayment(int id, ArrayList<Job> jobs, Jobseeker jobseeker) {
        super(id, jobs, jobseeker);
    }
    /**
     * Constructor of BankPayment with admin fees
     *
     * @param id        id of Invoice
     * @param jobs      Job in Invoice
     * @param jobseeker Jobseeker in Invoice
     * @param adminFee  admin fee
     */
    public BankPayment(int id, ArrayList<Job> jobs, Jobseeker jobseeker, int adminFee) {
        super(id, jobs, jobseeker);
        this.adminFee = adminFee;
    }

    /**
     * Returns the type of payment (Bank Payment)
     *
     * @return PaymentType
     */
    public PaymentType getPaymentType() {
        return PAYMENT_TYPE;
    }

    /**
     * Accessor of adminFee in BankPayment
     *
     * @return int adminFee
     */
    public int getAdminFee() {
        return adminFee;
    }

    /**
     * Mutator of adminFee in BankPayment
     *
     * @param adminFee
     */
    public void setAdminFee(int adminFee) {
        this.adminFee = adminFee;
    }

    /**
     * Sets whether adminFee should be applied to totalFee
     */
    public void setTotalFee()
    {
        int totalJobFee = 0;
        for(int i=0; i< getJobs().size();i++){
            totalJobFee = totalJobFee + getJobs().get(i).getFee();
        }
        if (getAdminFee() != 0)
        {
            this.totalFee = (totalJobFee - getAdminFee());
        }
        else
        {
            this.totalFee = totalJobFee;
        }
    }
    /**
     * returns the current data in Invoice
     *
     * @return string
     */
    public String toString()
    {
        SimpleDateFormat format1 = new SimpleDateFormat("dd MMMM yyyy");
        String date1 = format1.format(getDate().getTime());
        String jobIn = "";
        for(int i=0; i<getJobs().size();i++){
            jobIn = jobIn + getJobs().get(i).getName() + " ";
        }
        return "\n================INVOICE================\n" +
                "ID: " + getId() +
                "\nJob: " + jobIn +
                "\nDate: " + date1 +
                "\nJobseeker: " + getJobseeker().getName() +
                "\nAdmin Fee: " + getAdminFee() +
                "\nTotal Fee: " + totalFee +
                "\nStatus: " + getInvoiceStatus() +
                "\nPayment Type: " + getPaymentType();

    }
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
        //return listJobs;

