package com.myj.thread;

/*JAVA MONITOR through synchronization */
class MyData {
	synchronized public void display(String str) {
//	public void display(String str) {
		
			for (int i = 0; i < str.length(); i++) {
				System.out.print(str.charAt(i));
			}
		}
	

}

class MyThread1 extends Thread {
	MyData d;

	public MyThread1(MyData d) {
		this.d = d;
	}

	public void run() {
		d.display("Hello World this week is beautiful");
	}

}

class MyThread2 extends Thread {
	MyData d;

	public MyThread2(MyData d) {
		this.d = d;
	}

	public void run() {
		d.display("Welcome All Lets join  the party");
	}

}

public class SyncDemo {
	public static void main(String args[]) {
		MyData d1 = new MyData();
		MyThread1 mt1 = new MyThread1(d1);
		MyThread2 mt2 = new MyThread2(d1);
		mt1.start();
		mt2.start();
	}

}
