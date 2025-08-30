package com.tnsif.finals;


final class FinalClass{
	void show() {
		System.out.println("Final class cannot be inherited");
	}
}

public class FinalClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FinalClass fc=new FinalClass();
		fc.show();
	}

}
