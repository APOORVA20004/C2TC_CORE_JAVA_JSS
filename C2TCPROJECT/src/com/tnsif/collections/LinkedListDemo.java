package com.tnsif.collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList l1=new LinkedList();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		System.out.println(l1);
		
		ListIterator li=l1.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		l1.add(3,40);
		System.out.println(l1);
	}

}
