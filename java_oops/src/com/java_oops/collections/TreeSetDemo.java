package com.java_oops.collections;

import java.util.Iterator;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		TreeSet<String> vehical = new TreeSet<String>();

		vehical.add("Bus");
		vehical.add("Car");
		vehical.add("Bike");
		vehical.add("Airoplane");
		vehical.add("Chopper");
		vehical.add("Bycycle");
		vehical.add("Bike");
		vehical.add("Bus");
		System.out.println(vehical);
		System.out.println("");

		vehical.remove("HCL");

		Iterator<String> itr = vehical.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}
	}

}
