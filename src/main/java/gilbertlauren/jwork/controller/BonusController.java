package gilbertlauren.jwork.controller;

import gilbertlauren.jwork.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RequestMapping("/bonus")
@RestController
public class BonusController {
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ArrayList<Bonus> getAllBonus() {
        return DatabaseBonus.getBonusDatabase();
    }

    @RequestMapping(value = "/{referralCode}", method = RequestMethod.GET)
    public Bonus getBonusByReferralCode(@PathVariable String referralCode) {
        return DatabaseBonus.getBonusByReferralCode(referralCode);
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Bonus addBonus(@RequestParam(value = "ReferralCode") String referralCode,
                          @RequestParam(value = "discount") int extraFee,
                          @RequestParam(value = "MinimalTotalFee") int minTotalFee,
                          @RequestParam(value = "active") boolean active) {
        try {
            Bonus bonus = new Bonus(DatabaseBonus.getLastId() + 1, referralCode, extraFee, minTotalFee, active);
            DatabaseBonus.addBonus(bonus);
            return bonus;
        } catch (ReferralCodeAlreadyExistsException e) {
            e.printStackTrace();
            return null;
        }
    }
}
