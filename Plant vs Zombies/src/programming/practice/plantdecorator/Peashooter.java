package programming.practice.plantdecorator;

public class Peashooter extends Plant {

	public Peashooter() {
		this.description = "연발 완두콩";
	}
	

	@Override
	public double takeDamage(double damage) {
		return 3;
		
	}
	
}
