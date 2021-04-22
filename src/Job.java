
/**
 * Merupakan file class untuk Job
 * @author Gilbert Lauren
 * @version 18 Maret 2021
 */
public class Job /** inisiasi class */
{
    private int id, fee; /** inisiasi variabel */
    private String name;
    private Recruiter recruiter;
    private JobCategory category;
    /**
     * Constructor for objects of class Job
     * @param name nama dari Job
     * @param category kategori dari Job
     * @param recruiter rekruter dari Job
     * @param jobCategory kategori dari Job
     */
    public Job(int id, String name, Recruiter recruiter, int fee, JobCategory category) {
        this.id = id;
        this.name = name;
        this.recruiter = recruiter;
        this.fee = fee;
        this.category = category;
    }
    /**
     * merupakan getter Id dari Job
     * @return id
     */
    public static int getId() {
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
    /**
     * merupakan getter JobCategory dari Job
     * @return category
     */
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
     * merupakan setter category dari job
     * @param category
     */
    public void setCategory (JobCategory category) {
        this.category = category;
    }
    /**
     * method untuk print dari job
     * outputnya adalah berupa nama pekerjaan
     */
    //public void printData() {
    //    System.out.println("=============== JOB ===============");
    //    System.out.println("ID: " + id);
    //   System.out.println("Name: " + name);
    //    System.out.println("Recruiter: " + recruiter.getName());
    //    System.out.println("City: " + recruiter.getLocation().getCity());
    //    System.out.println("Fee: " + fee);
    //    System.out.println("Category: " + category.toString()); 
    //}
    public String toString() {
        return "id = " + id +
               "\nName = " + name +
               "\nRecruiter = " + recruiter.getName() +
               "\nCity = " + recruiter.getLocation().getCity() +
               "\nFee = " + fee + 
               "\nCategory = " + category;
    }
}
