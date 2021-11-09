package programming.practice.factory;

public class SimplePizzaFactory {
	public static Pizza createPizza(String name) {
	
		Pizza pizza = null;
	
		if(name.equals("cheese")) {
			pizza = new CheesePizza();
		} else if(name.equals("veggie")) {
			pizza = new VeggiePizza();
		} else if(name.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		} else if(name.equals("clam")) {
			pizza = new ClamPizza();
		}
	
		return pizza;
	}
	}
