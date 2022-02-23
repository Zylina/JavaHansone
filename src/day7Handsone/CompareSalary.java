package day7Handsone;
import java.util.Comparator;

public class CompareSalary {
	public int compare(Object o1,Object o2){  
		DeveloperQues1 s1=(DeveloperQues1)o1;  
		DeveloperQues1 s2=(DeveloperQues1)o2;  
		  
		if(s1.salary == s2.salary)  
		return 0;  
		else if(s1.salary > s2.salary)  
		return 1;  
		else  
		return -1;  
		}  
}
