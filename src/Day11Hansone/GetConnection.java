package Day11Hansone;

import java.sql.Connection;
import java.sql.DriverManager;

public class GetConnection {
	static Connection con; // Global Connection Object
    public static Connection getConnection() {
        try {
        	 Class.forName("com.mysql.jdbc.Driver"); 
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","root@_123");
        }
        catch (Exception e) {
            System.out.println("Connection Failed!");
        }
       return con;
    }

}

