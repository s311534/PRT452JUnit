package com.prabhatPRT452.learn;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculationTest {

	private static Calculation testClass;
	
	@Before
	public void setUp() throws Exception {
		testClass = new Calculation();
	}

	@Test
	public void testgrad() {
		//fail("Not yet implemented");
		float x1 = 1;
		float y1 = 2;
		float x2 = 8;
		float y2 = 6;

		float res = (y2 - y1)/(x2 - x1);
		//compare to calculate java
		assertEquals(res, testClass.grad(1, 2, 8, 6), 0.001);

		
	}
	@Test
	public void testdist() {
		//fail("Not yet implemented");
		double x1 = 1;
		double y1 = 10;
		double x2 = 3;
		double y2 = 14;

		double res = Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
		//compare to calculate java
		assertEquals(res, testClass.dist(1, 10, 3, 14), 0.001);

	}
	@Test
	public void testeq() {
			//fail("Not yet implemented");
			double x1 =2;
			double y1=4;
			double gradient =1;
			double output = y1 - (gradient*x1);
			
			String res= "y -"+gradient+"x =" +output;
			assertEquals(res, testClass.eq(x1, y1, gradient));
		}
}
