import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {

    // Consider externalizing credentials to a secure configuration file

    public static Connection getConnection() throws SQLException {
        Connection con = null;
        try {
            // Load the MySQL JDBC driver (optional)
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/java_login_register", "root", "");
        } catch (ClassNotFoundException ex) {
            // Handle the class not found exception (e.g., log it)
            throw new SQLException("MySQL JDBC driver not found.", ex);
        } catch (SQLException ex) {
            // Handle the SQL exception (e.g., log it)
            throw new SQLException("Error connecting to the database.", ex);
        }
        return con;
    }
}
