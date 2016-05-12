package com.jmlim.coding_test;

import java.util.HashSet;
import java.util.Set;

class Person {
	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}

public class Test {
	public static void main(String[] args) {
		Set<Person> set = new HashSet<Person>();
		Person p1 = new Person("바뀌기전");
		set.add(p1);
		p1.setName("바꾼후");
		Person p2 = new Person("바꾼후");
		set.add(p2);
		System.out.println(set.size());
	}
}