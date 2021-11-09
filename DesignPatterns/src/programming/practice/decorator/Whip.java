package programming.practice.decorator;

public class Whip extends CondimentDecorator {

	public Whip(Beverage beverage) {
		super(beverage);
		this.description = ", ���� ũ�� �߰�";
	}
	
	@Override
	public String getDescription() {
		return this.beverage.getDescription() + this.description;
	}

	@Override
	public double cost() {
		return this.beverage.cost() + 0.5;
	}

}
