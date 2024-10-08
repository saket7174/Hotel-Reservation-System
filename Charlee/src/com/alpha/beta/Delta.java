package com.alpha.beta;
// setuping connection with sql
import java.sql.*;

public class Delta {

    public static void main(String[] args) {
        try {
            // Load the MySQL JDBC driver (optional for JDBC 4.0+)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection to the database
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tree", "root", "start6393");

            // Create a statement object for executing SQL queries
            Statement stmt = con.createStatement();

            // Print status message
            System.out.println("Inserting records");

            // Define the SQL query
            String sql = "INSERT INTO fruit (id) VALUES (77)";

            // Execute the SQL query
            stmt.executeUpdate(sql);

            // Print success message
            System.out.println("Record inserted successfully!");

        } catch (Exception e) {
            // Print any errors that occur during the process
            System.out.println(e);
        }
    }
}
