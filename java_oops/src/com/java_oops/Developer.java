package com.java_oops;

//Child Class of Employee
public class Developer extends Employee {

	int bonus = 20000;
//	int totalSalary = salary + bonus;

	public static void main(String[] args) {

		Developer dev1 = new Developer();
		dev1.totalSalary(dev1.baseSalary, dev1.bonus);
	}

}
