package gilbertlauren.jwork;
import java.lang.reflect.Array;
import java.util.GregorianCalendar;
import java.util.Calendar;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * The main class of JWork
 *
 * @author Gilbert Lauren
 * @version 03/18/2021
 */
@SpringBootApplication
public class JWork {
    public static void main(String args[]) {
        SpringApplication.run(JWork.class, args);
//        Location lokasi1 = new Location("Jawa Barat", "Bekasi", "Bekasi Selatan");
//        Location lokasi2 = new Location("DKI Jakarta", "Jakarta", "Kota Jakarta");
//        Location lokasi3 = new Location("Sumatra Utara", "Medan", "Horas");
//
//
//        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1,
//                "Gilbert",
//                "gilbert.lauren@ui.ac.id",
//                "081910102929",
//                lokasi1));
//        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1,
//                "Gilbert Lauren",
//                "gilbert.lauren29@gmail.com",
//                "14045",
//                lokasi2));
//        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1,
//                "Lauren",
//                "lauren@gmail.com",
//                "1234567890",
//                lokasi3));
//
//        try {
//            DatabaseJob.addJob(new Job(DatabaseJob.getLastId() + 1,
//                    DatabaseRecruiter.getRecruiterById(1),
//                    "Front End Dev",
//                    25000,
//                    JobCategory.FrontEnd));
//            DatabaseJob.addJob(new Job(DatabaseJob.getLastId() + 1,
//                    DatabaseRecruiter.getRecruiterById(1),
//                    "Data Analyst",
//                    15000,
//                    JobCategory.DataAnalyst));
//            DatabaseJob.addJob(new Job(DatabaseJob.getLastId() + 1,
//                    DatabaseRecruiter.getRecruiterById(2),
//                    "Back End",
//                    20000,
//                    JobCategory.BackEnd));
//            DatabaseJob.addJob(new Job(DatabaseJob.getLastId() + 1,
//                    DatabaseRecruiter.getRecruiterById(3),
//                    "Back End2",
//                    30000,
//                    JobCategory.BackEnd));
//        } catch (RecruiterNotFoundException e) {
//            System.out.println(e.getMessage());
//        }

//        Calendar calendar = new GregorianCalendar(2021, 3, 8);
//        try {
//            DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Gilbert Lauren", "gilbert.lauren29@gmail.com", "Password123*"));
//            DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Gilbert Lauren", "gilbert.lauren29@gmail.com", "Password123*"));
//        } catch (EmailAlreadyExistsException e) {
//            System.out.println(e.getMessage());
//        }
//        try {
////            DatabaseBonus.addBonus(new Bonus(DatabaseBonus.getLastId() + 1, "lele", 50000, 5000000, false));
//            DatabaseBonus.addBonus(new Bonus(DatabaseBonus.getLastId() + 1, "lele", 5000, 20000, true));
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