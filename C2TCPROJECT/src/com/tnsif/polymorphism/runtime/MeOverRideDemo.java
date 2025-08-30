package com.tnsif.polymorphism.runtime;

public class MeOverRideDemo {

	public static void main(String[] args) {
RBI rbi;
rbi = new RBI();
System.out.println(rbi.getRateOfInterest());

SBI sbi = new SBI();
System.out.println(sbi.getRateOfInterest());

rbi = new ICIC();
System.out.println(rbi.getRateOfInterest()+"%");
	}

}
