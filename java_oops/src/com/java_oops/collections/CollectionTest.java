package com.java_oops.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

public class CollectionTest {

	public static void main(String[] args) {

		List<String> List = new ArrayList<>(
				Arrays.asList("ajay", "vijay", "sanjay", "rahul", "punam", "rahul", "ajay"));

		// ArrayList
		System.out.println("-------Array List-------");
		List<String> arrayList = new ArrayList<>(
				Arrays.asList("ajay", "vijay", "sanjay", "rahul", "punam", "rahul", "ajay"));
		System.out.println(arrayList);
		arrayList.add("Shan");
		System.out.println(arrayList);
		arrayList.remove("punam");
		System.out.println(arrayList);
		arrayList.removeAll(arrayList);
		System.out.println(arrayList);
		arrayList.add("Shan");
		System.out.println(arrayList);
		System.out.println("");

		// LinkedList
		System.out.println("-------Linked List-------");
		List<String> linkedList = new LinkedList<>(Arrays.asList("ajay", "vijay", "sanjay", "rahul", "punam"));
		System.out.println(linkedList);
		linkedList.add("Shan");
		System.out.println(linkedList);
		linkedList.remove("punam");
		System.out.println(linkedList);
		linkedList.removeAll(linkedList);
		System.out.println(linkedList);
		linkedList.add("Shan");
		System.out.println(linkedList);

		// HashSet
		System.out.println("-------Hash Set-------");
		Set<String> hashSet = new HashSet<>(List);
		System.out.println(hashSet);
		hashSet.add("Shan");
		System.out.println(hashSet);
		hashSet.remove("punam");
		System.out.println(hashSet);
		hashSet.removeAll(hashSet);
		System.out.println(hashSet);
		hashSet.add("Shan");
		System.out.println(hashSet);

		// LinkedHash Set
		System.out.println("-------Linked Hash Set-------");
		Set<String> linkedHashSet = new LinkedHashSet<>(List);
		System.out.println(linkedHashSet);
		linkedHashSet.add("Shan");
		System.out.println(linkedHashSet);
		linkedHashSet.remove("punam");
		System.out.println(linkedHashSet);
		linkedHashSet.removeAll(linkedHashSet);
		System.out.println(linkedHashSet);
		linkedHashSet.add("Shan");
		System.out.println(linkedHashSet);

		// Priority Queue
		System.out.println("-------Prioroty Queue-------");
		PriorityQueue<String> queue = new PriorityQueue<>(List);
		System.out.println(queue);
		queue.add("Shan");
		System.out.println(queue);
		queue.remove("punam");
		System.out.println(queue);
		queue.removeAll(queue);
		System.out.println(queue);
		queue.add("Shan");
		System.out.println(queue);

	}

}
