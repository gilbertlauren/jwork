import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Merupakan file class untuk DatabaseJob
 * @author Gilbert Lauren
 * @version 26 Maret 2021
 */
public class DatabaseRecruiter
{
    private static ArrayList<Recruiter> RECRUITER_DATABASE;
    private static int lastId;

    public static ArrayList<Recruiter> getRecruiterDatabase(){
        return RECRUITER_DATABASE;
    }
    public static int getLastId(){
        return lastId;
    }
    public static Recruiter getRecruiterById(int id) {
        for (Recruiter recruiter : RECRUITER_DATABASE) {
            if (recruiter.getId() == id) {
                return recruiter;
            }
        }
        return null;
    }
    public static boolean addRecruiter(Recruiter recruiter) {
        RECRUITER_DATABASE.add(recruiter);
        lastId=recruiter.getId();
        return false;
    }
    public static boolean removeRecruiter(int id) {
        for (Recruiter recruiter : RECRUITER_DATABASE) {
            if (recruiter.getId()==id) {
                RECRUITER_DATABASE.remove(recruiter);
                return true;
            }
        }
        return false;
    }
}
