
/**
 * @author Gilbert Lauren
 * @version 18 Maret 2021
 */
public class Jobseeker
{
    private int id;
    private String name, email, password, joinDate, age;

    /**
     * Constructor for objects of class Jobseeker
     */
    public Jobseeker(int id, String name, String email, String password, String joinDate, String age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.joinDate = joinDate;
        this.age = age;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public String getJoinDate() {
        return joinDate;
    }
    public String age() {
        return age;
    }
    public void setId (int id) {
        this.id = id;
    }    
    public void setName (String name) {
        this.name = name;
    }
    public void setEmail (String email) {
        this.email = email;
    }
    public void setPassword (String password) {
        this.password = password;
    }
    public void setJoinDate (String joinDate) {
        this.joinDate = joinDate;
    }
    public void setage (String age) {
        this.age = age;
    }
    public void printData () {
        System.out.println("Jobseeker :" + getName());
    }
}
