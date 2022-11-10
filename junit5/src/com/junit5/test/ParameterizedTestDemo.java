package com.junit5.test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTestDemo {

	//Value Source
	@ParameterizedTest(name ="{index} - run with the args={0}")
	@ValueSource (ints = {1,7,26,4})
	public void valueSourceTest(int args) {
		System.out.println(args);
		
	}
	
	
	
	//Enum Source
	
	enum Laptop{
		Dell,HP,Lenovo,IBM
	}
	
	@ParameterizedTest()
	@EnumSource(Laptop.class)
	public void enumSourceTest(Laptop laptop) {
		System.out.println(laptop);
		
	}
}
