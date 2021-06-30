package gilbertlauren.jwork;
import java.util.ArrayList;

/**
 * Contains the list of jobs that are available
 *
 * @author Gilbert Lauren
 * @version 03/26/2021
 */
public class DatabaseJob
{
    private static ArrayList<Job> JOB_DATABASE = new ArrayList<>();
    private static int lastId = 0;

    public static ArrayList<Job> getJobDatabase() {
        return JOB_DATABASE;
    }

    public static int getLastId() {
        return lastId;
    }

    public static Job getJobById(int id) throws JobNotFoundExecption {
        for (Job job : JOB_DATABASE) {
            if (job.getId() == id) {
                return job;
            }
        }
        throw new JobNotFoundExecption(id);
    }

    public static ArrayList<Job> getJobByRecruiter(int recruiterId) {
        ArrayList<Job> joblist = new ArrayList<>();
        for (Job job : JOB_DATABASE) {
            if (job.getRecruiter().getId() == recruiterId) {
                joblist.add(job);
            }
        }
        if (joblist.isEmpty()) {
            return null;
        } else {
            return joblist;
        }
    }

    public static ArrayList<Job> getJobByCategory(JobCategory category) {
        ArrayList<Job> jobList = new ArrayList<>();
        for (Job job : JOB_DATABASE) {
            if (job.getCategory() == category) {
                jobList.add(job);
            }
        }
        if (jobList.isEmpty()) {
            return null;
        } else {
            return jobList;
        }
    }
    /**
     * Add a job in DatabaseJob Class
     *
     * @return boolean false for now
     */
    public static boolean addJob(Job job) {
        JOB_DATABASE.add(job);
        lastId = job.getId();
        return true;
    }
    /**
     * Removes a job in DatabaseJob Class
     *
     * @return boolean false for now
     */
    public static boolean removeJob(int id) throws JobNotFoundExecption {
        for (Job job : JOB_DATABASE) {
            if (job.getId() == id) {
                JOB_DATABASE.remove(job);
                return true;
            }
        }
        throw new JobNotFoundExecption(id);
    }
}
