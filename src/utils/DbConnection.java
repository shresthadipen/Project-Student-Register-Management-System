package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    public Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management_system", "root", "");
            System.out.println("Connection Succesful");

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return con;
    }
}
