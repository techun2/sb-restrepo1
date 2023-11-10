package com.myj.collect.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashingTest {

	public static void main(String[] args) {
		Map<DataKey, Integer> hm = getAllData();

		DataKey dk = new DataKey();
		dk.setId(1);
		dk.setName("Alex");
		System.out.println("In main:"+dk.hashCode());

		Integer value = hm.get(dk);
		
		System.out.println("Returned value:"+value);
		System.out.println("hm.size:"+hm.size());

		hm.put(dk, 10);
		System.out.println("hm2.size: "+hm.size());

		
		Set<DataKey> keys = hm.keySet();
		Iterator<DataKey> it1 = keys.iterator();
		while (it1.hasNext()) {
			DataKey dk2 = it1.next();
			System.out.println("Equals:"+(dk.equals(dk2)));
		}
		
	}

	private static Map<DataKey, Integer> getAllData() {
		Map<DataKey, Integer> hm = new HashMap<>();

		DataKey dk = new DataKey();
		dk.setId(1);
		dk.setName("Alex");
		System.out.println("In getAllData"+dk.hashCode());

		hm.put(dk, 10);

		return hm;
	}


}
