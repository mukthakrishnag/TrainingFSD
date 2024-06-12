package com.atria.day7Abstract;

public abstract class  Base {
	
	//hide implementation, show functionalities
	public abstract void display(); //cannot implement abstract methods
	
	public void display1() //normal methods can be implemented 
	{
		System.out.println("Instance method");
	}
}
