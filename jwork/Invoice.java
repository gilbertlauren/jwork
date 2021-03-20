/**
 * @author Gilbert Lauren
 * @version 18 Maret 2021
 */
public class Invoice
{
    private int id, idJob, totalFee;
    private String date, age;
    private Jobseeker jobseeker;
    /**
     * Constructor for objects of class Invoice
     */
    public Invoice(int id, int idJob, String date, int totalFee, Jobseeker jobseeker, String age) {
        this.id = id;
        this.idJob = idJob;
        this.date = date;
        this.totalFee = totalFee;
        this.jobseeker = jobseeker;
        this.age = age;
    }
    public int getId() {
        return id;
    }
    public int getIdJob() {
        return idJob;
    }
    public String getDate() {
        return date;
    }
    public int getTotalFee() {
        return totalFee;
    }
    public Jobseeker getJobseeker() {
        return jobseeker;
    }
    public String getage() {
        return age;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setIdJobs(int idJobs) {
        this.idJob = idJob;
    }
    public void setDate (String date) {
        this.date = date;
    }
    public void setTotalFee (int totalFee) {
        this.totalFee = totalFee;
    }
    public void setJobseeker (Jobseeker jobseeker) {
        this.jobseeker = jobseeker;
    }
    public void setage (String age) {
        this.age = age;
    }
    public void printData(){
        // Menampilkan perintah print untuk jumlah gaji
        System.out.println("Gaji      :" + getTotalFee());
    }
}
