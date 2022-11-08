package com.java_oops;

//Parent Class
class Employee {
	int baseSalary = 25000;

	public void totalSalary(int baseSalary, int bonus) {
		int total = baseSalary + bonus;
		System.out.println("Salary :  " + total);

	}

	public void totalSalary(int baseSalary, int bonus, int insentive) {
		int total = baseSalary + bonus + insentive;
		System.out.println("Salary :  " + total);

	}

	public void working() {

		System.out.println("Employee is working.......");

	}
}