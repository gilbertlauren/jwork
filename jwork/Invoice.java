/**
 * Merupakan file class untuk Invoice
 * @author Gilbert Lauren
 * @version 18 Maret 2021
 */
public class Invoice /** inisiasi class */
{
    private int id, idJob, totalFee; /** inisiasi variabel */
    private String date, age;
    private Jobseeker jobseeker;
    /**
     * Constructor for objects of class Invoice
     * @param id id dari Invoice
     * @param idJob id job dari Invoice
     * @param totalFee total gaji dari Invoice
     * @param date tanggal dari Invoice
     * @param age umur dari Invoice
     * @param jobseeker pencari perkerjaan dari Invoice
     */
    public Invoice(int id, int idJob, String date, int totalFee, Jobseeker jobseeker, String age) {
        this.id = id;
        this.idJob = idJob;
        this.date = date;
        this.totalFee = totalFee;
        this.jobseeker = jobseeker;
        this.age = age;
    }
    /**
     * merupakan getter Id dari Invoice
     * @return id
     */
    public int getId() {
        return id;
    }
    /**
     * merupakan getter IdJob dari Invoice
     * @return idJob
     */
    public int getIdJob() {
        return idJob;
    }
    /**
     * merupakan getter Date dari Invoice
     * @return Date
     */
    public String getDate() {
        return date;
    }
    /**
     * merupakan getter TotalFee dari Invoice
     * @return totalFee
     */
    public int getTotalFee() {
        return totalFee;
    }
    /**
     * merupakan getter Jobseeker dari Invoice
     * @return jobseeker
     */
    public Jobseeker getJobseeker() {
        return jobseeker;
    }
    /**
     * merupakan getter age dari Invoice
     * @return age
     */
    public String getage() {
        return age;
    }
    /**
     * merupakan setter Id dari Invoice
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * merupakan setter IdJobs dari Invoice
     * @param id
     */
    public void setIdJobs(int idJobs) {
        this.idJob = idJob;
    }
    /**
     * merupakan setter Date dari Invoice
     * @param date
     */
    public void setDate (String date) {
        this.date = date;
    }
    /**
     * merupakan setter TotalFee dari Invoice
     * @param totalFee
     */
    public void setTotalFee (int totalFee) {
        this.totalFee = totalFee;
    }
    /**
     * merupakan setter Jobseeker dari Invoice
     * @param jobseeker
     */
    public void setJobseeker (Jobseeker jobseeker) {
        this.jobseeker = jobseeker;
    }
    /**
     * merupakan setter age dari Invoice
     * @param age
     */
    public void setage (String age) {
        this.age = age;
    }
    /**
     * method untuk print dari Invoice
     * outputnya adalah berupa jumlah gaji
     */
    public void printData(){
        // Menampilkan perintah print untuk jumlah gaji
        System.out.println("Gaji      :" + getTotalFee());
    }
}
