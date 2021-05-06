public class RecruiterNotFoundException extends Exception{
    private int recruiter_error;

    public RecruiterNotFoundException(int jobseeker_input) {
        super("Recruiter ID: ");
        recruiter_error = jobseeker_input;
    }
    @Override
    public String getMessage() {
        return super.getMessage() + recruiter_error + " not found";
    }
}
