package com.myj.collect;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrListException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> fruits = List.of("Banana", "Apple", "Mango");//IMMUTABLE
//		System.out.println(fruits);
//		ArrayList<String> al1 = new ArrayList<String>(fruits);
		ArrayList<String> al1 = new ArrayList<>(fruits);
		System.out.println(al1);
	
		Iterator<String> it1 = al1.iterator();
// remove causes IllegalStateException
//		it1.remove();
		
		it1.next();//Banana
		it1.next();//Apple
		System.out.println(it1.next());//Mango
		//The below code throws Exception in thread "main" java.util.NoSuchElementException
		it1.next();
//		System.out.print(it1.remove());
//		System.out.println(it1.remove());
//		while(it1.hasNext()) {
//			it1.remove();
//		}
		

	}

}
