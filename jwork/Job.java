
/**
 * @author Gilbert Lauren
 * @version 18 Maret 2021
 */
public class Job
{
    private int id, fee;
    private String name, category;
    private Recruiter recruiter;
    /**
     * Constructor for objects of class Job
     */
    public Job(int id, String name, Recruiter recruiter, int fee, String category) {
        this.id = id;
        this.name = name;
        this.recruiter = recruiter;
        this.fee = fee;
        this.category = category;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getFee() {
        return fee;
    }
    public String getCategory() {
        return category;
    }
    public Recruiter getRecruiter() {
        return recruiter;
    }
    public void setId (int id) {
        this.id = id;
    }
    public void setName (String name) {
        this.name = name;
    }
    public void setRecruiter (Recruiter recruiter) {
        this.recruiter = recruiter;
    }
    public void setFee (int fee) {
        this.fee = fee;
    }
    public void setCategory (String category) {
        this.category = category;
    }
    public void printData() {
    }
}
