package com.myj.junit;

public class MyMath {
	
	public int doSum(int[] nos) {
//		int[] nos = {2,3,4};
		int sum = 0;
		for (int no1:nos) {
			sum += no1;
		}
		System.out.println(sum);
		return sum;
	}
	
	public static void main(String args[]) {
		MyMath mm = new MyMath();
		mm.doSum(new int[] {5,6,7});
	}

}
