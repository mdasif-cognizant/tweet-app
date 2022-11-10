package com.junit5.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.junit5.demo.Calculator;

public class BeforeEachTest {
	
	Calculator calculate;
	
	@BeforeEach
	public void initObject() {	
		calculate = new Calculator();
		System.out.println("Before Each Called......");
	}

	@AfterEach
	public void afterEachTest() {	
		
		System.out.println("After Each Called......");
	}
	
	@Test
	@DisplayName("Adding two numbers")
	void testadd() {

		int sum = calculate.add(10, 10);
		assertEquals(20, sum);
		System.out.println("Sum of two number is = " + sum);
	}

	@Test
	void testSubtract() {

		int sub = calculate.sub(10, 3);
		assertEquals(7, sub);
		System.out.println("Subtraction of two number is = " + sub);
	}

	@Test
	void testProduct() {

		int product = calculate.product(10, 10);
		assertEquals(100, product);
		System.out.println("Product of two number is = " + product);
	}

}
