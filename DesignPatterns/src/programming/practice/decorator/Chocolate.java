package programming.practice.decorator;

public class Chocolate extends CondimentDecorator {

	public Chocolate(Beverage beverage) {
		super(beverage);
		this.description = ", ���ݸ� �߰�";
	}
	
	@Override
	public String getDescription() {
		return this.beverage.getDescription() + this.description;
	}

	@Override
	public double cost() {
		return this.beverage.cost() + 1.0;
	}

}
