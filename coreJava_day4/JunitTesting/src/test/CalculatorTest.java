package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.Calculator;

class CalculatorTest {

	@Test
	void testAdd() {
		
		
			Calculator cal = new Calculator();
			
		int actual =	cal.add(4, 5);
		
			assertEquals(9, actual);
		
	}

	@Test
	void testSub() {
		
		Calculator cal = new Calculator();
		
		int actual =	cal.sub(5,5);
		
			assertEquals(0, actual);
		
	}

}
