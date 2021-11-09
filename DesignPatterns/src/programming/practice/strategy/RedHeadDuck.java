package programming.practice.strategy;

import programming.practice.strategy.behavior.FlyWithWings;
import programming.practice.strategy.behavior.Quack;
import programming.practice.strategy.behavior.SwimWithLegs;

public class RedHeadDuck extends Duck {
	
	public RedHeadDuck() {
		this.quackable = new Quack();
		this.swimable = new SwimWithLegs();
		this.flyable = new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("³ª´Â ¾Æ¸Þ¸®Ä«ÈòÁ×Áö~");

	}

}
