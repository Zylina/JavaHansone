package Day11Hansone;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//preparedStatement interface it is a subinterface of Statement of Statement, and  used for execute parameterized query
// setInt(), setString(), setFloat(), execute(), executeQuery()
public class InsertData{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
	    	   Class.forName("com.mysql.jdbc.Driver");
	    	   System.out.println("Driver is loading..");
	    	  
	    	    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment","root" ,"root@_123");
	    	    System.out.println("connecting to DB...");
	    	    
	    	    PreparedStatement pr = con.prepareStatement("insert into bank_details values (? , ?)");
	            
	    	    pr.setInt(1, 1233);
	    	    pr.setString(2,"Shanaya");
	    	    pr.setInt(3, 56660);
	    	    pr.setInt(4, 654322);
	    	    
	    	    int data = pr.executeUpdate();
	    	    
	    	    System.out.println("Record saved...." +data);
	    	    con.close();
	} catch(Exception e) {
		
	  }

 }
}
