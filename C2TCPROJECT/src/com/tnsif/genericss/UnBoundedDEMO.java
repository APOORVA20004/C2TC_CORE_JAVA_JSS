package com.tnsif.genericss;

import java.util.Arrays;
import java.util.List;

public class UnBoundedDEMO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> strlist = Arrays.asList("Hi");
		System.out.println(strlist);
		
		UnBoundedWildCard.display(strlist);
		
		List<Integer> intlist= Arrays.asList(1,2,3);
		System.out.println(intlist);
		UnBoundedWildCard.display(intlist);
	}

}
