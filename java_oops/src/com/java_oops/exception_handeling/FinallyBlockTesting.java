package com.java_oops.exception_handeling;

public class FinallyBlockTesting {

	public static void main(String[] args) {
 
		try {
			System.out.println("Inside try Block");
			int i=100/0;
			
		}
		catch(NullPointerException e){
			System.out.println(e);
			
		}
		finally {
			System.out.println("Hi! You Reached Finally Block");
		}
		
		System.out.println("Inside Main Method");
	}

}
