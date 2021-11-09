package programming.practice.plant;

import programming.practice.plant.behavior.Onesun;

public class Sunflower extends Plant {
	
	public Sunflower() {
		this.sunable = new Onesun();
	}

	@Override
	public void display() {
		System.out.println("해바라기");
		
	}

}
