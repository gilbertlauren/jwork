import java.util.ArrayList;

/**
 * Merupakan file class untuk DatabaseJobseeker
 * @author Gilbert Lauren
 * @version 26 Maret 2021
 */
public class DatabaseJobseeker /** inisiasi class */
{
    private static ArrayList<Jobseeker> JOBSEEKER_DATABASE = new ArrayList<>();
    private static int lastId = 0;
    /**
     * Constructor for objects of class DatabaseJobseeker
     */
    public static ArrayList<Jobseeker> getDatabaseJobseeker() {
        return JOBSEEKER_DATABASE;
    }
    public static int getLastId() {
        return lastId;
    }
    public static Jobseeker getJobseekerById(int id) {
        for(Jobseeker jobseeker : JOBSEEKER_DATABASE) {
            if (jobseeker.getId() == id) {
                return jobseeker;
            }
        }
        return null;
    }
    public static boolean addJobseeker (Jobseeker jobseeker){
        for (Jobseeker DatabaseJobseeker : JOBSEEKER_DATABASE) {
            if (DatabaseJobseeker.getEmail().equals(jobseeker.getEmail())){
                return false;
            }
        }
        JOBSEEKER_DATABASE.add(jobseeker);
        lastId = jobseeker.getId();
        return true;
    }
    public static boolean removeJobseeker (int id){
        for (Jobseeker jobseeker: JOBSEEKER_DATABASE){
            if (jobseeker.getId() == id) {
                JOBSEEKER_DATABASE.remove(id);
                return true;
            }
        }
        return false;
    }
}
