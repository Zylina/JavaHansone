package day1hansone;

import java.util.Scanner;

public class PatternProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int i,j;
        for(i=0; i<=5; i++) {
        	for( j=0 ;j<=i; j++) {
        		System.out.print("* ");
        	}
        	System.out.println();
        }
        for( i=4; i>=0; i--) {
        	for( j=0; j <=i ;j++) {
        		System.out.print("* ");
        	}
        	System.out.println();
        }
        
	}

}
