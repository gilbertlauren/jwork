package gilbertlauren.jwork;

public class JobNotFoundExecption extends Exception {

    private int jobseeker_error;

    public JobNotFoundExecption(int job_input) {
        super("Job ID: ");
        jobseeker_error = job_input;
    }
    @Override
    public String getMessage() {
        return super.getMessage() + jobseeker_error + " not found";
    }
}

