package com.myj.accessmod.chi1;

import com.myj.accessmod.TestAccessMod1;

//PROTECTED AND PUBLIC data and methods are visible
public class TestAccessModOthExt extends TestAccessMod1{
	String defStr11 = "defString11";
	protected String proStr21 = "proStr21";
	public String pubStr21 = "pubStr31";
	
	public void m1() {
		TestAccessMod1 tam1 = new TestAccessMod1();
		System.out.println("Only protected and public data is available of TestAccessMod1:"
						+tam1.pubStr1+" "+proStr1);
//		System.out.println(tam1.getDefWelcome("BOB"));//NOT VISIBLE
		System.out.println(getProHello("BOB2"));//PROTECTED METHOD is available DIRECTLY but NOT as tam1
		System.out.println(tam1.getPubHi("BOB3"));
		
	}

	public static void main(String args[]) {
		TestAccessModOthExt tm2 = new TestAccessModOthExt();
		tm2.m1();
	}

}
