package gilbertlauren.jwork;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * Merupakan file subclass untuk Invoice
 * @author Gilbert Lauren
 * @version 1 April 2021
 */
public class EwalletPayment extends Invoice {
    private static final PaymentType PAYMENT_TYPE = PaymentType.EwalletPayment;
    private Bonus bonus;

    /**
     * Constructor for objects of class EwalletPayment
     */
    public EwalletPayment(int id, ArrayList<Job> jobs, Jobseeker jobseeker) {
        super(id, jobs, jobseeker);
    }

    public EwalletPayment(int id, ArrayList<Job> jobs, Jobseeker jobseeker, Bonus bonus) {
        super(id, jobs, jobseeker);
        this.bonus = bonus;
    }

    /**
     * merupakan getter getPaymentType dari EwalletPayment
     *
     * @return PAYMENT_TYPE
     */
    public PaymentType getPaymentType() {
        return PAYMENT_TYPE;
    }

    /**
     * merupakan getter getBonus dari EwalletPayment
     *
     * @return bonus
     */
    public Bonus getBonus() {
        return bonus;
    }

    /**
     * merupakan setter Bonus dari EwalletPayment
     *
     * @param bonus
     */
    public void setBonus(Bonus bonus) {
        this.bonus = bonus;
    }

    public void setTotalFee() {
        for (Job job : getJobs()){
            if (bonus != null) {
                if (bonus.getActive() && (job.getFee() > bonus.getMinTotalFee())) {
                    super.totalFee = job.getFee() + bonus.getExtraFee();
                } else {
                    super.totalFee = job.getFee();
                }
            }
        }
    }
    public String toString() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMMM yyyy");
        String listJobs = "";
        for (Job job : super.getJobs()) {
            listJobs += job.getId() + " ";
        }
        return
                        "\nId = " + super.getId() +
                        "\nId Job = " + listJobs +
                        "\nDate = " + simpleDateFormat.format(super.getDate().getTime()) +
                        "\nSeeker= " + super.getJobseeker().getName() +
                        "\nFee= " + super.totalFee +
                        "\nStatus = " + super.getInvoiceStatus() +
                        "\nPaymentType = " + getPaymentType();
    }
}
