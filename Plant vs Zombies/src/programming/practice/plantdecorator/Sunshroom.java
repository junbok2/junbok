package programming.practice.plantdecorator;

public class Sunshroom extends Plant {

	public Sunshroom() {
		this.description = "����";
	}

	@Override
	public double takeDamage(double damage) {
		return 3.0;
	}


}
