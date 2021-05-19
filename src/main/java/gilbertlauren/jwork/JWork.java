package gilbertlauren.jwork;
import java.lang.reflect.Array;
import java.util.GregorianCalendar;
import java.util.Calendar;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * Merupakan file class untuk Jwork
 * @author Gilbert Lauren
 * @version 26 Maret 2021
 */
/** Merupakan inisiasi class untuk JWork */
@SpringBootApplication
public class JWork {
    public static void main(String args[]) {
        SpringApplication.run(JWork.class, args);

//        Calendar calendar = new GregorianCalendar(2021, 3, 8);
//        try {
//            DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Gilbert Lauren", "gilbert.lauren29@gmail.com", "Password123*"));
//            DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Gilbert Lauren", "gilbert.lauren29@gmail.com", "Password123*"));
//        } catch (EmailAlreadyExistsException e) {
//            System.out.println(e.getMessage());
//        }
//        try {
//            DatabaseBonus.addBonus(new Bonus(DatabaseBonus.getLastId() + 1, "lele", 50000, 5000000, false));
//            DatabaseBonus.addBonus(new Bonus(DatabaseBonus.getLastId() + 1, "lele", 50000, 5000000, true));
//        } catch (ReferralCodeAlreadyExistsException e) {
//            System.out.println(e.getMessage());
//        }
//        try {
//            DatabaseJobseeker.getJobseekerById(3);
//        } catch (JobSeekerNotFoundException e) {
//            System.out.println(e.getMessage());
//        }
//        try {
//            DatabaseBonus.getBonusById(3);
//        } catch (BonusNotFoundException e) {
//            System.out.println(e.getMessage());
//        }
//        try {
//            DatabaseRecruiter.getRecruiterById(3);
//        } catch (RecruiterNotFoundException e) {
//            System.out.println(e.getMessage());
//        }
//        try {
//            DatabaseJob.getJobById(3);
//        } catch (JobNotFoundExecption e) {
//            System.out.println(e.getMessage());
//        }
//        try{
//            DatabaseInvoice.addInvoice(new BankPayment(DatabaseInvoice.getLastId() +1, DatabaseJob.getJobDatabase(), DatabaseJobseeker.getJobseekerById(1),10000));
//            DatabaseInvoice.addInvoice(new BankPayment(DatabaseInvoice.getLastId() +1, DatabaseJob.getJobDatabase(), DatabaseJobseeker.getJobseekerById(1),10000));
//            DatabaseInvoice.addInvoice(new BankPayment(DatabaseInvoice.getLastId() +1, DatabaseJob.getJobDatabase(), DatabaseJobseeker.getJobseekerById(1),10000));
//        } catch (JobSeekerNotFoundException | OngoingInvoiceAlreadyExistsException e) {
//            System.out.println(e.getMessage());
//        }
//        try {
//            DatabaseInvoice.getInvoiceById(3);
//        } catch (InvoiceNotFoundExecption e) {
//            System.out.println(e.getMessage());
//        }
//        System.out.println("\n\n======Database Bonus======");
//        for (Bonus bonus : DatabaseBonus.getBonusDatabase()) {
//            System.out.println(bonus.toString());
//        }
//        for (Invoice invoice:DatabaseInvoice.getInvoiceDatabase()) {
//            FeeCalculator temp = new FeeCalculator(invoice);
//            temp.start();
//        }
//        for (Invoice invoice : DatabaseInvoice.getInvoiceDatabase()) {
//            System.out.println(invoice.toString());
//        }
    }
}