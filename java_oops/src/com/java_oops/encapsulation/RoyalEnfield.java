package com.java_oops.encapsulation;

public class RoyalEnfield {
	
	public static void main(String[] args) {
		Bike classic =new Bike();
		classic.setName("Royal Enfield Classic 350 2022 Edition");
		classic.setPrice(280000.0);
		classic.setCc(350);
		classic.setColor("Stealth Black");
		
		System.out.println(classic.getName());
		System.out.println(classic.getPrice());
	}

}
