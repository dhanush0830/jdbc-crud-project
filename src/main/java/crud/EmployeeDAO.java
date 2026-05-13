package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeDAO {

    String url = "jdbc:mysql://localhost:3306/company";
    String user = "root";
    String password = "";

    // CREATE TABLE
    public void createTable() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection c = DriverManager.getConnection(url, user, password);

            Statement stmt = c.createStatement();

            String sql = "CREATE TABLE IF NOT EXISTS emp_master ("
                    + "empno INT PRIMARY KEY,"
                    + "empname VARCHAR(50))";

            stmt.executeUpdate(sql);

            System.out.println("Table Created Successfully");

            stmt.close();
            c.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // INSERT
    public void insertRecord(int empno, String empname) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection c = DriverManager.getConnection(url, user, password);

            Statement stmt = c.createStatement();

            String sql = "INSERT INTO emp_master VALUES("
                    + empno + ",'" + empname + "')";

            stmt.executeUpdate(sql);

            System.out.println("Record Inserted Successfully");

            stmt.close();
            c.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // UPDATE
    public void updateRecord(int empno, String empname) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection c = DriverManager.getConnection(url, user, password);

            Statement stmt = c.createStatement();

            String sql = "UPDATE emp_master SET empname='"
                    + empname + "' WHERE empno=" + empno;

            stmt.executeUpdate(sql);

            System.out.println("Record Updated Successfully");

            stmt.close();
            c.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
 // READ
   

    // DELETE
    public void deleteRecord(int empno) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection c = DriverManager.getConnection(url, user, password);

            Statement stmt = c.createStatement();

            String sql = "DELETE FROM emp_master WHERE empno=" + empno;

            stmt.executeUpdate(sql);

            System.out.println("Record Deleted Successfully");

            stmt.close();
            c.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // DROP TABLE
    public void dropTable() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection c = DriverManager.getConnection(url, user, password);

            Statement stmt = c.createStatement();

            String sql = "DROP TABLE emp_master";

            stmt.executeUpdate(sql);

            System.out.println("Table Dropped Successfully");

            stmt.close();
            c.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

	public void readRecord() {

	    try {

	        Class.forName("com.mysql.cj.jdbc.Driver");

	        Connection c = DriverManager.getConnection(url, user, password);

	        Statement stmt = c.createStatement();

	        String sql = "SELECT * FROM emp_master";

	        ResultSet rs = stmt.executeQuery(sql);

	        System.out.println("\nEMPLOYEE DETAILS");
	        System.out.println("----------------------");

	        while (rs.next()) {

	            int empno = rs.getInt("empno");
	            String empname = rs.getString("empname");

	            System.out.println("Emp No   : " + empno);
	            System.out.println("Emp Name : " + empname);
	            System.out.println("----------------------");
	        }

	        rs.close();
	        stmt.close();
	        c.close();

	    } catch (Exception e) {

	        System.out.println(e);
	    }
		
	}
}
