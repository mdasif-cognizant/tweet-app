package com.java_oops;

public class HR extends Employee {

	int bonus = 10000;
//	int totalSalary = salary + bonus;

	public static void main(String[] args) {

		HR hr1 = new HR();
//		System.out.println("Total Salary of Current HR is " + hr1.totalSalary);
		hr1.totalSalary(hr1.baseSalary, hr1.bonus);

	}

}
