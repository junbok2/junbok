package programming.practice.plant;

import programming.practice.plant.behavior.Onebullet;

public class Repeater extends Plant {

	public Repeater() {
		this.bulletable = new Onebullet();
	}
	
	@Override
	public void display() {
		System.out.println("¿ÏµÎÄá");
		
	}

}
