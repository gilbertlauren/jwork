package gilbertlauren.jwork.controller;

import gilbertlauren.jwork.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
/**
 * Controller of getting Invoice resource
 *
 * @author Gilbert Lauren
 * @version 06/28/2021
 * @see BankPayment
 * @see EwalletPayment
 */
@RequestMapping("/invoice")
@RestController
public class InvoiceController {
    /**
     * Return all Invoice from Database
     *
     * @return ArrayList of Invoice
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ArrayList<Invoice> getAllInvoice() {
        return DatabaseInvoicePostgre.getAllInvoice();
    }
    /**
     * Get an Invoice with specified Id
     *
     * @param id int specified id
     * @return Invoice object
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Invoice getInvoiceById(@PathVariable int id) {
        return DatabaseInvoicePostgre.getInvoiceById(id);
    }
    /**
     * Get all Invoices with specified Jobseeker ID
     *
     * @param jobseekerId specified id
     * @return ArrayList of Invoice
     */
    @RequestMapping(value = "/jobseeker/{jobseekerId}", method = RequestMethod.GET)
    public ArrayList<Invoice> getInvoiceByJobseeker(@PathVariable int jobseekerId) {
        try {
            return DatabaseInvoicePostgre.getInvoiceByJobseeker(jobseekerId);
        } catch (Exception e) {
            return null;
        }
    }
    /**
     * Update InvoiceStatus of specified Invoice ID
     *
     * @param id            int invoice id
     * @param invoiceStatus InvoiceStatus status to be updated
     * @return Updated Invoice
     */
    @RequestMapping(value = "/invoiceStatus/{id}", method = RequestMethod.PUT)
    public Invoice changeInvoiceStatus(@PathVariable int id,
                                       @RequestParam(value = "status") String invoiceStatus) {
        try {
            System.out.println(InvoiceStatus.valueOf(invoiceStatus).toString());
            DatabaseInvoicePostgre.changeInvoiceStatus(id, InvoiceStatus.valueOf(invoiceStatus));
            System.out.println(DatabaseInvoicePostgre.getInvoiceById(id).getInvoiceStatus().toString());
            return DatabaseInvoicePostgre.getInvoiceById(id);
        } catch (Exception e) {
            return null;
        }
    }
    /**
     * Delete an Invoice with specified id
     *
     * @param id int specified id
     * @return boolean
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public boolean removeInvoice(@PathVariable int id) {
        return DatabaseInvoicePostgre.removeInvoice(id);
    }
    /**
     * Insert a EwalletPayment Invoice to database
     *
     * @param jobIdList    lists of Job to be added to Invoice
     * @param jobseekerId  id of Jobseeker
     * @param referralCode referral code of Bonus
     * @return Invoice object
     */
    @RequestMapping(value = "createEWalletPayment", method = RequestMethod.POST)
    public Invoice addEWalletPayment(@RequestParam(value = "jobIdList") ArrayList<Integer> jobIdList,
                                     @RequestParam(value = "jobseekerId") int jobseekerId,
                                     @RequestParam(value = "referralCode") String referralCode) {
        Invoice invoice = null;
        ArrayList<Job> jobs = new ArrayList<>();
        for (Integer integer : jobIdList) {
            jobs.add(DatabaseJobPostgre.getJobById(integer));
        }
        try {
            invoice = new EwalletPayment(DatabaseInvoicePostgre.getLastId() + 1, jobs, DatabaseJobseekerPostgre.getJobseekerById(jobseekerId), DatabaseBonusPostgre.getBonusByReferralCode(referralCode));
            invoice.setTotalFee();
        } catch (Exception e) {
            e.printStackTrace();
        }
        boolean status = false;
        try {
            status = DatabaseInvoicePostgre.insertInvoice(invoice);
        } catch (OngoingInvoiceAlreadyExistsException e) {
            e.printStackTrace();
        }
        if (status) {
            return invoice;
        } else {
            return null;
        }
    }
    /**
     * Insert a BankPayment Invoice to database
     *
     * @param jobIdList   lists of Job to be added to Invoice
     * @param jobseekerId id of Jobseeker
     * @param adminFee
     * @return Invoice object
     */
    @RequestMapping(value = "createBankPayment", method = RequestMethod.POST)
    public Invoice addBankPayment(@RequestParam(value = "jobIdList") ArrayList<Integer> jobIdList,
                                  @RequestParam(value = "jobseekerId") int jobseekerId,
                                  @RequestParam(value = "adminFee") int adminFee) {
        try {
            ArrayList<Job> jobs = new ArrayList<>();
            for (Integer id : jobIdList) {
                jobs.add(DatabaseJobPostgre.getJobById(id));
            }
            Invoice invoice = new BankPayment(DatabaseInvoicePostgre.getLastId() + 1,
                    jobs,
                    DatabaseJobseekerPostgre.getJobseekerById(jobseekerId),
                    adminFee);
            invoice.setTotalFee();
            System.out.println(invoice.getTotalFee());
            DatabaseInvoicePostgre.insertInvoice(invoice);
            return invoice;
        } catch (OngoingInvoiceAlreadyExistsException e) {
            return null;
        }
    }
}


