package day7Handsone;

import java.util.Comparator;

public class CompareName implements Comparator {

		// TODO Auto-generated method stub
		public int compare(Object o1,Object o2){  
			DeveloperQues1 s1=(DeveloperQues1)o1;  
			DeveloperQues1 s2=(DeveloperQues1)o2; 
			
			return s1.name.compareTo(s2.name);  
	}

}
