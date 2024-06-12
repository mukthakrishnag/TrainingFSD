package com.atria.Day8;
// constructor overloading is the name of the method is the same, the parameters are different 
public class Point {
	private float x;
	private float y;
	private float z;
	
	public Point(float x, float y, float z) {
		
		this.x = x;
		this.y = y;
		this.z = z;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
	public Point(float x, float y) {
	
		this.x = x;
		this.y = y;
	}
	public Point(float x) {
	
		this.x = x;
	}
	public Point() {
		super();
	}
	

}
