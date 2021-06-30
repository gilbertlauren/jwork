package gilbertlauren.jwork;

import java.security.NoSuchAlgorithmException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 * Modifies or Read recruiter Table in Database
 *
 * @author Gilbert Lauren
 * @version 06/28/2021
 * @see Recruiter
 */
public class DatabaseRecruiterPostgre {
    /**
     * Get All Recruiter from recruiter table
     *
     * @return ArrayList of Recruiter
     */
    public static ArrayList<Recruiter> getAllRecruiter() {
        Connection c = DatabaseConnection.connection();
        ArrayList<Recruiter> recruiters = new ArrayList<>();
        try {
            PreparedStatement stmt = c.prepareStatement("SELECT * FROM recruiter;");
            ResultSet rs = stmt.executeQuery();
            Recruiter recruiter = null;
            while (rs.next()) {
                recruiter = retrieveRecruiter(rs);
                recruiters.add(recruiter);
            }
            rs.close();
            stmt.close();
            c.close();
            return recruiters;


        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return null;
        }
    }

    /**
     * Get the last id of Recruiter available
     *
     * @return int id of last Recruiter
     */
    public static int getLastId() {
        int lastId = 0;
        Connection c = DatabaseConnection.connection();
        try {
            PreparedStatement stmt = c.prepareStatement("SELECT id FROM recruiter ORDER BY id DESC LIMIT 1;");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                lastId = rs.getInt("id");
            }
            rs.close();
            stmt.close();
            c.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return lastId;
    }

    /**
     * Get a Recruiter in Database with specified id
     *
     * @param id id of Recruiter
     * @return Recruiter Object
     * @throws RecruiterNotFoundException
     */
    public static Recruiter getRecruiterById(int id) throws RecruiterNotFoundException {
        Connection c = DatabaseConnection.connection();
        try {
            PreparedStatement stmt = c.prepareStatement("SELECT * FROM recruiter WHERE id = ?");
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            Recruiter recruiter = null;
            while (rs.next()) {
                recruiter = retrieveRecruiter(rs);
            }
            rs.close();
            stmt.close();
            c.close();
            return recruiter;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return null;
        }
    }

    /**
     * Insert a new Recruiter into the Database
     *
     * @param recruiter new Recruiter
     * @return whether insertion is successful
     */
    public static boolean insertRecruiter(Recruiter recruiter) {
        Connection c = DatabaseConnection.connection();
        try {
            PreparedStatement stmt = c.prepareStatement("INSERT INTO recruiter (id,name,email,phone_number,province,city,description) VALUES (?,?,?,?,?,?,?)");
            stmt.setInt(1, recruiter.getId());
            stmt.setString(2, recruiter.getName());
            stmt.setString(3, recruiter.getEmail());
            stmt.setString(4, recruiter.getPhoneNumber());
            stmt.setString(5, recruiter.getLocation().getProvince());
            stmt.setString(6, recruiter.getLocation().getCity());
            stmt.setString(7, recruiter.getLocation().getDescription());
            stmt.executeUpdate();
            stmt.close();
            c.close();
            return true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }

    /**
     * Delete a Recruiter by specified id
     *
     * @param id id of Recruiter
     * @return whether Deletion is successful
     * @throws JobSeekerNotFoundException
     */
    public static boolean removeRecruiter(int id) throws JobSeekerNotFoundException {
        Connection c = DatabaseConnection.connection();
        try {
            PreparedStatement stmt = c.prepareStatement("DELETE FROM recruiter where id = ?;");
            stmt.setInt(1, id);
            stmt.executeUpdate();
            stmt.close();
            c.close();
            return true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return false;
        }
    }

    /**
     * Use ResultSet to retrieve Recruiter data
     *
     * @param rs ResultSet to be passed
     * @return Recruiter Object
     */
    public static Recruiter retrieveRecruiter(ResultSet rs) {
        try {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String email = rs.getString("email");
            String phoneNumber = rs.getString("phone_number");
            Location location = new Location(rs.getString("province"),
                    rs.getString("city"),
                    rs.getString("description"));

            return new Recruiter(id, name, email, phoneNumber, location);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return null;
        }
    }
}
