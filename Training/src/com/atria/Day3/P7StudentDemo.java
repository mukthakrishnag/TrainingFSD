package com.atria.Day3;
import java.util.Scanner;
public class P7StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		String name,USN, address;
		long mob;
		System.out.println("Enter name:");
		name=sc.next();
		
		System.out.println("Enter USN:");
		USN=sc.next();
		
		System.out.println("Enter address:");
		address=sc.next();
		
		System.out.println("Enter mob:");
		mob=sc.nextLong();
		P7 obj=new P7(); 
		obj.setAddress(address);
		obj.setName(name);
		obj.setMob(mob);
		obj.setUSN(USN);
		System.out.println(obj);
	}
}
