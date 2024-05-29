package com.atria.Day3;

import java.util.Scanner;

public class P8Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		String name, address,dept;
		long mob;
		char gender;
		System.out.println("Enter name:");
		name=sc.next();
		
		System.out.println("Enter dept:");
		dept=sc.next();
		
		System.out.println("Enter address:");
		address=sc.next();
		
		System.out.println("Enter mob:");
		mob=sc.nextLong();
		
		System.out.println("Enter gen:");
		gender=sc.next().charAt(0);
		
		P8 obj=new P8();
		
		obj.setAddress(address);
		obj.setName(name);
		obj.setMob(mob);
		obj.setGender(gender);
		obj.setDept(dept);
		System.out.println(obj);
	}

}
