package programming.practice.plantdecorator;

public class Sunshroom extends Plant {

	public Sunshroom() {
		this.description = "¹ö¼¸";
	}

	@Override
	public double takeDamage(double damage) {
		return 3.0;
	}


}
