package com.atria.Day3;
//P7 entity for displaying student details
public class P7 {
	//Data Members
	
	private String name;
	private String USN;
	private long mob;
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUSN() {
		return USN;
	}
	public void setUSN(String uSN) {
		USN = uSN;
	}
	public long getMob() {
		return mob;
	}
	public void setMob(long mob) {
		this.mob = mob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "P7 [name=" + name + ", USN=" + USN + ", mob=" + mob + ", address=" + address + "]";
	}
	// getter and setter method in java
	//get: to get data, set: to set data
	
	
}
