package com.cisco.junit5TestCases;

import org.junit.jupiter.api.Test;

public class metaAnnotationDemo {
	
	@Fast
	@Test
	
	public void myFastTest() {
		System.out.println("Monday");
	}

}
