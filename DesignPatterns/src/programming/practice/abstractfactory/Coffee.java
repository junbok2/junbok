package programming.practice.abstractfactory;

public class Coffee extends Beverage {

	@Override
	public void prepare() {
		System.out.println("���ΰ���, Ŀ�ǳ�����");
	}

	@Override
	public void putInCup() {
		System.out.println("Ŀ�� �ſ� ���");
	}

}
