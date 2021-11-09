package plantdecorator;

public class Repeater extends Plant {

	public Repeater() {
		this.description = "¿ÏµÎÄá";
	}

	@Override
	public double takeDamage(double damage) {
		return 3.0;
	}


}
