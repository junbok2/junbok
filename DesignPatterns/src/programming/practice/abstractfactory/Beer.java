package programming.practice.abstractfactory;

public class Beer extends Beverage {

	@Override
	public void prepare() {
		System.out.println("������ ��� ��ư ������");
	}

	@Override
	public void putInCup() {
		System.out.println("���� �ſ� ���");
		
	}

}
