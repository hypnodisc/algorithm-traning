package com.jmlim.designpattern.factory;

public class PizzaTestDrive {
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		
		//Pizza pizza = nyStore.createPizza("cheese");
	}
}
