package gilbertlauren.jwork;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 * Modifies or Read job Table in Database
 *
 * @author Gilbert Lauren
 * @version 06/28/2021
 * @see Job
 */
public class DatabaseJobPostgre {
    /**
     * Get All Job from job table
     *
     * @return ArrayList of Job
     */
    public static ArrayList<Job> getAllJob() {
        Connection c = DatabaseConnection.connection();
        ArrayList<Job> jobs = new ArrayList<>();
        try {
            PreparedStatement stmt = c.prepareStatement("SELECT * FROM job;");
            ResultSet rs = stmt.executeQuery();
            Job job = null;
            while (rs.next()) {
                job = retrieveJob(rs);
                jobs.add(job);
            }
            rs.close();
            stmt.close();
            c.close();
            return jobs;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return null;
        }
    }

    /**
     * Get the last id of Job available
     *
     * @return int id of last Job
     */
    public static int getLastId() {
        int lastId = 0;
        Connection c = DatabaseConnection.connection();
        try {
            PreparedStatement stmt = c.prepareStatement("SELECT id FROM job ORDER BY id DESC LIMIT 1;");
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
     * Get a Job by specified Id in Database
     *
     * @param id id of Job
     * @return Job Object
     */
    public static Job getJobById(int id)  {
        Connection c = DatabaseConnection.connection();
        try {
            PreparedStatement stmt = c.prepareStatement("SELECT * FROM job WHERE id = ?;");
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            Job job = null;
            while (rs.next()) {
                job = retrieveJob(rs);
            }
            rs.close();
            stmt.close();
            c.close();
            return job;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return null;
        }
    }


    /**
     * Get all Jobs with specified Recruiter Id in Database
     *
     * @param id id of Recruiter
     * @return ArrayList of Job
     */
    public static ArrayList<Job> getJobByRecruiter(int id) {
        Connection c = DatabaseConnection.connection();
        ArrayList<Job> jobs = new ArrayList<>();
        try {
            PreparedStatement stmt = c.prepareStatement("SELECT * FROM job WHERE recruiter_id = ?;");
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            Job job = null;
            while (rs.next()) {
                job = retrieveJob(rs);
                jobs.add(job);
            }
            rs.close();
            stmt.close();
            c.close();
            return jobs;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return null;
        }
    }

    /**
     * Get list of Job by JobCategory in Database
     *
     * @param jobCategory category specified
     * @return ArrayList of Job
     */
    public static ArrayList<Job> getJobByCategory(JobCategory jobCategory) {
        Connection c = DatabaseConnection.connection();
        ArrayList<Job> jobs = new ArrayList<>();
        try {
            PreparedStatement stmt = c.prepareStatement("SELECT * FROM job WHERE category = ?;");
            stmt.setString(1, jobCategory.toString());
            ResultSet rs = stmt.executeQuery();
            Job job = null;
            while (rs.next()) {
                job = retrieveJob(rs);
                jobs.add(job);
            }
            rs.close();
            stmt.close();
            c.close();
            return jobs;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return null;
        }
    }

    /**
     * Insert a new Job to Database
     *
     * @param job new Job
     * @return Whether insertion is successful
     */
    public static boolean insertJob(Job job) {
        Connection c = DatabaseConnection.connection();
        try {
            PreparedStatement stmt = c.prepareStatement("INSERT INTO job (id,fee,name,category,recruiter_id) VALUES (?,?,?,?,?)");
            stmt.setInt(1, job.getId());
            stmt.setInt(2, job.getFee());
            stmt.setString(3, job.getName());
            stmt.setString(4, job.getCategory().toString());
            stmt.setInt(5, job.getRecruiter().getId());
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
     * Delete a Job by specified Id in Database
     *
     * @param id id of Job
     * @return whether deletion is successful
     * @throws JobSeekerNotFoundException
     */
    public static boolean removeJob(int id) throws JobSeekerNotFoundException {
        Connection c = DatabaseConnection.connection();
        try {
            PreparedStatement stmt = c.prepareStatement("DELETE FROM job where id = ?;");
            stmt.setInt(1, id);
            stmt.executeUpdate();
            stmt.close();
            c.close();            return true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return false;
        }
    }

    /**
     * Use ResultSet to retrieve Job data
     *
     * @param rs ResultSet to be passed
     * @return Job Object
     */
    public static Job retrieveJob(ResultSet rs) {
        try {
            int id = rs.getInt("id");
            int fee = rs.getInt("fee");
            String name = rs.getString("name");
            JobCategory category = JobCategory.valueOfLabel(rs.getString("category"));
            int recruiterId = rs.getInt("recruiter_id");
            Recruiter recruiter = DatabaseRecruiterPostgre.getRecruiterById(recruiterId);
            return new Job(id, recruiter, name, fee, category);
        } catch (RecruiterNotFoundException | SQLException throwables) {
            throwables.printStackTrace();
            return null;
        }
    }
}