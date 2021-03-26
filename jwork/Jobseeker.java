
/**
 * Merupakan file class untuk Jobseeker
 * @author Gilbert Lauren
 * @version 18 Maret 2021
 */
public class Jobseeker /** inisiasi class */
{
    private int id; /** inisiasi variabel */
    private String name, email, password, joinDate;

    /**
     * Constructor for objects of class Jobseeker
     * @param id id dari Jobseeker
     * @param name nama dari Jobseeker
     * @param email email dari Jobseeker
     * @param password password dari Jobseeker
     * @param joinDate tanggal bergabung dari Jobseeker
     */
    public Jobseeker(int id, String name, String email, String password, String joinDate) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.joinDate = joinDate;
    }
    /**
     * merupakan getter id dari Jobseeker
     * @return id
     */
    public int getId() {
        return id;
    }
    /**
     * merupakan getter name dari Jobseeker
     * @return name
     */
    public String getName() {
        return name;
    }
    /**
     * merupakan getter email dari Jobseeker
     * @return email
     */
    public String getEmail() {
        return email;
    }
    /**
     * merupakan getter password dari Jobseeker
     * @return password
     */
    public String getPassword() {
        return password;
    }
    /**
     * merupakan getter joinDate dari Jobseeker
     * @return joinDate
     */
    public String getJoinDate() {
        return joinDate;
    }
    /**
     * merupakan setter id dari jobseeker
     * @param id
     */
    public void setId (int id) {
        this.id = id;
    }
    /**
     * merupakan setter name dari jobseeker
     * @param name
     */
    public void setName (String name) {
        this.name = name;
    }
    /**
     * merupakan setter email dari jobseeker
     * @param email
     */
    public void setEmail (String email) {
        this.email = email;
    }
    /**
     * merupakan setter password dari jobseeker
     * @param password
     */
    public void setPassword (String password) {
        this.password = password;
    }
    /**
     * merupakan setter joinDate dari jobseeker
     * @param joinDate
     */
    public void setJoinDate (String joinDate) {
        this.joinDate = joinDate;
    }
    /**
     * method untuk print dari jobseeker
     * outputnya adalah berupa nama pencari kerja
     */
    public void printData () {
        System.out.println("Jobseeker :" + getName());
    }
}
