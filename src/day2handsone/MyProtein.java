package day2handsone;

class Proteins{
    Proteins(){
    	System.out.println("I have 20gm of Protein");
    }
    Proteins(int x){
    	System.out.println("No i have more i.e 25gm");
    }
}

class SourceExtendProteins extends Proteins{
	SourceExtendProteins(){
    	System.out.println("Source :I have 20gm of Protein");
    }
	SourceExtendProteins(int x){
		super();
    	System.out.println("Source :No i have more i.e 25gm");
    }
}
public class MyProtein {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SourceExtendProteins obj1 =new SourceExtendProteins();
		SourceExtendProteins obj2 =new SourceExtendProteins(25);
	}

}
