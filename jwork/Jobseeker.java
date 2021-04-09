import java.util.Calendar;
import java.util.regex.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Merupakan file class untuk Jobseeker
 * @author Gilbert Lauren
 * @version 18 Maret 2021
 */

public class Jobseeker /** inisiasi class */
{
    private int id; /** inisiasi variabel */
    private String name, email, password;
    public Calendar joinDate;

    /**
     * Constructor for objects of class Jobseeker
     * @param id id dari Jobseeker
     * @param name nama dari Jobseeker
     * @param email email dari Jobseeker
     * @param password password dari Jobseeker
     * @param joinDate tanggal bergabung dari Jobseeker
     */
    public Jobseeker(int id, String name, String email, String password, Calendar joinDate) {
        this.id = id;
        this.name = name;
        this.setEmail(email);
        setPassword(password);
        this.joinDate = joinDate;
    }
    public Jobseeker(int id, String name, String email, String password, int year, int month, int dayOfMonth) {
        this.id = id;
        this.name = name;
        this.setEmail(email);
        this.setPassword(password);
        this.setJoinDate(year, month, dayOfMonth);
    }
    public Jobseeker(int id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.setEmail(email);
        this.setPassword(password);
        this.joinDate = new GregorianCalendar();
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
    public Calendar getJoinDate() {
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
        Pattern pt = Pattern.compile("(?!.(?:\\.\\.))(^[\\w&~][\\w&*~.]+@(?!.*(?:\\s))[\\w]+[\\w-.]+[\\w]+$)");
        Matcher mt = pt.matcher(email);
        if (mt.matches()) {
            this.email = email;
        }
        else{
            this.email = "";
        }
    }
    /**
     * merupakan setter password dari jobseeker
     * @param password
     */
    public void setPassword (String password) {
        Pattern pt = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=\\S+$).{6,}$");
        Matcher mt = pt.matcher(password);
        if (mt.matches()) {
            this.password= password;
        }
        else{
            this.password = "";
        }
    }
    /**
     * merupakan setter joinDate dari jobseeker
     * @param joinDate
     */
    public void setJoinDate (Calendar joinDate) {
        this.joinDate = joinDate;
    }
    public void setJoinDate (int year, int month, int dayOfMonth) {
        this.joinDate = new GregorianCalendar(year, month, dayOfMonth);
    }
    /**
     * method untuk print dari jobseeker
     * outputnya adalah berupa nama pencari kerja
     */
    public String toString() {
    //Date date = joinDate.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMMM yyyy");
    //    String strDate = simpleDateFormat.format(date);
            return 
               "\nId = " + id +
               "\nNama = " + name +
               "\nEmail = " + email +
               "\nPassword = " + password +
               "\nJoin Date = " + simpleDateFormat.format(joinDate.getTime());
    }
}
