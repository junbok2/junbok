package programming.practice.factorymethod;

import programming.practice.factory.Pizza;

public class Main {

	public static void main(String[] args) {
		//����������A
		PizzaStore pizzastore = new FranchiseA();
		Pizza pizza = pizzastore.orderPizza("cheese");
		System.out.println(pizza+"�� ����\n");
		
		pizza = pizzastore.orderPizza("pepperoni");
		System.out.println(pizza+"�� ����\n");
		
		pizza = pizzastore.orderPizza("clam");
		System.out.println(pizza+"�� ����\n");
		
		pizza = pizzastore.orderPizza("veggie");
		System.out.println(pizza+"�� ����\n");
		
		//����������B
		pizzastore = new FranchiseB();
		pizza = pizzastore.orderPizza("cheese");
		System.out.println(pizza+"�� ����\n");
		
		pizza = pizzastore.orderPizza("pepperoni");
		System.out.println(pizza+"�� ����\n");
		
		pizza = pizzastore.orderPizza("clam");
		System.out.println(pizza+"�� ����\n");
		
		pizza = pizzastore.orderPizza("veggie");
		System.out.println(pizza+"�� ����\n");

	}

}
