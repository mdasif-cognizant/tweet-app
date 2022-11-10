package com.junit5.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.junit5.demo.Calculator;

class CalculatorTest {

	@Test
	void test() {
		Calculator calculate=new Calculator();
		int sum = calculate.add(10, 10);
		System.out.println("Sum of two number is = "+sum);
				
		
	}

}
