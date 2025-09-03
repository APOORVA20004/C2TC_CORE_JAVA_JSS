package com.tnsif.genericss;

import java.util.ArrayList;

public class WithoutGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al = new ArrayList();
		
		al.add("java");
		al.add(123);
		
		for(Object object:al) { //foreach - advance version of for loop (travsing purpose)
			String str=(String) object; // casting to string type for object
			System.out.println(str);
		}
	}

}
