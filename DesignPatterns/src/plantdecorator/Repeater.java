package plantdecorator;

public class Repeater extends Plant {

	public Repeater() {
		this.description = "�ϵ���";
	}

	@Override
	public double takeDamage(double damage) {
		return 3.0;
	}


}
