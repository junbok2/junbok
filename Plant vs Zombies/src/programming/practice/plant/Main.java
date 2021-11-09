package programming.practice.plant;

public class Main {

	public static void main(String[] args) {
		Plant plant = new Sunflower();
		plant.sun();
		plant.display();
		
		plant = new Sunshroom();
		plant.sun();
		plant.display();
		
		plant = new Repeater();
		plant.bullet();
		plant.display();
		
		plant = new Peashooter();
		plant.bullet();
		plant.display();
		
		plant = new Wallnut();
		plant.defense();
		plant.display();
		
		plant = new TallNut();
		plant.defense();
		plant.display();

	}

}
