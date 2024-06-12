package com.atria.Day7;

public class Person {
	
	public String name;
	public Address address;
	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Person(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}
	public Person() {
		super();
	}
}
