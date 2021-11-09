package plantdecorator;

public class Pumpkin extends Protect {
	
	public Pumpkin(Plant plant) {
		super(plant);
		this.description = ", 남은 총 체력:";
	}
	
	@Override
	public String display() {
		return this.plant.display() + this.description;
	}

	@Override
	public double takeDamage(double damage) {
		
		life = 5 - damage;
		
		if(damage>=5) {
			System.out.println("호박 파괴됨");
		} else {
			System.out.println("호박 보호중, 남은 호박 체력:"+ super.life);
		}
		
		
		return this.plant.takeDamage(damage) + life;
	}


}
