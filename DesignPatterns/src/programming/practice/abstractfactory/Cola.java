package programming.practice.abstractfactory;

public class Cola extends Beverage {

	@Override
	public void prepare() {
		System.out.println("�ݶ� �Ѳ� ����");
	}

	@Override
	public void putInCup() {
		System.out.println("�ݶ� �ſ� ���");
	}

}
