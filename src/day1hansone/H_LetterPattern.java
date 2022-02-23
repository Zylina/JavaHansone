package day1hansone;


import java.util.Scanner;

public class H_LetterPattern {
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 int i,j;
	 for(i = 0; i<5; i++) {
		 System.out.print("*");
		 for( j =0 ; j<5; j++) {
			 if(j==4 ||(i== 2))
					 System.out.print("*");
			 else
				 System.out.print(" ");
		 }
		 System.out.println();
	 }

}
}
