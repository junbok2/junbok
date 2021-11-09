package programming.practice.plantdecorator;

public class TallNut extends Plant {

	public TallNut() {
		this.description = "Å« È£µÎ";
	}
	
	@Override
	public double takeDamage(double damage) {
		return 12.0;
	}

	


}
