package com.cisco.junit5TestCases;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertionDemo {
	
	@Test
	public void testAssertions() {
		String str1 = new String("abc");
		String str2 = new String("abc");
		String str3 = null;
		String str4 = "abc";
		String str5 ="abc";
		
		int val1 =5;
		int val2 = 6;
		
		String[] arr1 = {"one","two","three"};
		String[] arr2 = {"one","two","three"};
		
//		check that two objects are equal
		Assertions.assertEquals(str1, str2);
		
//		check that a condition is true
		Assertions.assertTrue(val1 > val2);
		
//		check that a condition is false
		Assertions.assertFalse(val1 > val2);
		
//		check that object is not null
		Assertions.assertNotNull(str1);
		
//		check that an object os null
		Assertions.assertNull(str3);
		
//		check if two objecrts refer. point to same object
		Assertions.assertSame(str4, str5);
		
//		check if two objecrts refer. do not point to same object
		Assertions.assertNotSame(str1, str3);
		
//		Check whether two arrays are equal to each other
		Assertions.assertArrayEquals(arr1, arr2);
		
		
		
	}
	

}
