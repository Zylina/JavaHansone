package test;

import java.util.Scanner;
public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the weigth in Kgs :");
		int t= sc.nextInt();
		Luggagecheck l = new Luggagecheck();
		
		l.luggage(t);
		
	}

}
