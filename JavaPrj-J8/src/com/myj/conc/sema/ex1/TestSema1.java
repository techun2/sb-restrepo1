package com.myj.conc.sema.ex1;

import java.util.concurrent.Semaphore;

public class TestSema1 {

	public static void main(String args[]) {
		Semaphore sp1 = new Semaphore(3, true);
		MySemaPhoThread t1 = new MySemaPhoThread(sp1,"X");
//		Semaphore sp2 = new Semaphore(5);
		MySemaPhoThread t2 = new MySemaPhoThread(sp1,"Y");
		t1.start();
		t2.start();

		
		for (int i = 0; i < 5; i++) {
			System.out.println("Main method.."+i);

		}

	}
}