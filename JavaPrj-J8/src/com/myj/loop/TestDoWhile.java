package com.myj.loop;

class TestDoWh {

	public void testMyDoWhile1() {
		int i = 0;
		do {
			System.out.println(i + " TestDoWh");
			i++;
		} while (i < 5);
//	} while (i > 0 && i < 5);
	}

}
class TestWh {

	public void testMyWhile1() {
		int i = 0;
		while ((i < 5 )) {
//			while ((i > 0 && i < 5)) {
			System.out.println(i + " TestWh");
			i++;
		}
		
	}

}


public class TestDoWhile {

	public static void main(String args[]) {
		TestDoWh tdh = new TestDoWh();
		tdh.testMyDoWhile1();
		
		TestWh th = new TestWh();
		th.testMyWhile1();
	}

}
