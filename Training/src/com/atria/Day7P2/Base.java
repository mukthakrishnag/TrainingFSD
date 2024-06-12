package com.atria.Day7P2;

public class Base {
		//instance variables:
	private int a=10;
		//static variable
	private static int b=20;
	
	public void display()
	{
		System.out.println("value of a: "+a);
		//System.out.println("value of b: "+b);
	}
	public static void StaticDisplay()
	{
		System.out.println("value of b: "+b);
	}
	static
	{
		//b=200;
		//System.out.println("value of b: "+b);
	}
	
}
