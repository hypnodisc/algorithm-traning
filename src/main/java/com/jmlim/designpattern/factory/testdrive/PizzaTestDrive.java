package com.jmlim.designpattern.factory.testdrive;

import com.jmlim.designpattern.factory.ChicagoPizzaStore;
import com.jmlim.designpattern.factory.NYPizzaStore;
import com.jmlim.designpattern.factory.Pizza;
import com.jmlim.designpattern.factory.PizzaStore;

public class PizzaTestDrive {
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();

		Pizza nyCheesePizza = nyStore.orderPizza("cheese");
		System.out.println();
		Pizza chicagoVeggiePizza = chicagoStore.orderPizza("veggie");

		System.out.println(nyCheesePizza.getName() + " and " + chicagoVeggiePizza.getName());
	}
}
