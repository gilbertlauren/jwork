package gilbertlauren.jwork;
/**
 * Define a bonus to be applicable using Referral Code
 *
 * @author Gilbert Lauren
 * @version 04/01/2021
 */
public class Bonus
{
    private int id;
    private String referralCode;
    private int extraFee;
    private int minTotalFee;
    private boolean active;
    /**
     * Constructor of Bonus Class
     *
     * @param id           ID of Bonus
     * @param referralCode Referral Code of Bonus
     * @param extraFee     Extra fee of Bonus
     * @param minTotalFee  Minimal Total Fee class of Bonus
     * @param active       Boolean value for Bonus's availablility
     * @see Jobseeker
     */
    public Bonus(int id, String referralCode, int extraFee, int minTotalFee, boolean active){
        this.id = id;
        this.referralCode = referralCode;
        this.extraFee = extraFee;
        this.minTotalFee = minTotalFee;
        this.active = active;
    }
    /**
     * Accessor of field "id" in Bonus Class
     *
     * @return int returns the id of an Bonus
     */
    public int getId (){
        return id;
    }
    /**
     * Accessor of field "referralCode" in Bonus Class
     *
     * @return String returns the referral code of an Bonus
     */
    public String getReferralCode (){
        return referralCode;
    }
    /**
     * Accessor of field "extraFee" in Bonus Class
     *
     * @return int returns the extra fee of an Bonus
     */
    public int getExtraFee (){
        return extraFee;
    }
    /**
     * Accessor of field "minTotalFee" in Bonus Class
     *
     * @return int returns the minimum total fee of an Bonus
     */
    public int getMinTotalFee (){
        return minTotalFee;
    }
    /**
     * Accessor of field "active" in Bonus Class
     *
     * @return boolean returns wheter Bonus is available or not
     */
    public boolean getActive (){
        return active;
    }
    /**
     * Mutator of field "id" in Bonus Class
     *
     * @param id ID of a Bonus
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * Mutator of field "referralCode" in Bonus Class
     *
     * @param referralCode the referral code of a Bonus
     */
    public void setReferralCode(String referralCode) {
        this.referralCode = referralCode;
    }
    /**
     * Mutator of field "extraFee" in Bonus Class
     *
     * @param extraFee the extra fee of a Bonus
     */
    public void setExtraFee(int extraFee) {
        this.extraFee = extraFee;
    }
    /**
     * Mutator of field "minTotalFee" in Bonus Class
     *
     * @param minTotalFee the minimal total fee of a Bonus
     */
    public void setMinTotalFee(int minTotalFee) {
        this.minTotalFee = minTotalFee;
    }
    /**
     * Mutator of field "active"  in Invoice Class
     *
     * @param active wheter Bonus is available or not
     */
    public void setActive(boolean active) {
        this.active = active;
    }
    /**
     * Prints out the data of Bonus
     */
    //public void printData() {
    //    System.out.println("ID :" + getId());
    //    System.out.println("Referral Code :" + getReferralCode());
    //    System.out.println("Extra Fee :" + getExtraFee());
    //    System.out.println("Min Total Fee :" + getMinTotalFee());
    //    System.out.println("Active :" + getActive());
    //}
    public String toString() {
        return "Id = " + getId() +
                "\nReferral Code = " + getReferralCode() +
                "\nExtra Fee = " + getExtraFee() +
                "\nMin Total Fee = " + getMinTotalFee() +
                "\nActive status = " + getActive();
    }
}