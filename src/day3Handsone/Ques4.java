package day3Handsone;

abstract class Parent1 {

	public Parent1() {
		super();
		System.out.println(" This is constructor of abstract class ");
	}
	abstract void a_method();
	void method1() {
		System.out.println(" This is a normal method of abstract class ");
	}
}
class child extends Parent1 {
	 void a_method() {
		 System.out.println(" This is abstract method "); 
	 }
}
public class Ques4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         child obj1 = new child();
         obj1.method1();
         obj1.a_method();
	}

}
