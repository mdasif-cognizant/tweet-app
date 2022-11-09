package com.java_oops.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {

		LinkedHashSet<String> list = new LinkedHashSet<String>();

		list.add("HP");
		list.add("DELL");
		list.add("APPLE");
		list.add("SONY");
		list.add("HCL");
		list.add("DELL");
		list.add("HP");
		list.add("LENOVO");
		System.out.println(list);
		System.out.println("");

		list.remove("HCL");

		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}

	}
}
