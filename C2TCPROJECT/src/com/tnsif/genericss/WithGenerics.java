package com.tnsif.genericss;

import java.util.ArrayList;

public class WithGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

			ArrayList <String> al = new ArrayList<String>(); // restrict only String object
			
			al.add("java");
			//al.add(123);// we cant add int value because only String objects are allowed
			
			for(Object object:al) { //foreach - advance version of for loop (travsing purpose)
				//String str=(String) object; no need of type casting when we use generics 
				System.out.println(object);
			}
		}
}
