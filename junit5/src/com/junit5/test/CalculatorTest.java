package com.junit5.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.junit5.demo.Calculator;

class CalculatorTest {

	@Test
	void testadd() {
		Calculator calculate=new Calculator();
		int sum = calculate.add(10, 10);
		System.out.println("Sum of two number is = "+sum);
				
		
	}
	
	@Test
	void testSubtract() {
		Calculator calculate=new Calculator();
		int sum = calculate.add(10, 3);
		System.out.println("Subtraction of two number is = "+sum);
				
	}
	
	@Test
	void testProduct() {
		Calculator calculate=new Calculator();
		int sum = calculate.add(10, 10);
		System.out.println("Product of two number is = "+sum);
	}
	

}
