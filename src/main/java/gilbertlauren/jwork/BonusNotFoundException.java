package gilbertlauren.jwork;
/**
 * Class for Exception when Bonus isn't found
 */
public class BonusNotFoundException extends Exception{
    private int bonus_error;
    /**
     * Constructor of Exception
     *
     * @param bonus_input input of id
     */
    public BonusNotFoundException (int bonus_input) {
        super("Bonus ID: ");
        bonus_error = bonus_input;
    }
    @Override
    /**
     * Return the message of error
     *
     * @return String error message
     */
    public String getMessage() {
        return super.getMessage() + bonus_error + " not found";
    }
}
