package com.tnsif.genericss;

import com.tnsif.packageone.Person;

public class GenericMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenericMethod gm = new GenericMethod();

		Integer[] intarray = {10,20,30,40};
		gm.displayArrayElements(intarray);
	
		String[] strarray = {"HIiiiiiiiii","Apoorva"};
		gm.displayArrayElements(strarray);
		Person [] per = {new Person("Appu","Mysore", 20)};
		gm.displayArrayElements(per);
	
	
	
	}
	

}
