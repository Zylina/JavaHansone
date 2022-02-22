package test;



class Rectangle {
	double length;
	double width;
	void setRectangle(double length ,double width) {
		this.length = length;
		this.width = width;
		
	}
	double getarea() {
		double area;
		area = length*width;
		return area;
		}
}
class Box extends Rectangle {
	double height;
	double length;
	double width;
	void setBox(double length ,double width ,double height) {
		this.length = length;
		this.width = width;
		this.height = height;
		
	}
	double getvolume() {
		 return length*width*height;
		
	}
	
}
public class Rectangle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Rectangle rec = new Rectangle();
           rec.setRectangle(2,5);
           System.out.println("Area of Rectangle ->" +rec.getarea());
           Box box = new Box();
           box.setBox(2,3,4);
           System.out.println("Volume of box ->" +box.getvolume());
	}

}

