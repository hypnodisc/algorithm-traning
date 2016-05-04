package com.jmlim.interview.compare;

public class Fruit implements Comparable<Fruit> {
	private String name;
	private int price;

	public Fruit(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int compareTo(Fruit o) {
		// TODO Auto-generated method stub
		return this.getPrice() - o.getPrice();
	}
}
