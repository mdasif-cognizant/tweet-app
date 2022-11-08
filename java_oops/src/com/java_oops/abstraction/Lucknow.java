package com.java_oops.abstraction;

public class Lucknow implements IPL {

	@Override
	public void play() {
		System.out.println("Lucknow is playing good in 2022.");

	}

	public static void main(String[] args) {

		Lucknow lkw = new Lucknow();
		lkw.play();

	}

}
