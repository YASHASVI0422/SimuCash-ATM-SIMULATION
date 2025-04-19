package ASimulatorSystem;

import java.sql.*;

public class Conn {
    Connection c;
    Statement s;

    public Conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection(
                "jdbc:mysql://localhost:3307/bankmanagementsystem", "root", "Rudra@42"
            );
            s = c.createStatement();
            System.out.println("✅ Connected to MySQL on port 3307.");
        } catch (Exception e) {
            System.out.println("❌ DB connection failed: " + e);
        }
    }
}
