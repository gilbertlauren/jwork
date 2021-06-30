package gilbertlauren.jwork;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * Subclass of Invoice, defining payment using E-Wallet
 *
 * @author Gilbert Lauren
 * @version 04/01/2021
 */
public class EwalletPayment extends Invoice {
    private static final PaymentType PAYMENT_TYPE = PaymentType.EwalletPayment;
    private Bonus bonus;

    /**
     * Constructor of EwalletPayment Class (subclass of Invoice)
     *
     * @param id        id of Invoice
     * @param jobs      Job's id of Invoice
     * @param jobseeker Jobseeker class of Invoice
     * @see Jobseeker
     * @see Invoice
     */
    public EwalletPayment(int id, ArrayList<Job> jobs, Jobseeker jobseeker) {
        super(id, jobs, jobseeker);
    }

    /**
     * Constructor of EwalletPayment Class (subclass of Invoice) with Bonus
     *
     * @param id        id of Invoice
     * @param jobs      Job's id of Invoice
     * @param jobseeker Jobseeker class of Invoice
     * @param bonus     Bonus class of Invoice
     * @see Jobseeker
     * @see Invoice
     */
    public EwalletPayment(int id, ArrayList<Job> jobs, Jobseeker jobseeker, Bonus bonus) {
        super(id, jobs, jobseeker);
        this.bonus = bonus;
    }

    /**
     * Accessor of PAYMENT_TYPE in EwalletPayment Class
     *
     * @return Bonus returns the type of payment (EwalletPayment)
     */
    public PaymentType getPaymentType() {
        return PAYMENT_TYPE;
    }

    /**
     * Accessor of field "bonus" in EwalletPayment Class
     *
     * @return Bonus returns the bonus class of an Invoice with EwalletPayment type
     */
    public Bonus getBonus() {
        return bonus;
    }

    /**
     * Mutator of field "bonus" in EwalletPayment Class
     *
     * @param bonus new Bonus for an Invoice with EwalletPayment type
     */
    public void setBonus(Bonus bonus) {
        this.bonus = bonus;
    }
    /**
     * Set the value of totalFee, determined by the existance of bonus and whether the bonus is applicaple
     */
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
    /**
     * Prints out the data of Invoice, include Referral Code when applicable
     */
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
