package day2handsone;

class digital1 {
	 void power() {
		 System.out.println("This is the Power method");
	 }
	 void memory() {
		 System.out.println("This is the memory method");
	 }
}
class Laptop extends digital1{
	 void screenSize() {
		 System.out.println("This is the ScreenSize method");
	 }
	 void displayQuality() {
		 System.out.println("This is the displayQuality method");
	 }
}
class Ipad extends digital1{
	 void color() {
		 System.out.println("This is the color method");
	 }
	 void model() {
		 System.out.println("This is the model method");
	 }
}
class ChromeBook extends Laptop{
	int x;
	 void No_ofKeys(int x) {
		 this.x = x;
		 System.out.println("This is the No_ofKeys method :"+x);
		 }
}

public class Digital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeBook d = new ChromeBook();
         d.screenSize();
         d.displayQuality();
         d.No_ofKeys(20);
	}

}
