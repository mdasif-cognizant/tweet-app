package com.java_oops.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {

		HashSet<String> list = new HashSet<String>();

		list.add("Apple");
		list.add("Banana");
		list.add("Banana");
		list.add("Banana");
		list.add("Apple");
		list.add("Mango");
		list.add("Chiku");
		list.add("Papaya");
		System.out.println(list);
		System.out.println("");

		list.remove("Banana");
		
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
