package com.myj.thread.runnable;

public class RunnableClass1 implements Runnable{
	String tName;
	public RunnableClass1(String tName) {
		this.tName = tName;
	}
	
	public void run() {
		System.out.println("SUCCESS run for thread"+tName);
		try {
			Thread.sleep(5000);
			System.out.println("AFTER SLEEP...."+tName);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String args[]) {
		RunnableClass1 tr1 = new RunnableClass1("X");
		Thread t1 = new Thread(tr1);
		t1.start();
		RunnableClass1 tr2 = new RunnableClass1("Y");
		Thread t2 = new Thread(tr2);
		t2.start();
		RunnableClass1 tr3 = new RunnableClass1("Z");
		Thread t3 = new Thread(tr3);
		t3.start();
		
	}

}
