
/**
 * Merupakan file class untuk Job
 * @author Gilbert Lauren
 * @version 18 Maret 2021
 */
public class Job /** inisiasi class */
{
    private int id, fee; /** inisiasi variabel */
    private String name, born;
    private Recruiter recruiter;
    private JobCategory category;
    /**
     * Constructor for objects of class Job
     * @param name nama dari Job
     * @param category kategori dari Job
     * @param born tempat lahir dari Job
     * @param recruiter rekruter dari Job
     */
    public Job(int id, String name, Recruiter recruiter, int fee, String born, JobCategory category) {
        this.id = id;
        this.name = name;
        this.recruiter = recruiter;
        this.fee = fee;
        this.born = born;
        this.category = category;
    }
    /**
     * merupakan getter Id dari Job
     * @return id
     */
    public int getId() {
        return id;
    }
    /**
     * merupakan getter Name dari Job
     * @return name
     */
    public String getName() {
        return name;
    }
    /**
     * merupakan getter Fee dari Job
     * @return fee
     */
    public int getFee() {
        return fee;
    }
    public JobCategory getCategory() {
        return category;
    }
    /**
     * merupakan getter Recruiter dari Job
     * @return Recruiter
     */
    public Recruiter getRecruiter() {
        return recruiter;
    }
    /**
     * merupakan getter born dari Job
     * @return born
     */
    public String getBorn() {
        return born;
    }
    /**
     * merupakan setter id dari job
     * @param id
     */
    public void setId (int id) {
        this.id = id;
    }
    /**
     * merupakan setter name dari job
     * @param name
     */
    public void setName (String name) {
        this.name = name;
    }
    /**
     * merupakan setter recruiter dari job
     * @param recruiter
     */
    public void setRecruiter (Recruiter recruiter) {
        this.recruiter = recruiter;
    }
    /**
     * merupakan setter fee dari job
     * @param fee
     */
    public void setFee (int fee) {
        this.fee = fee;
    }
    /**
     * merupakan setter born dari job
     * @param born
     */
    public void setBorn (String born) {
        this.born = born;
    }
    public void JobCategory (JobCategory category) {
        this.category = category;
    }
    /**
     * method untuk print dari job
     * outputnya adalah berupa nama pekerjaan
     */
    public void printData() {
        System.out.println("=============== JOB ===============");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Recruiter: " + recruiter.getName());
        System.out.println("City: " + recruiter.getLocation().getCity());
        System.out.println("Fee: " + fee);
        System.out.println("Category: " + category.toString());
    }
}
