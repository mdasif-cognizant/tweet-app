package com.junit5.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.junit5.demo.Calculator;

class CalculatorTest {

	@Test
	@DisplayName("Adding two numbers")
	void testadd() {
		Calculator calculate=new Calculator();
		int sum = calculate.add(10, 10);
		assertEquals(20, sum);
		System.out.println("Sum of two number is = "+sum);
				
		
	}
	
	@Test
	void testSubtract() {
		Calculator calculate=new Calculator();
		int sub = calculate.sub(10, 3);
		assertEquals(7, sub);
		System.out.println("Subtraction of two number is = "+sub);
				
	}
	
	@Test
	void testProduct() {
		Calculator calculate=new Calculator();
		int product = calculate.product(10, 10);
		assertEquals(100, product);
		System.out.println("Product of two number is = "+product);
	}
	

}
