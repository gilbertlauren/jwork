
/**
 * @author Gilbert Lauren
 * @version 18 Maret 2021
 */
public class Recruiter
{
    private int id;
    private String name, email, phoneNumber, born;
    private Location location;
    /**
     * Constructor for objects of class Recruiter
     */
    public Recruiter(int id, String name, String email, String phoneNumber, Location location, String born){
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.location = location;
        this.born = born;
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
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public Location getLocation() {
        return location;
    }
    public String born() {
        return born;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPhoneNumber(String PhoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setLocation(Location location) {
        this.location = location;
    }
    public void getBorn(String born) {
        this.born = born;
    }
    public void printData() {
        System.out.println("Recruiter :" + getName());
    }
}
