package com.jmlim.designpattern.factory;

public class ChicagoStyleVegglePizza extends Pizza {
	public ChicagoStyleVegglePizza() {
		name = "Chicago Style Deep Dish Veggle Pizza";
		dough = "Thin Crust Dough";
		sauce = "Plum Tomato Sauce";

		toppings.add("Mozzarella Cheese");
	}

	@Override
	protected void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
