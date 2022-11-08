package com.java_oops.exception_handeling;

import java.io.IOException;

class Car {

	public void carBreak() throws IOException {

		throw new IOException("Sorry! This Car Break is not working....");

	}
}

public class ThrowsTesting extends Car {

	public static void main(String[] args) {

		ThrowsTesting test = new ThrowsTesting();
		try {
			test.carBreak();
		}

		catch (IOException e) {

			System.out.println("Exception is Handled" + e);
		}

	}

}
