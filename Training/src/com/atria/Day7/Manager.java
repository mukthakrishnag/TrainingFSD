package com.atria.Day7;

public class Manager extends Employee {
	
	private String noEmp;

	public Manager(String name, String dept,String noEmp) {
		super(name,dept);
		this.noEmp = noEmp;
	}

	@Override
	public String toString() {
		return "Manager [noEmp=" + noEmp + ", getName()=" + getName() + ", getDept()=" + getDept() + "]";
	}

	public String getNoEmp() {
		return noEmp;
	}

	public void setNoEmp(String noEmp) {
		this.noEmp = noEmp;
	}

	public Manager() {
		super();
	}
}
