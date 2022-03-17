package com.cisco.junit5TestCases;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Test1 {
	
	@BeforeAll
	public static void setup() {
		System.out.println("Hello");
	}
	
	@BeforeEach
	public void printDash() {
		System.out.println("-");
	}
	
	@Test
	public void  test1() {
		System.out.println("Test1");
		Assertions.assertEquals(1, 1);
	}
	
	@Test
	public void  test2() {
		System.out.println("Test2");
		Assertions.assertEquals(1, 1);
	}
	@Test
	public void  test3() {
		System.out.println("Test3");
		Assertions.assertEquals(1, 1);
	}
	
	@AfterEach 
	
	public void printTwoStars() {
		System.out.println("**");
	}
	
	@AfterAll
	public static void tearDown() {
		System.out.println("Good Bye");
	}

}
