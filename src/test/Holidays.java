package test;

public class Holidays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Holiday obj = new Holiday("MALDIVES" , 5 , "FEBRURY");
		
		System.out.println("Holiday name:  "   + obj.getName());
		
		
		System.out.println("date: "+ obj.getDate()+ "  "+ obj.getMonth());
	}

}


class Holiday
{
	 private String name;
	 private int date;
	 private String month;
	public Holiday(String name, int date, String month) {
		super();
		this.name = name;
		this.date = date;
		this.month = month;
	}
	 String getName() {
		return name;
	}
	 int getDate() {
		return date;
	}
	 String getMonth() {
		return month;
	}
	 
	 
}
