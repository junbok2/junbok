package plantdecorator;

public class Sunflower extends Plant {

	public Sunflower() {
		this.description = "�عٶ��";
	}

	@Override
	public double takeDamage(double damage) {
		return 2.0;
	}

	

}
