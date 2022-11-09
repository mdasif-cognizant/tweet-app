package com.java_oops.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("Apple");
		list.add("Banana");
		list.add("Mango");
		list.add("Chiku");
		list.add("Papaya");
		System.out.println(list);
		System.out.println("");
		
		list.remove(4);
		list.removeFirst();
		Iterator itr =list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
