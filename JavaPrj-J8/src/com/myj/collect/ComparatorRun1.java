package com.myj.collect;

import java.util.ArrayList;
import java.util.List;

public class ComparatorRun1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> students = List.of(new Student(1,"Sri"), new Student(2, "Nishi"), 
								new Student(3, "Avi"));//IMMUTABLE
		System.out.println(students);
//		ArrayList<String> al1 = new ArrayList<String>(fruits);
		ArrayList<Student> al1 = new ArrayList<>(students);
		al1.sort(new AscComparator1());
		System.out.println("After sort....");
		System.out.println(al1);
		

	}

}
