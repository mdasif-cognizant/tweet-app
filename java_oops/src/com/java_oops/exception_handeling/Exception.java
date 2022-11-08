package com.java_oops.exception_handeling;

public class Exception {

	public static void main(String[] args) {

		try {
			int i = 100 / 0;
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		
		System.out.println("Program Completed Gracefully");

	}

}
