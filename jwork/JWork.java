
/**
 * @author Gilbert Lauren
 * @version 18 Maret 2021
 */
public class JWork
{
    public static void main (String args[]){
        Location location1 = new Location("Jawa Barat","Kota Bekasi","Kecamatan Bekasi Selatan","");
        Recruiter recruiter1 = new Recruiter(29,"Geraldy Christanto","siapa@gmail.com","14045",location1,"");
        Job job1 = new Job(1,"Developers",recruiter1,5000000,"Jakarta",JobCategory.BackEnd);
        Jobseeker jobseeker1 = new Jobseeker(1,"Gilbert Lauren","gilbert.lauren29@gmail.com","081910102929","18 Maret 2021", "");
        Invoice invoice1 = new Invoice(10,20,"18 Maret 2021",5000000,jobseeker1, "");
        //location1.printData();
        //recruiter1.printData();
        //jobseeker1.printData();
        job1.printData();
        //invoice1.printData();
        //System.out.println("Job Category :" + JobCategory.Devops);
        //System.out.println("Payment type :" + PaymentType.EwalletPayment);
    }
}
