package com.myj.collect;

import java.util.ArrayList;
import java.util.List;

public class ArrListLoop {
	
	public static void loopArr(int number, String value) {
		List<String> al1 = new ArrayList<>();
		long startTime = System.currentTimeMillis();
		System.out.println("StartTime:"+startTime);
	
		for (int i=0;i<number; i++) {
			String modVal = value+number;
			al1.add(modVal);
//			System.out.println()
		}
		
		System.out.println("EndTime:"+System.currentTimeMillis()+" Size:"+al1.size());
		System.out.println("Duration:"+(System.currentTimeMillis() - startTime));
		
		ArrayList<String> al2 = new ArrayList<>();
		ArrayList<String> al3 = (ArrayList)al1;
		System.out.println("al1.hashCode():"+al1.hashCode());
		System.out.println("al3.hashCode():"+al3.hashCode());
		System.out.println("al3.equals(al1):"+al3.equals(al1));
		
		
	}

	public static void main(String args[]) {
		ArrListLoop.loopArr(10000000, "City");
	}
}
