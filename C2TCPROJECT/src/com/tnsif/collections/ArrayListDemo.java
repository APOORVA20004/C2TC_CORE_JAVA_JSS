package com.tnsif.collections;

import java.util.*;
import com.tnsif.array.Student;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List a1=new ArrayList();
		a1.add(10);
		a1.add(new Integer(10));
		a1.add("Apoorva R S");
		Student s1=new Student(1,"bob");
		a1.add(s1);
		System.out.println(a1);
		Iterator i=a1.iterator();
		while(i.hasNext()) {
			Object obj=i.next();
			System.out.println(obj);
		}
		System.out.println(a1.size());
		a1.add(0, 5);
		System.out.println(a1);
		a1.remove(0);
		System.out.println(a1);

		List al1=new ArrayList<>();
		al1.add(100);
		al1.addAll(a1);
		System.out.println(al1);
	
	}

}
