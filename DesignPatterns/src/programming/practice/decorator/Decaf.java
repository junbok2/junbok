package programming.practice.decorator;

public class Decaf extends Beverage {
	public Decaf() {
		this.description = "��ī���� Ŀ��";
	}
	
	@Override
	public double cost() {
		return 3.5;
	}

}
