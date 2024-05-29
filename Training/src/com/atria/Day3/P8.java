package com.atria.Day3;

public class P8 {
	private String name;
	private String address;
	private char gender;
	private String dept;
	private long mob;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public long getMob() {
		return mob;
	}
	public void setMob(long mob) {
		this.mob = mob;
	}
	@Override
	public String toString() {
		return "P8 [name=" + name + ", address=" + address + ", gender=" + gender + ", dept=" + dept + ", mob=" + mob
				+ "]";
	}
	

}
