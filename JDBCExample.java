import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCExample {
    public static void main(String[] args) {

        try {
            // Step 1: Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Establish Connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb", "root", "password");

            System.out.println("Connection Established");

            // Step 3: Create Statement
            Statement stmt = con.createStatement();

            // Step 4: Execute Query
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");

            // Step 5: Process Result
            while (rs.next()) {

                System.out.println(
                    rs.getInt(1) + " " +
                    rs.getString(2)
                );
            }

            // Step 6: Close Connection
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}