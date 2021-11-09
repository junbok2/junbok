package programming.practice.plant;

import programming.practice.plant.behavior.Bulletproduceable;
import programming.practice.plant.behavior.Sunproduceable;
import programming.practice.plant.behavior.Defenseable;

public abstract class Plant {
	protected Bulletproduceable bulletable;
	protected Sunproduceable sunable;
	protected Defenseable defenseable;
	
	public void bullet() {
		this.bulletable.bullet();
	}
	
	public void sun() {
		this.sunable.sun();
	}
	
	public void defense() {
		this.defenseable.defense();
	}
	
	public abstract void display();
}
