package com.tnsif.array;

import java.util.Scanner;

public class ArrayOperations {
  Scanner sc;
  //print int array
  void printArray(int[]arr) {
	System.out.println("array elements are :");
	for (int i=0;i<arr.length;i++)
		System.out.println(arr[i]+"\t");
	System.out.println();
  
  }
  void addElements(int[]arr) {
	  sc=new Scanner(System.in);
	  System.out.println("enter the array elements:");
	  		for(int i=0;i<arr.length;i++) {
	  			arr[i]=sc.nextInt();
	  		}
	  		
  }
  //count no.of odd elements
  public int getOddCount(int b[]) {
	  int count=0;
	  for(int i=0;i<b.length;i++) {
		  if(b[i]%2!=0) {
			  count++;
		  }
	  }
	  return  count;
  }
  
  
}
