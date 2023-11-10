package com.myj.collect;

import java.util.Comparator;

public class AscComparator1 implements Comparator<Student>{
	
	@Override
	public int compare(Student s1, Student s2) {
		System.out.print("stu1 "+s1.getName()+" stu2:"+s2.getName());
		System.out.println(s1.getName().compareTo(s2.getName()));
		return (s1.getName().compareTo(s2.getName()));
// ASC
		//		return s1.getName().compareTo(s2.getName());
		
	}
}
