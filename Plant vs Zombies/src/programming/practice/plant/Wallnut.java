package programming.practice.plant;

import programming.practice.plant.behavior.Smalldefense;

public class Wallnut extends Plant {

	public Wallnut() {
		this.defenseable = new Smalldefense();
	}
	
	@Override
	public void display() {
		System.out.println("È£µÎ");
		
	}

}
