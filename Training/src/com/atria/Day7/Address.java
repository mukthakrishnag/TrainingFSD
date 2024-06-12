package com.atria.Day7;

public class Address {

	@Override
	public String toString() {
		return "Address [address=" + address + "]";
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Address(String address) {
		super();
		this.address = address;
	}

	public Address() {
		super();
	}

	private String address;
}
