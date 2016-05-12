package com.jmlim.designpattern.factory;

public class NYStyleVegglePizza extends Pizza {
	public NYStyleVegglePizza() {
		name = "NY Style Sauce and Veggle Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";

		toppings.add("Grated Reggiano Veggle");
	}
}
