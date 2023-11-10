package com.myj.abstrac;

//Super class
public class Super {
	private String var1 = "Value1";
	
	public String getVar1() {
		return var1;
	}

	public void setVar1(String var1) {
		this.var1 = var1;
	}

	public Super() {
		System.out.println("Constructor of Super");
	}
	
	public String getStr1(String name) {
		return "Welcome "+name;
	}

}

class TestAbst1{
	public static void main(String args[]) {
		Super s1 = new Super();
		System.out.println(s1.getStr1("DC"));
	}
}
