package com.cisco.junit5TestCases;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public class DynamicTestDemo {
	
	@TestFactory
	public Collection<DynamicTest> dynamicTests(){
		return Arrays.asList( 
				dynamicTest("Simple Test", () -> assertTrue(true)),
				dynamicTest("Exception Executeble", () -> {throw new Exception("Exception Example");}),
				dynamicTest("Sample TEst 2", () -> assertTrue(true)));
		
	}


}
