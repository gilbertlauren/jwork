package gilbertlauren.jwork;

/**
 * Exception when email already exist in database
 *
 * @author Gilbert Lauren
 * @version 06/28/2021
 */
public class EmailAlreadyExistsException extends Exception{
    private Jobseeker jobseeker_error;

    public EmailAlreadyExistsException (Jobseeker jobseeker_input) {
        super("Recruiter ID: ");
        jobseeker_error = jobseeker_input;
    }
    @Override
    public String getMessage() {
        return super.getMessage() + jobseeker_error.getEmail() + " already exists. ";
    }
}
