package gilbertlauren.jwork;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Contains the list of recruiters that are available
 *
 * @author Gilbert Lauren
 * @version 3/26/2021
 */
public class DatabaseRecruiter
{
    private static ArrayList<Recruiter> RECRUITER_DATABASE = new ArrayList<>();
    private static int lastId = 0;

    public static ArrayList<Recruiter> getRecruiterDatabase(){
        return RECRUITER_DATABASE;
    }
    public static int getLastId(){
        return lastId;
    }
    public static Recruiter getRecruiterById(int id) throws RecruiterNotFoundException{
        for (Recruiter recruiter : RECRUITER_DATABASE) {
            if (recruiter.getId() == id) {
                return recruiter;
            }
        }
        throw new RecruiterNotFoundException(id);
    }
    /**
     * Adds a Recruiter in DatabaseRecruiter Class
     *
     * @return boolean false for now
     */
    public static boolean addRecruiter(Recruiter recruiter) {
        RECRUITER_DATABASE.add(recruiter);
        lastId=recruiter.getId();
        return true;
    }
    /**
     * Removes a Recruiter in DatabaseRecruiter Class
     *
     * @return boolean false for now
     */
    public static boolean removeRecruiter(int id) throws RecruiterNotFoundException{
        for (Recruiter recruiter : RECRUITER_DATABASE) {
            if (recruiter.getId()==id) {
                RECRUITER_DATABASE.remove(recruiter);
                return true;
            }
        }
        throw new RecruiterNotFoundException(id);
    }
}
