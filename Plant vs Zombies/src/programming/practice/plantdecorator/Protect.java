package programming.practice.plantdecorator;

public abstract class Protect extends Plant{
	protected Plant plant;
	
	public Protect(Plant plant) {
		this.plant = plant;
	}

	public abstract String display();

}
