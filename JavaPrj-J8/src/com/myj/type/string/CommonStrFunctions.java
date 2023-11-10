package com.myj.type.string;

public class CommonStrFunctions {
	public static void printChars(String s1) {
		for (int i=0;i<s1.length();i++) {
			System.out.print(s1.charAt(i));
		}
		
		char[] chrArr = s1.toCharArray();
		System.out.println("...CHAR ARRAY");
		for (int i=0; i< chrArr.length; i++) {
			System.out.println(chrArr[i]);
		}
	}
	
	public static void main(String args[]) {
		String s2 = "Hello Bombay";
		String s3 = "Welcome Chicago";
		
		System.out.println("substr1 "+ s2.substring(s2.indexOf("B"), s2.lastIndexOf("y")+1) );
		
		StringBuffer sb1 = new StringBuffer("Welcome");
		sb1.append(" DC");
		sb1.append(" and Dallas");
		System.out.println(sb1.toString());
		
		StringBuilder sBuild1 = new StringBuilder("Howdy");
		sBuild1.append(55);
		System.out.println(sBuild1);
		
//		CommonStrFunctions.printChars("Hello Bob");
//		CommonStrFunctions.printChars("Welcome Steve");
		
	}

}
