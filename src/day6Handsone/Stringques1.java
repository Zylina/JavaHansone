package day6Handsone;

public class Stringques1 {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		 int count=0;
		 int i;
	      String[] Batchid = {"ACD22XD","AVF22RD","BCD21OP","MNR23TE"};
	      System.out.println("Batchid whose year is 22 :" );
	      for(i=0;i<Batchid.length;i++) {
	    	  if(Batchid[i].contains("22")) {
	    		  System.out.println(Batchid[i]);
	    		  count++;
	    	  }
	      }
	      
		  System.out.println("Count of batchid  with year 22 :" +count);
	}

}
