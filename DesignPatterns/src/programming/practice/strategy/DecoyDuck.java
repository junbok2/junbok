package programming.practice.strategy;

import programming.practice.strategy.behavior.FlyNoWay;
import programming.practice.strategy.behavior.MuteQuack;
import programming.practice.strategy.behavior.FloatOnWater;

public class DecoyDuck extends Duck {
	
	public DecoyDuck () {
		this.flyable = new FlyNoWay();
		this.quackable = new MuteQuack();
		this.swimable = new FloatOnWater();
	}

	@Override
	public void display() {
		System.out.println("나는 가짜오리~");

	}

}
