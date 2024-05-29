package com.atria.Day2;

public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=10,c=30;
		a++;
		int d= a++ + --b + c;
		System.out.println(d);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		d++;
		int e= --d+ --a + c++;
		System.out.println(e);
		--e;
		int f= --e+ d++ + --c;
		System.out.println(f);

	}

}
