import java.lang.reflect.Array;
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
        
        Location location1 = new Location("Jawa Barat","Kota Bekasi","Kecamatan Bekasi Selatan");
        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId()+1,"Geraldy Christanto","Geraldy.Christanto@ui.ac.id","14045",location1));
        DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId()+1,"Gilbert Lauren","gilbert.lauren29@gmail.com","123"));
        DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId()+1,"Gilbert Lauren","gilbert.lauren29@gmail.com","123"));
        DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId()+1,"Geraldy Christanto","Geraldy.Christanto@ui.ac.id","123"));
        DatabaseJob.addJob(new Job(DatabaseJob.getLastId()+1,"Web Developer",DatabaseRecruiter.getRecruiterById(1),5000000,JobCategory.WebDeveloper));
        DatabaseJob.addJob(new Job(DatabaseJob.getLastId()+1,"Web Developer",DatabaseRecruiter.getRecruiterById(1),5000000,JobCategory.WebDeveloper));
        DatabaseJob.addJob(new Job(DatabaseJob.getLastId()+1,"Web Developer",DatabaseRecruiter.getRecruiterById(1),5000000,JobCategory.Devops));
        System.out.println("======List Jobseeker======");
        for (Jobseeker jobseeker: DatabaseJobseeker.getDatabaseJobseeker()) {
            System.out.println(jobseeker.toString());
        }
        System.out.println("\n\n======List Job======");
        for (Job job: DatabaseJob.getJobByCategory(JobCategory.WebDeveloper)) {
            System.out.println(job.toString());
        }
    }
}
