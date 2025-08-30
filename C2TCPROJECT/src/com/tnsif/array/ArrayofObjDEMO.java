package com.tnsif.array;

import java.util.Scanner;

public class ArrayofObjDEMO {

	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		Student arr[];
		arr = new Student[5];
		 Student s1=new Student(1,"Appu");
		 arr[0]=s1;
		 arr[1]=new Student(2,"Apoorva");
		 
		 for(int i=2;i<arr.length;i++) {
			 System.out.println("enter the roll number of the student");
			 int rollNum=sc.nextInt();
			 System.out.println("enter the name of student");
			 String name = sc.next();
		arr[i]=new Student(rollNum,name);
		
		 }
		 for(int i=0;i<arr.length;i++) {
			 System.out.println("element at"+i+":"+arr[i].getRollNo()+" "+arr[i].getName());
		 }
	}
}
