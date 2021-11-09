package plantdecorator;

public class Pumpkin extends Protect {
	
	public Pumpkin(Plant plant) {
		super(plant);
		this.description = ", ���� �� ü��:";
	}
	
	@Override
	public String display() {
		return this.plant.display() + this.description;
	}

	@Override
	public double takeDamage(double damage) {
		
		life = 5 - damage;
		
		if(damage>=5) {
			System.out.println("ȣ�� �ı���");
		} else {
			System.out.println("ȣ�� ��ȣ��, ���� ȣ�� ü��:"+ super.life);
		}
		
		
		return this.plant.takeDamage(damage) + life;
	}


}
