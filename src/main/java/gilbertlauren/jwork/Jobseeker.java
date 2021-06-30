package gilbertlauren.jwork;

import java.util.Calendar;
import java.util.regex.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * The Jobseeker or person seeking for jobs
 * <p>
 * Defines basic info of someone seeking for jobs
 *
 * @author Gilbert Lauren
 * @version 03/18/2021
 */

public class Jobseeker
{
    private int id;
    private String name, email, password;
    public Calendar joinDate;

    /**
     * Constructor of Jobseeker Class with Calendar input
     *
     * @param id       id of Jobseeker
     * @param name     name of Jobseeker
     * @param email    email of Jobseeker
     * @param password password of Jobseeker
     * @param joinDate join date of Jobseeker
     */
    public Jobseeker(int id, String name, String email, String password, Calendar joinDate) {
        this.id = id;
        this.name = name;
        this.setEmail(email);
        setPassword(password);
        this.joinDate = joinDate;
    }
    /**
     * Constructor of Jobseeker Class with Calendar input
     *
     * @param id         id of Jobseeker
     * @param name       name of Jobseeker
     * @param email      email of Jobseeker
     * @param password   password of Jobseeker
     * @param year       year of joinDate
     * @param month      month of joinDate
     * @param dayOfMonth day of joinDate
     */
    public Jobseeker(int id, String name, String email, String password, int year, int month, int dayOfMonth) {
        this.id = id;
        this.name = name;
        this.setEmail(email);
        this.setPassword(password);
        this.setJoinDate(year, month, dayOfMonth);
    }
    /**
     * Constructor of Jobseeker Class without calendar input
     *
     * @param id       id of Jobseeker
     * @param name     name of Jobseeker
     * @param email    email of Jobseeker
     * @param password password of Jobseeker
     */
    public Jobseeker(int id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.setEmail(email);
        this.setPassword(password);
        this.joinDate = new GregorianCalendar();
    }
    /**
     * Accessor of field "id" in Jobseeker Class
     *
     * @return int returns the id of the Jobseeker
     */
    public int getId() {
        return id;
    }
    /**
     * Accessor of field "name" in Jobseeker Class
     *
     * @return String returns the name of Jobseeker
     */
    public String getName() {
        return name;
    }
    /**
     /**
     * Accessor of field "email" in Jobseeker Class
     *
     * @return String returns the email of Jobseeker
     */
    public String getEmail() {
        return email;
    }
    /**
     * Accessor of field "password" in Jobseeker Class
     *
     * @return String returns the password of Jobseeker
     */
    public String getPassword() {
        return password;
    }
    /**
     * Accessor of field "joinDate" in Class
     *
     * @return String returns the joinDate of Jobseeker
     */
    public Calendar getJoinDate() {
        return joinDate;
    }
    /**
     * Mutator of field "id"  in Jobseeker Class
     *
     * @param id new id for Jobseeker
     */
    public void setId (int id) {
        this.id = id;
    }
    /**
     * Mutator of field "name" in Jobseeker Class
     *
     * @param name new name for Jobseeker
     */
    public void setName (String name) {
        this.name = name;
    }
    /**
     * Mutator of field "email" in Jobseeker Class
     *
     * @param email new email for Jobseeker
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
     * Mutator of field "password" in Jobseeker Class
     *
     * @param password new password for Jobseeker
     */
    public void setPassword(String password) {
        Pattern passRegex = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=\\S+$).{6,}$");
        Matcher passMatch = passRegex.matcher(password);
        if (passMatch.matches()){
            this.password = password;
        } else {
            System.out.println("Password tidak valid");
        }
    }
    /**
     * Mutator of field "joinDate" in Jobseeker Class
     *
     * @param joinDate new joinDate for Jobseeker
     */
    public void setJoinDate (Calendar joinDate) {
        this.joinDate = joinDate;
    }
    /**
     * Mutator of field "joinDate" in Jobseeker Class
     *
     * @param year       new year of joinDate
     * @param month      new month of joinDate
     * @param dayOfMonth new day of joinDate
     */
    public void setJoinDate (int year, int month, int dayOfMonth) {
        this.joinDate = new GregorianCalendar(year, month, dayOfMonth);
    }
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
