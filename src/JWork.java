import java.util.GregorianCalendar;
import java.util.Calendar;

/**
 * Merupakan file class untuk Jwork
 * @author Gilbert Lauren
 * @version 26 Maret 2021
 */
/** Merupakan inisiasi class untuk JWork */
public class JWork 
{
    public static void main (String args[]){
        Calendar calendar = new GregorianCalendar(2021, 3, 8);
        
        //    Jobseeker jobseeker1 = new Jobseeker(1, "Gilbert Lauren", ".gilbert.lauren29@gmail.com", "akusukaOOP123", calendar);
        //    Jobseeker jobseeker2 = new Jobseeker(1, "Gilbert Lauren", "gilbertlauren29@gmail.com", "akusukaOOP123", 2021, 3, 8);
        //    Jobseeker jobseeker3 = new Jobseeker(1, "Gilbert Lauren", "gilbert.lauren29@gmail.com", "akusukaOOP123");
        //    System.out.println(jobseeker1.toString());
        //    System.out.println(jobseeker2.toString());
        //    System.out.println(jobseeker3.toString());
        
        Location location1 = new Location("Jawa Barat","Kota Bekasi","Kecamatan Bekasi Selatan");
        Recruiter recruiter1 = new Recruiter(29,"Geraldy Christanto","siapa@gmail.com","14045",location1);
        Job job1 = new Job(1,"Web Developer",recruiter1,5000000,JobCategory.WebDeveloper);
        //Job job2 = new Job(2,"Back End",recruiter1,7000000,JobCategory.BackEnd);
        Jobseeker jobseeker1 = new Jobseeker(1,"Gilbert Lauren","gilbert.lauren29@gmail.com","081910102929");
        //Bonus bonus1 = new Bonus(1,"lele",500000,6000000,true);
        EwalletPayment ewalletpayment1 = new EwalletPayment(1,job1,jobseeker1,InvoiceStatus.Finished);
        //EwalletPayment ewalletpayment2 = new EwalletPayment(2,job1,"1 April 2021",jobseeker1, bonus1, InvoiceStatus.OnGoing);
        //EwalletPayment ewalletpayment3 = new EwalletPayment(3,job2,"1 April 2021",jobseeker1, bonus1, InvoiceStatus.OnGoing);
        //ewalletpayment1.setTotalFee();
        //ewalletpayment2.setTotalFee();
        //ewalletpayment3.setTotalFee();
        BankPayment bankpayment1 = new BankPayment(1,job1,jobseeker1, InvoiceStatus.Finished);
        System.out.println(ewalletpayment1.toString());
        System.out.println(bankpayment1.toString());
    }
}
