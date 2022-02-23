package day3Handsone;

abstract class Bank1 {
	 abstract void getBalance();
}
class BankA {
	 int dollar = 1000;
	 void getBalance() {
		 System.out.println("Amount is: " + "$" +this.dollar);
	 }
}
class BankB {
	 int dollar = 1500;
	 void getBalance() {
		 System.out.println("Amount is: " + "$" +this.dollar);
	 }
}
class BankC{
	 int dollar = 2000;
	 void getBalance() {
		 System.out.println("Amount is: " + "$" +this.dollar);
	 }
}
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BankA bank_a = new BankA();
        BankB bank_b = new BankB();
        BankC bank_c = new BankC();
        bank_a.getBalance();
        bank_b.getBalance();
        bank_c.getBalance();
        
        
	}

}
