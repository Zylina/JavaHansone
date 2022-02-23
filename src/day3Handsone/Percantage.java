package day3Handsone;

abstract class Marks {
	abstract void getPercentage();
}
class StudentA extends Marks {
	  int chemistry;
	  int maths;
	  int physics;
	public StudentA(int chemistry, int maths, int physics) {
		super();
		this.chemistry = chemistry;
		this.maths = maths;
		this.physics = physics;
	}
	void getPercentage() {
	   float total = ((chemistry+maths+physics)/(float)300)*100;
	   System.out.println("Student_A percent :" + total);
	}
}

class StudentB extends Marks {
	  int english;
	  int computer;
	  int civics;
	  int science;
	  

	public StudentB(int english, int computer, int civics, int science) {
		super();
		this.english = english;
		this.computer = computer;
		this.civics = civics;
		this.science = science;
	}
    void getPercentage() {
	   float total = ((english+computer+civics+science)/(float)400)*100;
	   System.out.println("Student_B percent :" + total);
	}
}
public class Percantage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            StudentA obj1 = new StudentA(90,79,80);
            StudentB obj2 = new StudentB(81,91,89,95);
            obj1.getPercentage();
            obj2.getPercentage();
            
	}

}
