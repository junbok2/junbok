package programming.practice.plantdecorator;

public class Peashooter extends Plant {

	public Peashooter() {
		this.description = "���� �ϵ���";
	}
	

	@Override
	public double takeDamage(double damage) {
		return 3;
		
	}
	
}
