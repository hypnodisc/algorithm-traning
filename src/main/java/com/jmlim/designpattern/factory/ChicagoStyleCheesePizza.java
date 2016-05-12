package com.jmlim.designpattern.factory;

public class ChicagoStyleCheesePizza extends Pizza {
	public ChicagoStyleCheesePizza() {
		name = "Chicago Style Deep Dish Cheese Pizza";
		dough = "Thin Crust Dough";
		sauce = "Plum Tomato Sauce";

		toppings.add("Mozzarella Cheese");
	}

	@Override
	protected void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
