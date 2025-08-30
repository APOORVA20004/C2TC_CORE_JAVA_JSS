package com.tnsif.array;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayOperations  ao = new ArrayOperations();
		int arr[] = new int[5];
		ao.addElements(arr);
		ao.printArray(arr);
		System.out.println("The odd count is "+ao.getOddCount(arr));
	}

}
