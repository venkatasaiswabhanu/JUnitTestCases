package com.cisco.junit5TestCases;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.TestInfo;

public class RepeatedTestDemo {
	
	@RepeatedTest(5)
	public void demo() {
		System.out.println("Monday");
	}
	
	@RepeatedTest(value = 5, name="{displayName} {currentRepetition}/{totalRepetitions}")
	@DisplayName("Execution")
	public void demo2(TestInfo testinfo) {
		System.out.println("Monday" + testinfo.getDisplayName());
	}

}
