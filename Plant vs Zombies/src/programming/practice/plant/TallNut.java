package programming.practice.plant;

import programming.practice.plant.behavior.Bigdefense;

public class TallNut extends Plant {

	public TallNut() {
		this.defenseable = new Bigdefense();
	}
	
	@Override
	public void display() {
		System.out.println("Å« È£µÎ");
		
	}

}
