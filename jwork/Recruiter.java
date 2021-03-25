
/**
 * Merupakan file class untuk Recruiter
 * @author Gilbert Lauren
 * @version 18 Maret 2021
 */
public class Recruiter /** inisiasi class */
{
    /** inisiasi variabel */
    private int id;
    private String name, email, phoneNumber, born;
    private Location location;
    /**
     * Constructor for objects of class Recruiter
     * @param id id dari Recruiter
     * @param name nama dari Recruiter
     * @param email email dari Recruiter
     * @param phonenumber nomor telepon dari Recruiter
     * @param born tempat lahir dari Recruiter
     */
    public Recruiter(int id, String name, String email, String phoneNumber, Location location, String born){
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.location = location;
        this.born = born;
    }
    /**
     * merupakan getter id dari Recruiter
     * @return id
     */
    public int getId() {
        return id;
    }
    /**
     * merupakan getter name dari Recruiter
     * @return name
     */
    public String getName() {
        return name;
    }
    /**
     * merupakan getter email dari Recruiter
     * @return email
     */
    public String getEmail() {
        return email;
    }
    /**
     * merupakan getter PhoneNumber dari Recruiter
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }
    /**
     * merupakan getter Location dari Recruiter
     * @return location
     */
    public Location getLocation() {
        return location;
    }
    /**
     * merupakan getter born dari Recruiter
     * @return born
     */
    public String getBorn() {
        return born;
    }
    /**
     * merupakan setter id dari Recruiter
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * merupakan setter email dari Recruiter
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * merupakan setter name dari Recruiter
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * merupakan setter PhoneNumber dari Recruiter
     * @param phoneNumber
     */
    public void setPhoneNumber(String PhoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    /**
     * merupakan setter Location dari Recruiter
     * @param Location
     */
    public void setLocation(Location location) {
        this.location = location;
    }
    /**
     * merupakan setter Born dari Recruiter
     * @param Born
     */
    public void setBorn(String born) {
        this.born = born;
    }
    /**
     * method untuk print dari Recruiter
     * outputnya adalah berupa nama Recruiter
     */
    public void printData() {
        System.out.println("Recruiter :" + getName());
    }
}
