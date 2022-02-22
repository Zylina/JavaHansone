package Day11Hansone;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Developer {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		try{
			Connection con = GetConnection.getConnection();
			System.out.println("Enter customer_name :");
			String name = sc.nextLine();
			
			System.out.println("Enter account_no to add ");
			int acc_no = sc.nextInt();
			
			System.out.println("Enter balance to add ");
			int balance=sc.nextInt();
			System.out.println("Enter phone no:");
			int phone= sc.nextInt();
			System.out.println("Entered details:"+acc_no +"  "+name+" "+balance +"  "+phone);
			PreparedStatement pr =con.prepareStatement("insert into bank_details values(?,?,?,?)");
			pr.setInt(1, acc_no);
			pr.setString(2, name);
			pr.setInt(3, balance);
			pr.setLong(4, phone);
			System.out.println("Record saved:"+pr);
			
			//step 4
			int data = pr.executeUpdate();
			System.out.println("record executed.."+data);
			pr=con.prepareStatement("select * from bank_details");
			ResultSet rs=pr.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getLong(4));
			}
			con.close();
//			
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		}

}