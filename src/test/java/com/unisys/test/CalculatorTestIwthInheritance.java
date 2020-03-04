package com.unisys.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.unisys.develop.Calculator;

public class CalculatorTestIwthInheritance extends Calculator {
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("setUp");
		//objCalcUnderTest = new Calculator();
	}

	
	@After
	public void tearDown() throws Exception {
		System.out.println("tearDown");
	}

	
	@Test
	public void testAdd() {
		int a = 15;
        int b = 20;
        int expectedResult = 35;
        long result = add(a, b);
        Assert.assertEquals(expectedResult, result);;
	}

	@Test
	public void testSubtract() {
        int a = 25;
        int b = 20;
        int expectedResult = 5;
        long result = subtract(a, b);
        Assert.assertEquals(expectedResult, result);;
	}

	@Test
	public void testMultiply() {
		int a = 10;
        int b = 25;
        long expectedResult = 250;
        long result = multiply(a, b);
        Assert.assertEquals(expectedResult, result);;
	}

	@Test
	public void testDivide() {
        int a = 56;
        int b = 10;
        double expectedResult = 6.6;
        double result = divide(a, b);
        Assert.assertEquals(expectedResult, result,0.00005);
	}

}
