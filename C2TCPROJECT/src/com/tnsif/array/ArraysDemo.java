package com.tnsif.array;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intArr[] = {10,20,15,22,35,18,14};
		int a[];
		int []b;
		
		System.out.println("array elements are "+Arrays.toString(intArr));
		
		Arrays.sort(intArr);
		System.out.println("Array elements are"+Arrays.toString(intArr));
		
		int keyValue=22;
		System.out.println(keyValue+" "+"found at"+Arrays.binarySearch(intArr, keyValue));

		System.out.println("\n NewArrays by copyOf:\n");
		int intArr2[]=Arrays.copyOf(intArr, 7);
		System.out.println("Integer Array:"+Arrays.toString(intArr2));
}
}