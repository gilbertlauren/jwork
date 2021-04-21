
/**
 * Merupakan file class untuk Bonus
 * @author Gilbert Lauren
 * @version 1 April 2021
 */
public class Bonus
{
    private int id;
    private String referralCode;
    private int extraFee;
    private int minTotalFee;
    private boolean active;
    /**
     * Constructor for objects of class Bonus
     */
    public Bonus(int id, String referralCode, int extraFee, int minTotalFee, boolean active){
        this.id = id;
        this.referralCode = referralCode;
        this.extraFee = extraFee;
        this.minTotalFee = minTotalFee;
        this.active = active;
    }
    /**
     * merupakan getter Id dari Bonus
     * @return id
     */
    public int getId (){
        return id;
    }
    /**
     * merupakan getter ReferralCode dari Bonus
     * @return id
     */
    public String getReferralCode (){
        return referralCode;
    }
    /**
     * merupakan getter ExtraFee dari Bonus
     * @return id
     */
    public int getExtraFee (){
        return extraFee;
    }
    /**
     * merupakan getter MinTotalFee dari Bonus
     * @return id
     */
    public int getMinTotalFee (){
        return minTotalFee;
    }
    /**
     * merupakan getter Active dari Bonus
     * @return id
     */
    public boolean getActive (){
        return active;
    }
    /**
     * merupakan setter Id dari Bonus
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * merupakan setter ReferralCode dari Bonus
     * @param id
     */
    public void setReferralCode(String referralCode) {
        this.referralCode = referralCode;
    }
    /**
     * merupakan setter ExtraFee dari Bonus
     * @param id
     */
    public void setExtraFee(int extraFee) {
        this.extraFee = extraFee;
    }
    /**
     * merupakan setter MinTotalFee dari Bonus
     * @param id
     */
    public void setMinTotalFee(int minTotalFee) {
        this.minTotalFee = minTotalFee;
    }
    /**
     * merupakan setter Active dari Bonus
     * @param id
     */
    public void setActive(boolean active) {
        this.active = active;
    }
    /**
     * method untuk print dari Invoice
     * outputnya adalah berupa jumlah gaji
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
