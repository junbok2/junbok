package programming.practice.factorymethod;

import programming.practice.factory.Pizza;
import programming.practice.factory.CheesePizza;
import programming.practice.factory.PepperoniPizza;

public class FranchiseA extends PizzaStore {

	@Override
	protected Pizza createPizza(String name) {
		System.out.println("프렌차이즈 A");
		Pizza pizza = null;
		
		if(name.equals("cheese")) {
			pizza = new CheesePizza();
		} else if(name.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		}

		return pizza;
	}

}
