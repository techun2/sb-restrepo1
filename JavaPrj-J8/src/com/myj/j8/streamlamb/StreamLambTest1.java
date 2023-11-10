package com.myj.j8.streamlamb;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamLambTest1 {
	public static void normalLoop(List<String> ls1) {
		for(String ele:ls1) {
			System.out.println(ele);
		}
	}
	
	public static void main (String args[]) {
		List<String> fruits = List.of("Apple", "Orange", "Mango", "Banana", "Pineapple");
		ArrayList<String> alFruits = new ArrayList<>(fruits);
//		StreamLambTest1.normalLoop(alFruits);
		
//		Stream st1 = alFruits.stream();
		
		alFruits.stream().
			map(el -> el.toUpperCase()).  //Makes each fruit an uppercase
			filter( fruit -> fruit.contains("AN")).
			forEach(e -> System.out.println(e));
		
//		alFruits.stream().
		//distinct() collect()
		
	}

}
