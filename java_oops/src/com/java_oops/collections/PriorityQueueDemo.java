package com.java_oops.collections;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue<String> queue = new PriorityQueue<>();

		queue.add("Ajay");
		queue.add("VijaySanjay");
		queue.add("Raju");
		queue.add("Sanjay");
		queue.add("Ram");
		queue.add("Shyam");
		
		System.out.println(queue);
		
		System.out.println(queue.peek());
		System.out.println("");

		

		Iterator<String> itr = queue.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}

	}

}
