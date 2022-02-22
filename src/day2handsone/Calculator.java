package day2handsone;
class Calculation
{
    int num1;
    int num2;
    
    Calculation() {
        num1 = 1;
        num2 = 9;
    }
    
    Calculation(int n1, int n2) {
        num1 = n1;
        num2 = n2;
    }
    
     void add() {
        System.out.println(" Addition: " + num1 + num2);
        }
    
     void subtract() {
    	   System.out.println(" Subtraction: " + num1 + - + num2);
    }
    
}
public class Calculator {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation obj1 = new Calculation();
        Calculation obj2 = new Calculation(700,86);
        obj1.add();
        obj2.subtract();
    	 }
	}


