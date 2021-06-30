package gilbertlauren.jwork.controller;

import gilbertlauren.jwork.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * Controller to process Bonus Resource
 *
 * @author Gilbert Lauren
 * @version 06/28/2021
 * @see Bonus
 */


@RequestMapping("/bonus")
@RestController
public class BonusController {
    /**
     * Get all Bonus available in Database
     *
     * @return ArrayList of Bonus
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ArrayList<Bonus> getAllBonus() {
        return DatabaseBonusPostgre.getBonusDatabase();
    }

    /**
     * Get a Bonus with the specified referralCode
     *
     * @param referralCode String used for matching
     * @return Bonus object
     */
    @RequestMapping(value = "/{referralCode}", method = RequestMethod.GET)
    public Bonus getBonusByReferralCode(@PathVariable String referralCode) {
        return DatabaseBonusPostgre.getBonusByReferralCode(referralCode);
    }

    /**
     * Insert a new Bonus to the Database
     *
     * @param referralCode String of referralCode
     * @param extraFee     int of extraFee applicable
     * @param minTotalFee  int of minimal fee to be applicable
     * @param active       status whether Bonus is applicable
     * @return Bonus object
     */
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Bonus addBonus(@RequestParam(value = "ReferralCode") String referralCode,
                          @RequestParam(value = "discount") int extraFee,
                          @RequestParam(value = "MinimalTotalFee") int minTotalFee,
                          @RequestParam(value = "active") boolean active) {
        Bonus bonus = new Bonus(DatabaseBonusPostgre.getLastId() + 1, referralCode, extraFee, minTotalFee, active);
        DatabaseBonusPostgre.addBonus(bonus);
        return bonus;
    }
}
