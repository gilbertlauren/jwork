package gilbertlauren.jwork;
import java.util.ArrayList;

/**
 * Merupakan file class untuk DatabaseBonus
 * @author Gilbert Lauren
 * @version 1 April 2021
 */
public class DatabaseBonus {
    private static ArrayList<Bonus> BONUS_DATABASE = new ArrayList<>();
    private static int lastId = 0;

    /**
     * Constructor for objects of class Bonus
     */
    public static ArrayList<Bonus> getBonusDatabase() {
        return BONUS_DATABASE;
    }

    public static int getLastId() {
        return lastId;
    }

    public static Bonus getBonusById(int id) throws BonusNotFoundException{
        for (Bonus bonus : BONUS_DATABASE) {
            if (bonus.getId() == id) {
                return bonus;
            }
        }
        throw new BonusNotFoundException(id);
    }

    public static Bonus getBonusByReferralCode(String referralCode) {
        for (Bonus bonus : BONUS_DATABASE) {
            if (bonus.getReferralCode().equals(referralCode)) {
                return bonus;
            }
        }
        return null;
    }

    public static boolean ActiveBonus(int id) {
        for (Bonus bonus : BONUS_DATABASE) {
            if (bonus.getId() == id) {
                bonus.setActive(true);
                return true;
            }
        }
        return false;
    }

    public static boolean deactivateBonus(int id) {
        for (Bonus bonus : BONUS_DATABASE) {
            if (bonus.getId() == id) {
                bonus.setActive(false);
                return true;
            }
        }
        return false;
    }
    public static boolean addBonus(Bonus bonus) throws ReferralCodeAlreadyExistsException {
            for (Bonus bonusList: BONUS_DATABASE) {
                if (bonusList.getReferralCode().equals(bonus.getReferralCode())) {
                    throw new ReferralCodeAlreadyExistsException(bonus);
                }
            }
            BONUS_DATABASE.add(bonus);
            lastId = bonus.getId();
            return true;
        }
    public static boolean removeBonus(int id) throws BonusNotFoundException{
        for (Bonus bonus : BONUS_DATABASE) {
            if (bonus.getId() == id) {
                BONUS_DATABASE.remove(bonus);
                return true;
            }
        }
        throw new BonusNotFoundException(id);
    }
}
