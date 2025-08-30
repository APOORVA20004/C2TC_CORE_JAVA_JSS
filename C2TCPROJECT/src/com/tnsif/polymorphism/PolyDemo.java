package com.tnsif.polymorphism;

public class PolyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator ca = new Calculator();
		ca.add(ca.getNumOne(), ca.getNumTwo());
		System.out.println(ca);
	}

}
