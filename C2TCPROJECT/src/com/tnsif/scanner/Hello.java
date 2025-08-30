package com.tnsif.scanner;
 import java.util.Scanner;
public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name of student");
		String name= sc.next();
		System.out.println("hello "+name);
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("enter the full name of student");
		String fulname= sc1.nextLine();
		System.out.println("WELCOME " +fulname);
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("enter the phone number of student");
		String Phone= sc2.next();
		System.out.println("Student Phone no is :  " +Phone);
	}

}
