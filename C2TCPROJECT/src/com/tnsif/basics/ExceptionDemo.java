package com.tnsif.basics;

public class ExceptionDemo {
 public static void main (String[]args) {
	 int d=4;
	 int a[]=new int[d];
	 System.out.println("value of d is : "+d);
	 try {
		  int x=42/d;
		 a[4]=30;
	 }
	 catch(ArithmeticException e){
		 System.out.println("cant divide a number by zero");;
	 }
	 catch(ArrayIndexOutOfBoundsException e) {
		 System.out.println("cant assign a value ");
	 }
	 finally {
		 System.out.println("i am in finally block");
	 }
	 System.out.println("outside catch block");
 }
 
}
