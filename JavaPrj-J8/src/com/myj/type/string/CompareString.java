package com.myj.type.string;

public class CompareString {
	
	public static void compareStr() {
		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc");
		System.out.println(str1.equals(str2));//true
		System.out.println(str1.equals(str3));//true
		System.out.println("str1 == str2 "+(str1 == str2));//true
		System.out.println("str1 == str3 "+(str1 == str3));//false
		System.out.println("abc == str1 "+("abc" == str1)); //true and for str2
		System.out.println("abc == str3 "+("abc" == str3)); //false 
	}
	
	public static void main(String args[]) {
		CompareString.compareStr();
	}

}
