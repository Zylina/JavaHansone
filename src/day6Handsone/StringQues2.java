package day6Handsone;

public class StringQues2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   int i;
	   int count=0,count1=0,count2=0;
       String[] Cricketers = {" MS Dhoni:Batsman " , " Malinga:Bowler " , "Virat:Batsman" ," Rohit:Bowler " ,"Ganguli:Fielder","Sehwag:Batsman" ,"Harbajan:Fielder","Harman:Bowler", "Parneet:Batsman" , "Kartik:Fielder"};
       for(i=0 ; i<Cricketers.length ; i++) {
    	   if(Cricketers[i].contains("Batsman"))
    		   count++;
    	   else if(Cricketers[i].contains("Bowler"))
    		   count1++;
    	   else 
    		   count2++;
       }
       System.out.println("Counts of Batsman -> " +count);
       System.out.println("Counts of Bowler -> "  +count1);
       System.out.println("Counts of Fielder -> " +count2);
       }
	}


