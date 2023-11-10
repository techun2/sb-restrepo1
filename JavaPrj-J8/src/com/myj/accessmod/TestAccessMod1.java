package com.myj.accessmod;

public class TestAccessMod1 {
	String defStr1 = "defString1";
	protected String proStr1 = "proStr1";
	public String pubStr1 = "pubStr1";
	
	 String getDefWelcome(String name) {
		return ">>>>> TestAccessMod1 DEFAULT Welcome "+name;
	}

	protected  String getProHello(String name) {
		return ">>>>> TestAccessMod1 PROTECTED Hello "+name;
	}
	
	public  String getPubHi(String name) {
		return ">>>>> TestAccessMod1 PUBLIC HI "+name;
	}

	

}
