package com.myj.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyMathTest1 {

	@Test
	void testSum() {
		MyMath mm2 = new MyMath();
		assertEquals(13, mm2.doSum(new int[] {2,3,8}));
		assertArrayEquals(new int[] {2,1}, new int[] {2,1});
		assertNotNull(mm2);
//		assertNull(mm2);
//		fail("Not yet implemented");
	}

}
