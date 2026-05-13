package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertRecord {
    public void save(int empno, String empname) {
        Connection c = null;
        Statement stmt = null;
        try {
        	Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/company"; 
            String user = "root"; 
            String password = ""; 
            c = DriverManager.getConnection(url, user, password);
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");
            stmt = c.createStatement();
            String sql = "INSERT INTO emp_master (empno, empname) VALUES (" + empno + ", '" + empname + "');";        
            stmt.executeUpdate(sql);
            stmt.close();
            c.commit(); 
            c.close();          
            System.out.println("Record created successfully");
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }
}