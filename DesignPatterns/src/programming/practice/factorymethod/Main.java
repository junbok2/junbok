package programming.practice.factorymethod;

import programming.practice.factory.Pizza;

public class Main {

	public static void main(String[] args) {
		//프렌차이즈A
		PizzaStore pizzastore = new FranchiseA();
		Pizza pizza = pizzastore.orderPizza("cheese");
		System.out.println(pizza+"고객 전달\n");
		
		pizza = pizzastore.orderPizza("pepperoni");
		System.out.println(pizza+"고객 전달\n");
		
		pizza = pizzastore.orderPizza("clam");
		System.out.println(pizza+"고객 전달\n");
		
		pizza = pizzastore.orderPizza("veggie");
		System.out.println(pizza+"고객 전달\n");
		
		//프렌차이즈B
		pizzastore = new FranchiseB();
		pizza = pizzastore.orderPizza("cheese");
		System.out.println(pizza+"고객 전달\n");
		
		pizza = pizzastore.orderPizza("pepperoni");
		System.out.println(pizza+"고객 전달\n");
		
		pizza = pizzastore.orderPizza("clam");
		System.out.println(pizza+"고객 전달\n");
		
		pizza = pizzastore.orderPizza("veggie");
		System.out.println(pizza+"고객 전달\n");

	}

}
