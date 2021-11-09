package programming.practice.decorator;

public class Caramel extends CondimentDecorator {

	public Caramel(Beverage beverage) {
		super(beverage);
		this.description = ", ī��� �߰�";
	}
	
	@Override
	public String getDescription() {
		return this.beverage.getDescription() + this.description;
	}

	@Override
	public double cost() {
		return this.beverage.cost() + 0.9;
	}

}
