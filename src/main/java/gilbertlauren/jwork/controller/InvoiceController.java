package gilbertlauren.jwork.controller;

import gilbertlauren.jwork.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RequestMapping("/invoice")
@RestController
public class InvoiceController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ArrayList<Invoice> getAllInvoice() {
        return DatabaseInvoice.getInvoiceDatabase();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Invoice getInvoiceById(@PathVariable int id) {
        try {
            return DatabaseInvoice.getInvoiceById(id);
        } catch (InvoiceNotFoundExecption e) {
            e.getMessage();
            return null;
        }
    }
    @RequestMapping(value = "/Jobseeker/{JobseekerId}", method = RequestMethod.GET)
    public ArrayList<Invoice> getInvoiceByJobseeker(@PathVariable int jobseekerid) {
        try {
            return DatabaseInvoice.getInvoiceByJobseeker(jobseekerid);
        } catch (Exception e) {
            return null;
        }
    }
    @RequestMapping(value = "/invoiceStatus/{id}", method = RequestMethod.PUT)
    public Invoice changeInvoiceStatus(@PathVariable int id,
                                       @RequestParam(value = "invoiceStatus") String invoiceStatus) {
        try {
            DatabaseInvoice.changeInvoiceStatus(id, InvoiceStatus.valueOf(invoiceStatus));
            return DatabaseInvoice.getInvoiceById(id);
        } catch (Exception e) {
            return null;
        }
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public boolean removeInvoice(@PathVariable int id) {
        try {
            return DatabaseInvoice.removeInvoice(id);
        } catch (InvoiceNotFoundExecption e) {
            e.getMessage();
            return false;
        }
    }
    @RequestMapping(value = "createBankPayment", method = RequestMethod.POST)
    public Invoice addBankPayment(@RequestParam(value = "adminFee") int adminFee,
                                  @RequestParam(value = "jobseekerId") int jobseekerId) {
        try {
            ArrayList<Job> jobs = DatabaseJob.getJobDatabase();
            Invoice invoice = new BankPayment(DatabaseInvoice.getLastId() + 1,
                    jobs,
                    DatabaseJobseeker.getJobseekerById(jobseekerId),
                    adminFee);
            invoice.setTotalFee();
            DatabaseInvoice.addInvoice(invoice);
            return invoice;
        } catch (JobSeekerNotFoundException | OngoingInvoiceAlreadyExistsException e) {
            return null;
        }
    }
    @RequestMapping(value = "/createEwalletPayment", method = RequestMethod.POST)
    public Invoice addEWalletPayment(@RequestParam(value = "jobseekerId") int jobseekerId,
                                     @RequestParam(value = "referralCode") String referralCode) {
        try {
            ArrayList<Job> jobs = DatabaseJob.getJobDatabase();
            Invoice invoice = new EwalletPayment(DatabaseInvoice.getLastId()+1,
                    jobs,
                    DatabaseJobseeker.getJobseekerById(jobseekerId), DatabaseBonus.getBonusByReferralCode(referralCode));
            invoice.setTotalFee();
            DatabaseInvoice.addInvoice(invoice);
            return invoice;
        } catch (JobSeekerNotFoundException | OngoingInvoiceAlreadyExistsException e) {
            e.printStackTrace();
            return null;
        }
    }
}


