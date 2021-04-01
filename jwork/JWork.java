
/**
 * Merupakan file class untuk Jwork
 * @author Gilbert Lauren
 * @version 26 Maret 2021
 */
/** Merupakan inisiasi class untuk JWork */
public class JWork 
{
    public static void main (String args[]){
        Location location1 = new Location("Jawa Barat","Kota Bekasi","Kecamatan Bekasi Selatan");
        Recruiter recruiter1 = new Recruiter(29,"Geraldy Christanto","siapa@gmail.com","14045",location1);
        Job job1 = new Job(1,"Web Developer",recruiter1,5000000,JobCategory.WebDeveloper);
        Job job2 = new Job(2,"Back End",recruiter1,7000000,JobCategory.BackEnd);
        Jobseeker jobseeker1 = new Jobseeker(1,"Gilbert Lauren","gilbert.lauren29@gmail.com","081910102929","18 Maret 2021");
        Bonus bonus1 = new Bonus(1,"lele",500000,6000000,true);
        EwalletPayment ewalletpayment1 = new EwalletPayment(1,job1,"1 April 2021",jobseeker1,InvoiceStatus.Finished);
        EwalletPayment ewalletpayment2 = new EwalletPayment(2,job1,"1 April 2021",jobseeker1, bonus1, InvoiceStatus.OnGoing);
        EwalletPayment ewalletpayment3 = new EwalletPayment(3,job2,"1 April 2021",jobseeker1, bonus1, InvoiceStatus.OnGoing);
        ewalletpayment1.setTotalFee();
        ewalletpayment2.setTotalFee();
        ewalletpayment3.setTotalFee();
        //EwalletPayment EwalletPayment3 = new EwalletPayment(3,
        //Invoice invoice1 = new Invoice(10,20,"27 Maret 2021",5000000,jobseeker1,PaymentType.BankPayment,InvoiceStatus.Finished);
        //location1.printData();
        //recruiter1.printData();
        //jobseeker1.printData();
        //job1.printData();
        //invoice1.printData();
        //bonus1.printData();
        ewalletpayment1.printData();
        ewalletpayment2.printData();
        ewalletpayment3.printData();
        //System.out.println("Job Category :" + JobCategory.Devops);
        //System.out.println("Payment type :" + PaymentType.EwalletPayment);
        //System.out.println("Invoice Status :" + InvoiceStatus.Finished);
    }
}
