
/**
 * Merupakan file class untuk DatabaseBonus
 * @author Gilbert Lauren
 * @version 1 April 2021
 */
public class DatabaseBonus
{
    private static String[] listBonus;
    /**
     * Constructor for objects of class DatabaseBonus
     */
    public DatabaseBonus(String[] listBonus){
        this.listBonus=listBonus;
    }
    public static boolean addBonus (Bonus bonus){
        return false;
    }
    public static boolean removeBonus (Bonus bonus){
        return false;
    }
    public static Bonus getBonus() {
        return null;
    }
    public static String[] getListBonus() {
        return listBonus;
    }
}
