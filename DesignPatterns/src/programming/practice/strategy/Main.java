package programming.practice.strategy;

public class Main {

	public static void main(String[] args) {
		Duck duck = new MallardDuck();
		duck.quack();
		duck.swim();
		duck.fly();
		duck.display();
		
		duck = new RedHeadDuck();
		duck.quack();
		duck.swim();
		duck.fly();
		duck.display();
		
		duck = new RubberDuck();
		duck.quack();
		duck.swim();
		duck.fly();
		duck.display();
		
		duck = new DecoyDuck();
		duck.quack();
		duck.swim();
		duck.fly();
		duck.display();
		
		duck = new RobotDuck();
		duck.quack();
		duck.swim();
		duck.fly();
		duck.display();
	}

}
