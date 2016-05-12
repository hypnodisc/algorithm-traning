package com.jmlim.designpattern.factory;

public abstract class PizzaStore {

	public Pizza orderPizza(String type) {
		Pizza pizza;
		// 피자 객체의 인스턴스를 만드는 일은 PizzaStore의 서브클래스에 있는 createPizza() 메소드에서 처리.
		pizza = createPizza(type);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}

	// Pizza 인스턴스를 만드는 일은 팩토리 역할을 하는 메서드에서 맡아서 처리.
	protected abstract Pizza createPizza(String type);
}
