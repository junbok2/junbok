package plantdecorator;

public class Sunflower extends Plant {

	public Sunflower() {
		this.description = "해바라기";
	}

	@Override
	public double takeDamage(double damage) {
		return 2.0;
	}

	

}
