package test;


class Bank1 {
	  int getBalance() {
		  return 0;
	  }
}
class BankA {
	 int getBalance(int balance) {
		 return balance; 
	 }
}
class BankB {
	  int getBalance(int balance) {
		 return balance;
	 }
}
class BankC{
	 int getBalance(int balance) {
		return balance;
	 }
}
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankA a = new BankA();
		BankB b = new BankB();
		BankC c = new BankC();
		System.out.println("The balance in Bank A is $"+a.getBalance(1000));
		System.out.println("The balance in Bank B is $"+b.getBalance(1500));
		System.out.println("The balance in Bank C is $"+c.getBalance(2000));
		
       }
        
        
	}


