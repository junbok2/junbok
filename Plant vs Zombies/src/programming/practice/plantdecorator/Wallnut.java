package programming.practice.plantdecorator;

public class Wallnut extends Plant {

	public Wallnut() {
		this.description = "È£µÎ";
	}

	@Override
	public double takeDamage(double damage) {
		return 8.0;
	}


	

}
