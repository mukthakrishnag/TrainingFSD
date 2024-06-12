package com.atria.Day8;

public class OverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Constructor Overloading");
		
		Point p=new Point();
		System.out.println(p);
		
		Point p1=new Point(4.5f);
		System.out.println(p1);
		
		Point p2=new Point(4.5f,3.5f);
		System.out.println(p2);
		
		Point p3=new Point(4.5f,3.6f,5.7f);
		System.out.println(p3);
		
		System.out.println("Method Overloading");
		System.out.println(Addition.addition(10,20));
		System.out.println(Addition.addition(5.5f,20));
		System.out.println(Addition.addition(10,6.5f));
		System.out.println(Addition.addition("Atria","CSE"));
		
		
		
		
	}

}
