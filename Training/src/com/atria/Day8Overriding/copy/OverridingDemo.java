package com.atria.Day8Overriding.copy;

public class OverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RBI rbi=new SBI();
		System.out.println(rbi.getRateOfInterest());
		
		RBI r;
		
		r= new ICICI();
		if (r instanceof ICICI);
		{
			System.out.println(r.getRateOfInterest());
		}
		r= new CANARA();
		if (r instanceof ICICI);
		{
			System.out.println(r.getRateOfInterest());
		}
	}

}
