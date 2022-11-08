package com.java_oops.date;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateTesting {

	public static void main(String[] args) {

		LocalDate date= LocalDate.now();
		LocalDate yesterday= date.minusDays(1);
		LocalDate tomorrow = date.plusDays(1);
		LocalDateTime dateTime = LocalDateTime.now();
		
		System.out.println("Current Date is :"+date);
		System.out.println("Yesterday Date is :"+yesterday);
		System.out.println("Tomorrow Date is :"+tomorrow);
		System.out.println("Current Date Time is :"+ dateTime);
		
	}

}
