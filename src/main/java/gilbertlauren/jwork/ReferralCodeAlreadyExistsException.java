package gilbertlauren.jwork;
/**
 * Exception when ReferralCode is not found
 *
 * @author Gilbert Lauren
 * @version 06/28/2021
 */
public class ReferralCodeAlreadyExistsException extends Exception{
    private Bonus referral_error;

    public ReferralCodeAlreadyExistsException(Bonus referral_input) {
        super("Referral Code: ");
        referral_error = referral_input;
    }
    @Override
    public String getMessage() {
        return super.getMessage() + referral_error.getReferralCode() + " already exists.";
    }
}
