package programming.practice.decorator;

public class Espresso extends Beverage {
	public Espresso() {
		this.description = "����������";
	}
	
	@Override
	public double cost() {
		return 2.5;
	}

}
