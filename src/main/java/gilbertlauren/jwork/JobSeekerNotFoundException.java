package gilbertlauren.jwork;
/**
 * Exception when Jobseeker is not found
 *
 * @author Gilbert Lauren
 * @version 06/28/2021
 */
public class JobSeekerNotFoundException extends Exception {

    private int jobseeker_error;

    public JobSeekerNotFoundException(int jobseeker_input) {
        super("Jobseeker ID: ");
        jobseeker_error = jobseeker_input;
    }
    @Override
    public String getMessage() {
        return super.getMessage() + jobseeker_error + " not found";
    }
}

