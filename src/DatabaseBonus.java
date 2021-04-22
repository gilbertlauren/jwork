import java.util.ArrayList;

/**
 * Merupakan file class untuk DatabaseBonus
 * @author Gilbert Lauren
 * @version 1 April 2021
 */
public class DatabaseBonus {
    private ArrayList<Bonus> BONUS_DATABASE;
    private int lastId;

    /**
     * Constructor for objects of class Bonus
     */
    public ArrayList<Bonus> getBonusDatabase() {
        return BONUS_DATABASE;
    }

    public int getLastId() {
        return lastId;
    }

    public Bonus getBonusById(int id) {
        for (Bonus bonus : BONUS_DATABASE) {
            if (bonus.getId() == id) {
                return bonus;
            }
        }
        return null;
    }

    public Bonus getBonusByReferralCode(String referralCode) {
        for (Bonus bonus : BONUS_DATABASE) {
            if (bonus.getReferralCode().equals(referralCode)) {
                return bonus;
            }
        }
        return null;
    }

    public boolean ActiveBonus(int id) {
        for (Bonus bonus : BONUS_DATABASE) {
            if (bonus.getId() == id) {
                bonus.setActive(true);
                return true;
            }
        }
        return false;
    }

    public boolean deactivateBonus(int id) {
        for (Bonus bonus : BONUS_DATABASE) {
            if (bonus.getId() == id) {
                bonus.setActive(false);
                return true;
            }
        }
        return false;
    }

    public boolean removeBonus(int id) {
        for (Bonus bonus : BONUS_DATABASE) {
            if (bonus.getId() == id) {
                BONUS_DATABASE.remove(bonus);
                return true;
            }
        }
        return false;
    }
}
