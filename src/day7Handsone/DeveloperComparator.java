package day7Handsone;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Comparator;

	public class  DeveloperComparator {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	      ArrayList<DeveloperQues1> d = new ArrayList<>();
	      d.add(new DeveloperQues1(123, "Hema", 3, 1245000));
	      d.add(new DeveloperQues1(124, "Nancy",2, 13600));
	      d.add(new DeveloperQues1(136, "Manvi",5, 145000));
	      d.add(new DeveloperQues1(167, "Yash", 7, 150000));
	      d.add(new DeveloperQues1(189, "Amit", 9, 1600000));
	      System.out.println("Data of developer :");
	      
	      System.out.println("Sorted data according to experience and in Alphabetical order");
	      Collections.sort(d , new CompareExperience());
	      Collections.sort(d , new CompareName());
	      
	      Iterator<DeveloperQues1> it = d.iterator();
	    		  while(it.hasNext()) {
	    			 DeveloperQues1 dev = it.next();
	    			 System.out.println(dev.id+ "   "+dev.name+"   "+dev.experience+"  "+dev.salary);
	    		  }
	      
	       
	    		  
	      DeveloperQues1 devsalary = d.stream().max((d1,d2) -> d1.salary > d2.salary ? 1: -1).get();  
	      System.out.println("Employee who is having highest salary : " +(devsalary.name));    

	     
	    	    
	      
	    		  
}
	}
