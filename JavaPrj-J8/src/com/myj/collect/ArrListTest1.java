package com.myj.collect;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class ArrListTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> fruits = List.of("Banana", "Apple", "Mango");//IMMUTABLE
		System.out.println(fruits);
//		ArrayList<String> al1 = new ArrayList<String>(fruits);
		ArrayList<String> al1 = new ArrayList<>(fruits);
		System.out.println(al1);
		al1.add("Pineapple");
		System.out.println(al1);
		al1.sort(null);
		System.out.println("After sort....");
		System.out.println(al1);
		String[] fruitsArr = new String[] {"Banana", "Mango", "Guava"};
//		fruitsArr.length
		for (String fruit : fruitsArr) {
			System.out.println(fruit);
		}
		
		ConcurrentHashMap<String, String> ch1 = new ConcurrentHashMap<>();
//		ch1.computeIfAbsent(null, null)

		

	}

}
