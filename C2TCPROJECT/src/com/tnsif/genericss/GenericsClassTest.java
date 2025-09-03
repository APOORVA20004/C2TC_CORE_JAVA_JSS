package com.tnsif.genericss;

public class GenericsClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenericClass<Integer> obj = new GenericClass<Integer>();
		obj.set(10);
	System.out.println(obj);
	
	
	GenericClass<String> obj1 = new GenericClass<String>();
	obj1.set("APoorvaaa");
	System.out.println(obj1);
	
}

}