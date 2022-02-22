package javamondaytest;


import java.util.Scanner;
import java.util.*;

public class UserMainCode {
		  public static int calculateElectricityBill(String str1, String str2, int charge) {
		    int n1 = Integer.parseInt(str1.substring(5, str1.length()));
		    int n2 = Integer.parseInt(str1.substring(5, str2.length()));
		    int n = Math.abs((n2 - n1) * charge);
		    return n;
		  }
		  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    String obj1 = sc.nextLine();
		    String obj2 = sc.nextLine();
		    int num = sc.nextInt();
		    int num1 = calculateElectricityBill(obj1, obj2, num);
		    System.out.println(num1);
		  }
		
}
