package com.cisco.junit5TestCases;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsDemo {
	
	@Test
	public void testAssumption() {
		Assumptions.assumeTrue("abc".contains("l"));
		System.out.println("Test Assumption method 1");
	}
	
	@Test
	public void method2() {
		Assumptions.assumingThat("abc".contains("a"), () ->{
			System.out.println("Test Assumptions method 2");
		});
	}

}
