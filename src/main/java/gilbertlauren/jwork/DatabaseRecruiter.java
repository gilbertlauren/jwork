package gilbertlauren.jwork;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Merupakan file class untuk DatabaseJob
 * @author Gilbert Lauren
 * @version 26 Maret 2021
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
    public static boolean addRecruiter(Recruiter recruiter) {
        RECRUITER_DATABASE.add(recruiter);
        lastId=recruiter.getId();
        return true;
    }
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
