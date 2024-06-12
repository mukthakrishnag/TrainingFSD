package com.atria.Day7Final;

public class Base {
	
	private int a=100; //instance variable
	private final int b=200; //final variable
	
	public void display()
	{
		a=1000;
		System.out.println("value of a: "+a);
	}
	public void displayFinal()
	{
		System.out.println("value of b: "+b);
	}
}
