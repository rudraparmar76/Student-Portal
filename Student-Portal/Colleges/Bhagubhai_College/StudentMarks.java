/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colleges.Bhagubhai_College;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author rudra
 */
class StudentMarks {
    public static Connection getConnection() throws SQLException {
        Connection con = null;
        try {
            // Load the MySQL JDBC driver (optional)
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/stu_marks", "root", "");
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
