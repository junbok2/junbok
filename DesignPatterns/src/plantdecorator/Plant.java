package plantdecorator;

public abstract class Plant {
	
	public double life = 0;
	
	protected String description;
	
	
	public String display() {
		return this.description;
	}
	

	public abstract double takeDamage(double damage);
}
