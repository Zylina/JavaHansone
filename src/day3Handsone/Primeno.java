package day3Handsone;
import java.util.Scanner;
interface in1{
	void display(int p);
}
class testClass implements in1 {
	boolean isprime(int n) {
		if(n==1 || n==0)
			return false;
		else {
			for(int i=2; i<=Math.sqrt(n) ;i++) {
				if(n%i==0)
					return false;
			}
		}
		return true;
	}
	public void display(int K) {
		int count = 0;
		for(int i=0;i<=K;i++) {
			if(isprime(i)){
				count++;
			}
		}
		System.out.println("Total prime number :" + count);
	}
}
public class Primeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 int t= sc.nextInt();
		 while(t-->0) {
		  int k= sc.nextInt();
          testClass obj1 = new testClass();
          obj1.display(k);
		 }
	}

}
