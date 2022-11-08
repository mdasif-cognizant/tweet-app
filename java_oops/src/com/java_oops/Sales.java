package com.java_oops;

public class Sales extends Employee {
	
	
	int bonus=20000;
	int insentive=5000;
	
	
	public void working() {

		System.out.println("Sales Employee is working.......");
	}

	public static void main(String[] args) {
		
		Sales sale=new Sales();
		
		sale.totalSalary(sale.baseSalary, sale.bonus,sale.insentive);
		sale.working();
		

	}

}
