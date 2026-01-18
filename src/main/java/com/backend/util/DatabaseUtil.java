package com.backend.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {


     // ===== LOCAL DATABASE CONFIG =====
    private static final String URL = "jdbc:mysql://localhost:3306/sensors?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String USER = "localuser"; // or root
    private static final String PASSWORD = "localpassword";


    // ===== AWS RDS CONFIG (COMMENTED FOR NOW) =====
    // // Replace these with your AWS RDS database info
    // private static final String URL = "jdbc:mysql://<RDS-ENDPOINT>:3306/mydb";
    // private static final String USER = "admin";
    // private static final String PASSWORD = "secret";

    static {
        try {
            // Load MySQL JDBC driver (optional with newer versions)
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Cannot load MySQL JDBC Driver", e);
        }
    }

    /**
     * Get a connection to the database.
     * Each DAO will call this method when it needs a connection.
     */
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
