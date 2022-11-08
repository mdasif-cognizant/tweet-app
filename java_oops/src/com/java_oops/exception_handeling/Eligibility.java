package com.java_oops.exception_handeling;

public class Eligibility {
	
	public static void elegible(int exp) {
		if(exp<10) {
			throw new ArithmeticException("This persion is not elegible for seniour Admin post.");
		}else {
			System.out.println("Person is Elegible");
		}
	}
	
	
	public static void main(String[] args) {
		
		
		elegible(9);
	}

}
