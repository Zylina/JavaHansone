package day2handsone;
class Parent{
	void method() {
		System.out.println("This is parent class");
	}
}
class child extends Parent{
	void method1() {
		System.out.println("This is child class");
	}
}
public class ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		  Parent p = new Parent();
		  p.method();
		  child c = new child();
		  c.method1();
		  c.method();
		  
	}

}
