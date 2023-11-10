package com.myj.thread;

class MyThread3 extends Thread{
	
	public MyThread3(String name) {
		super(name);
//		setPriority(MAX_PRIORITY);
	}
	
	public void run() {
		int count =1;
		while (true) {
			System.out.println(count++);
//			try {
//				Thread.sleep(20);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	}
}

public class TestSleepInterrupt {
	public static void main(String args[]) {
		MyThread3 mt3 = new MyThread3("ThrdSleep");
		//Daemon thread is a low priority thread. 
//		it ends when main thread ends
		mt3.setDaemon(true);
		mt3.start();
		//Get current thread of main method
/*		Thread mainThread = Thread.currentThread();
		try {
			mainThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
//		try {Thread.sleep(20);}catch(Exception e) {e.printStackTrace();}
//		mt3.interrupt();
	}
	
	
	

}
