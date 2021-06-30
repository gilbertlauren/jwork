package gilbertlauren.jwork;
/**
 * A job that is seeked by the jobseeker
 * <p>
 * Contains a specific job for the jobseeker, from a recruiter with certain fees and category
 *
 * @author Gilbert Lauren
 * @version 03/18/2021
 */

/**
 * Empty Constructor of Job Class
 */
public class Job
{
    private int id, fee;
    private String name;
    private Recruiter recruiter;
    private JobCategory category;
    /**
     * Constructor of Job Class
     *
     * @param id        id of Job
     * @param recruiter Recruiter class of Job
     * @param name      email of Job
     * @param fee       password of Job
     * @param category  category of Job
     * @see Recruiter
     */
    public Job(int id, Recruiter recruiter, String name, int fee, JobCategory category) {
        this.id = id;
        this.recruiter = recruiter;
        this.name = name;
        this.fee = fee;
        this.category = category;
    }
    /**
     * Accessor of field "id" in Job Class
     *
     * @return int returns the id of a Job
     */
    public int getId() {
        return id;
    }
    /**
     * Accessor of field "name" in Job Class
     *
     * @return String returns the name of a Job
     */
    public String getName() {
        return name;
    }
    /**
     * Accessor of field "fee" in Job Class
     *
     * @return int returns the fee of a Job
     */
    public int getFee() {
        return fee;
    }
    /**
     * Accessor of field "category" in Job Class
     *
     * @return String returns the category of a Job
     */
    public JobCategory getCategory() {
        return category;
    }
    /**
     * Accessor of field "recruiter" in Job Class
     *
     * @return Recruiter returns the recruiter class of a Job
     */
    public Recruiter getRecruiter() {
        return recruiter;
    }
    /**
     * Mutator of field "id"  in Job Class
     *
     * @param id for a Job
     */
    public void setId (int id) {
        this.id = id;
    }
    /**
     * Mutator of field "name"  in Job Class
     *
     * @param name for a Job
     */
    public void setName (String name) {
        this.name = name;
    }
    /**
     * Mutator of field "recruiter"  in Job Class
     *
     * @param recruiter class for a Job
     */
    public void setRecruiter (Recruiter recruiter) {
        this.recruiter = recruiter;
    }
    /**
     * Mutator of field "fee"  in Job Class
     *
     * @param fee for a Job
     */
    public void setFee (int fee) {
        this.fee = fee;
    }
    /**
     * Mutator of field "category"  in Job Class
     *
     * @param category for a Job
     */
    public void setCategory (JobCategory category) {
        this.category = category;
    }
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
