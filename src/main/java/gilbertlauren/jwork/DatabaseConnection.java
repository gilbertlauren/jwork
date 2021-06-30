package gilbertlauren.jwork;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 * Initialize Connection with Postgresql Database
 *
 * @author Gilbert Lauren
 * @version 06/28/2021
 */
public class DatabaseConnection {
    protected static Connection connection() {
        Connection c = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jwork", "postgres", "12345678");
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return c;
    }
}
