package com.myj.type.string;

public class PrintStringChars {
	public static void printChars(String s1) {
		for (int i=0;i<s1.length();i++) {
			System.out.print(s1.charAt(i));
		}
	}
	
	public static void main(String args[]) {
		
		PrintStringChars.printChars("Hello Bob");
		PrintStringChars.printChars("Welcome Steve");
		
	}

}
