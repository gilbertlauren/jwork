
/**
 * Merupakan file class untuk DatabaseJobseeker
 * @author Gilbert Lauren
 * @version 26 Maret 2021
 */
public class DatabaseJobseeker /** inisiasi class */
{
    private static String[] listJobseeker;
    /**
     * Constructor for objects of class DatabaseJobseeker
     */
    public DatabaseJobseeker(String[] listJobseeker) {
        this.listJobseeker = listJobseeker;
    }
    public static boolean addJobseeker (Jobseeker jobseeker){
        return false;
    }
    public static boolean removeJobseeker (Jobseeker jobseeker){
        return false;
    }
    public static Jobseeker getJobseeker() {
        return null;
    }
    public static String[] getListJobseeker() {
        return listJobseeker;
    }
}
