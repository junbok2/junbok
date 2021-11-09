package programming.practice.plantdecorator;

public class Main {

	public static void main(String[] args) {
		
		Plant pumpkinshield = new Pumpkin(new Peashooter());
		System.out.println(pumpkinshield.display() + pumpkinshield.takeDamage(6));
	}

	
	
	
	
	
	
}
