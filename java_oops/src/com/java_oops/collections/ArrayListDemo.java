package com.java_oops.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Shan");
		// list=Arrays.asList("Ajay","Vijay","Sweety","Nishant");

		list.add("Ajay");
		
		list.add("Vijay");
		list.add("Sanjay");
		list.add("Nishant");

		System.out.println(list);

		Iterator itr = list.iterator();
		while (itr.hasNext()) {

			System.out.println(itr.next());

		}
		list.add(1, "Sweety");
		System.out.println(list);
		
		
		

	}

}
