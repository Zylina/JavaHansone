package test;

public class Luggagecheck {

	public void luggage(int weight){
		if(weight>15){
			throw new WeightLimitExceed();
		}else{
			System.out.println(" This is below 15 kg so its allowed");
		}
	}
	
}
