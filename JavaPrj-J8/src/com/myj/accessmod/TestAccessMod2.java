package com.myj.accessmod;

public class TestAccessMod2 {
	String defStr2 = "defString2";
	protected String proStr2 = "proStr2";
	public String pubStr2 = "pubStr2";
	
	//Able to access default, protected and public data and methods in the same package
	public void met3() {
		TestAccessMod1 tam1 = new TestAccessMod1();
		System.out.println("All modifiers DATA is available of TestAccessMod1 "+tam1.defStr1+
				" "+tam1.proStr1+" "+tam1.pubStr1);
		
		System.out.println(tam1.getDefWelcome("BOB"));
		System.out.println(tam1.getProHello("BOB2"));
		System.out.println(tam1.getPubHi("BOB3"));
		
		
	}
	
	public static void main(String args[]) {
		TestAccessMod2 tam2 = new TestAccessMod2();
		tam2.met3();
	}
	

}
