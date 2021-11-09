package programming.practice.plant;

import programming.practice.plant.behavior.Doublebullet;

public class Peashooter extends Plant {
	
	public Peashooter() {
		this.bulletable = new Doublebullet(); 
	}

	@Override
	public void display() {
		System.out.println("연발 완두콩");
		
	}

}
