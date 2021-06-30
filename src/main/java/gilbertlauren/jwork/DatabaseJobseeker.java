package gilbertlauren.jwork;
import java.util.ArrayList;

/**
 * Contains the list of Jobseekers.
 *
 * @author Gilbert Lauren
 * @version 03/25/2021
 */
public class DatabaseJobseeker
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

    public static Jobseeker getJobseekerById(int id) throws JobSeekerNotFoundException {
        for (Jobseeker jobseeker : JOBSEEKER_DATABASE) {
            if (jobseeker.getId() == id) {
                return jobseeker;
            }
        }
        throw new JobSeekerNotFoundException(id);
    }
    /**
     * Add jobseeker
     * @param jobseeker
     * @return
     * @throws EmailAlreadyExistsException
     */
    public static boolean addJobseeker(Jobseeker jobseeker) throws EmailAlreadyExistsException {
        for (Jobseeker DatabaseJobseeker : JOBSEEKER_DATABASE) {
            if (DatabaseJobseeker.getEmail().equals(jobseeker.getEmail())) {
                throw new EmailAlreadyExistsException(jobseeker);
            }
        }
        JOBSEEKER_DATABASE.add(jobseeker);
        lastId = jobseeker.getId();
        return true;
    }
    /**
     * Remove jobseeker
     * @param id
     * @return
     * @throws JobSeekerNotFoundException
     */
    public static boolean removeJobseeker(int id) throws JobSeekerNotFoundException {
        for (Jobseeker jobseeker : JOBSEEKER_DATABASE) {
            if (jobseeker.getId() == id) {
                JOBSEEKER_DATABASE.remove(id);
                return true;
            }
        }
        throw new JobSeekerNotFoundException(id);
    }
    /**
     * get jobseeeker login
     * @param email
     * @param password
     * @return
     */
    public static Jobseeker jobseekerLogin(String email, String password) {
        for (Jobseeker jobseeker : JOBSEEKER_DATABASE) {
            if (jobseeker.getEmail().equals(email) && jobseeker.getPassword().equals(password)) {
                return jobseeker;
            }
        }
        return null;
    }
}
