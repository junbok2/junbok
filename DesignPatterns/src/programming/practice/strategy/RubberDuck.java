package programming.practice.strategy;

import programming.practice.strategy.behavior.Squack;
import programming.practice.strategy.behavior.FloatOnWater;
import programming.practice.strategy.behavior.FlyNoWay;

public class RubberDuck extends Duck {
	
	public RubberDuck() {
		this.quackable = new Squack();
		this.swimable = new FloatOnWater();
		this.flyable = new FlyNoWay();
	}

	@Override
	public void display() {
		System.out.println("나는 고무오리~");

	}
	
	
}
