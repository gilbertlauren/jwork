package gilbertlauren.jwork.controller;

import gilbertlauren.jwork.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
/**
 * Controller of getting Recruiter resource
 *
 * @author Gilbert Lauren
 * @version 06/28/2021
 * @see Recruiter
 */
@RequestMapping("/recruiter")
@RestController
public class RecruiterController {
    /**
     * Get all Recruiter in Database
     *
     * @return ArrayList Recruiter
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ArrayList<Recruiter> getAllRecruiter() {
        return DatabaseRecruiterPostgre.getAllRecruiter();
    }
    /**
     * Get Recruiter by specified Id
     *
     * @param id id of Recruiter
     * @return Recruiter Object
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Recruiter getRecruiterById(@PathVariable int id) {
        try {
            return DatabaseRecruiterPostgre.getRecruiterById(id);
        } catch (RecruiterNotFoundException e) {
            e.getMessage();
            return null;
        }
    }
    /**
     * Insert a new Recruiter in Database
     *
     * @param name        name of Recruiter
     * @param email       email of Recruiter
     * @param phoneNumber phoneNumber of Recruiter
     * @param province    province of Recruiter
     * @param description description of Recruiter
     * @param city        city of Recruiter
     * @return Recruiter object
     */
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Recruiter addRecruiter(@RequestParam(value = "name") String name,
                                  @RequestParam(value = "email") String email,
                                  @RequestParam(value = "phoneNumber") String phoneNumber,
                                  @RequestParam(value = "province") String province,
                                  @RequestParam(value = "descripton") String description,
                                  @RequestParam(value = "city") String city) {
        Location location = new Location(province,city, description);
        Recruiter recruiter = new Recruiter(DatabaseRecruiterPostgre.getLastId() + 1, name, email, phoneNumber, location);
        DatabaseRecruiterPostgre.insertRecruiter(recruiter);
        return recruiter;
    }
}
