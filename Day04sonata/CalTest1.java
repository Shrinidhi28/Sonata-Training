package com.sonata;



import org.junit.Test;

import org.junit.jupiter.api.Assertions;

public class CalTest1 {

	@Test
	public void addTest1() {
		Calculator c1=new Calculator();
		int x =c1.div(1,1);
		Assertions.assertThrows(ArithmeticException.class,()-> c1.div(2, 0),"this is an error");
		

	}
	@Test
	public void addTest2() {
		Calculator c1=new Calculator();
		int x =c1.div(1,1);
		Assertions.assertThrows(ArithmeticException.class,()-> c1.div(2, 1),"this is an error");
		
	}

}
