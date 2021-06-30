package gilbertlauren.jwork.controller;

import gilbertlauren.jwork.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
/**
 * Controller of getting Invoice resource
 *
 * @author Gilbert Lauren
 * @version 06/28/2021
 * @see Job
 */
@RequestMapping("/job")
@RestController
public class JobController {
    /**
     * Get all Jobs from Database
     *
     * @return ArrayList Invoice
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ArrayList<Job> getAllJob() {
        return DatabaseJobPostgre.getAllJob();
    }
    /**
     * Get job with specified Id
     *
     * @param id id of Job
     * @return Job object
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Job getJobById(@PathVariable int id) {
        return DatabaseJobPostgre.getJobById(id);
    }
    /**
     * Get jobs with specified Recruiter Id
     *
     * @param recruiterid id of Recruiter
     * @return ArrayList of Job
     */
    @RequestMapping(value = "/recruiter/{recruiterid}", method = RequestMethod.GET)
    public ArrayList<Job> getJobByRecruiter(@PathVariable int recruiterid) {
        try {
            return DatabaseJobPostgre.getJobByRecruiter(recruiterid);
        } catch (Exception e) {
            return null;
        }
    }
    /**
     * Get Job by Category
     *
     * @param category Job's Category
     * @return ArrayList of Job
     */
    @RequestMapping(value = "/category/{category}", method = RequestMethod.GET)
    public ArrayList<Job> getJobByCategory(@PathVariable JobCategory category) {
        try {
            return DatabaseJobPostgre.getJobByCategory(category);
        } catch (Exception e) {
            return null;
        }
    }
    /**
     * Insert a new Job
     *
     * @param name        name of Job
     * @param fee         fee of Job
     * @param category    Job's category
     * @param recruiterId id of Job
     * @return Job object
     */
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Job addJob(@RequestParam(value = "name") String name,
                      @RequestParam(value = "fee") int fee,
                      @RequestParam(value = "category") JobCategory category,
                      @RequestParam(value = "recruiterId") int recruiterId) {
        try {
            Job job = new Job(DatabaseJobPostgre.getLastId() + 1, DatabaseRecruiter.getRecruiterById(recruiterId), name, fee, category);
            DatabaseJobPostgre.insertJob(job);
            return job;
        } catch (RecruiterNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}

