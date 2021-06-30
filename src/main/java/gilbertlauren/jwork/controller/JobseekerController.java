package gilbertlauren.jwork.controller;

import gilbertlauren.jwork.*;
import org.springframework.web.bind.annotation.*;

import static gilbertlauren.jwork.DatabaseJobseeker.jobseekerLogin;
/**
 * Controller of getting Jobseeker Resource
 *
 * @author Gilbert Lauren
 * @version 06/28/2021
 * @see Jobseeker
 */
@RequestMapping("/jobseeker")
@RestController
public class JobseekerController {
    @RequestMapping("")
    public String indexPage(@RequestParam(value = "name", defaultValue = "world") String name) {
        return "Hello " + name;
    }
    /**
     * Get a Jobseeker by specified Id
     *
     * @param id of Jobseeker
     * @return Jobseeker Object
     */
    @RequestMapping("/{id}")
    public Jobseeker getJobseekerById(@PathVariable int id) {
        Jobseeker jobseeker = null;
        jobseeker = DatabaseJobseekerPostgre.getJobseekerById(id);
        return jobseeker;
    }
    /**
     * Register a new Jobseeker to Database
     *
     * @param name     name of Jobseeker
     * @param email    email of Jobseeker
     * @param password password of Jobseeker
     * @return Jobseeker object
     */
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public Jobseeker registerJobseeker(@RequestParam(value = "name") String name,
                                       @RequestParam(value = "email") String email,
                                       @RequestParam(value = "password") String password) {
        Jobseeker jobseeker = new Jobseeker(DatabaseJobseekerPostgre.getLastId() + 1, name, email, password);
        DatabaseJobseekerPostgre.addJobseeker(jobseeker);
        return jobseeker;
    }
    /**
     * Match the credentials of Jobseeker
     *
     * @param email    email of Jobseeker
     * @param password password of Jobseeker
     * @return Jobseeker object
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Jobseeker loginJobseeker(@RequestParam(value = "email") String email,
                                    @RequestParam(value = "password") String password) {
        try {
            return DatabaseJobseekerPostgre.getJobseekerLogin(email, password);
        } catch (Exception e) {
            return null;
        }
    }
}