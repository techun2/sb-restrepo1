package com.myj.accessmod.chi1;

import com.myj.accessmod.TestAccessMod1;

//Only PUBLIC data and methods are available
public class TestAccessModOth1 {
	String defStr11 = "defString11";
	protected String proStr21 = "proStr21";
	public String pubStr21 = "pubStr31";
	
	public void m1() {
		TestAccessMod1 tam1 = new TestAccessMod1();
		System.out.println("Only public data is available of TestAccessMod1:"+tam1.pubStr1);
//		System.out.println(tam1.getDefWelcome("BOB")); //NOT VISIBLE
//		System.out.println(tam1.getProHello("BOB2")); //NOT VISIBLE
		System.out.println(tam1.getPubHi("BOB3")); //VISIBLE
		
	}

	public static void main(String args[]) {
		TestAccessModOth1 tm2 = new TestAccessModOth1();
		tm2.m1();
	}

}
