package gilbertlauren.jwork.controller;

import gilbertlauren.jwork.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

@RequestMapping("/job")
@RestController
public class JobController {
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ArrayList<Job> getAllJob() {
        return DatabaseJob.getJobDatabase();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Job getJobById(@PathVariable int id) {
        try {
            return DatabaseJob.getJobById(id);
        } catch (JobNotFoundExecption e) {
            e.getMessage();
            return null;
        }
    }

    @RequestMapping(value = "/recruiter/{recruiterid}", method = RequestMethod.GET)
    public ArrayList<Job> getJobByRecruiter(@PathVariable int recruiterid) {
        try {
            return DatabaseJob.getJobByRecruiter(recruiterid);
        } catch (Exception e) {
            return null;
        }
    }

    @RequestMapping(value = "/category/{category}", method = RequestMethod.GET)
    public ArrayList<Job> getJobByCategory(@PathVariable JobCategory category) {
        try {
            return DatabaseJob.getJobByCategory(category);
        } catch (Exception e) {
            return null;
        }
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Job addJob(@RequestParam(value = "name") String name,
                      @RequestParam(value = "fee") int fee,
                      @RequestParam(value = "category") JobCategory category,
                      @RequestParam(value = "recruiterId") int recruiterId) {
        try {
            Job job = new Job(DatabaseJob.getLastId() + 1, DatabaseRecruiter.getRecruiterById(recruiterId), name, fee, category);
            DatabaseJob.addJob(job);
            return job;
        } catch (RecruiterNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}

