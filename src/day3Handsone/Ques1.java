package day3Handsone;
 
abstract class Parent {
	 void message() {
		 System.out.println(" This is Parent abstarct class ");
	 }
}
class subclass1 {
	 void message() {
		 System.out.println(" This is first subclass ");
	 }
}
class subclass2 {
	 void message() {
		 System.out.println(" This is second subclass ");
	 }
}
public class Ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        subclass1 s1 = new subclass1();
        subclass2 s2 = new subclass2();
        s1.message();
        s2.message();
	}

}
