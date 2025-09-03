package com.tnsif.genericss;

import java.math.BigInteger;
import java.util.ArrayList;

public class UpperBoundDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		System.out.println(UpperBoundWildCard.sumOfList(al));
		
		
		ArrayList<Float> al1 = new ArrayList<Float>();
		al1.add(11.2f);
		al1.add(22.3f);
		al1.add(33.4f);
		System.out.println(UpperBoundWildCard.sumOfList(al1));
		
		
		ArrayList<BigInteger> al2 = new ArrayList<BigInteger>();
	
	}

}
