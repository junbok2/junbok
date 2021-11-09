package programming.practice.plant;

import programming.practice.plant.behavior.Doublesun;

public class Sunshroom extends Plant {

	public Sunshroom() {
		this.sunable = new Doublesun();
	}
	
	@Override
	public void display() {
		System.out.println("¹ö¼¸");
		
	}

}
