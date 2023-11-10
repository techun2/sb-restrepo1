package com.myj.thread;

public class RunThread1 {
	public static void main(String args[]) {
		Thread1 t1 = new Thread1("t1");
		t1.start();
		for (int j=0;j<4;j++) {
			String n1 = "name"+j;
			Thread1 t2 = new Thread1(n1);
			t2.start();
			System.out.println("IN MAIN..."+n1);
			
		}
		
	}

}
