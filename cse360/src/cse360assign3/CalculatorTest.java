/**
 * 
 */
package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * @author Angel Diaz
 * @version 17 FEB 2016
 * @pin 303
 * 
 */
public class CalculatorTest {

	/**
	 * Test method for {@link cse360assign3.Calculator#Calculator()}.
	 */
	@Test
	public void testCalculator() {
		Calculator calculator = new Calculator();
		assertNotNull(calculator);
	}

	/**
	 * Test method for {@link cse360assign3.Calculator#getTotal()}.
	 */
	@Test
	public void testGetTotal() {
		Calculator calculator = new Calculator();
		assertEquals(0, calculator.getTotal());
		calculator.add(10);
		assertEquals(10, calculator.getTotal());
	}

	/**
	 * Test method for {@link cse360assign3.Calculator#add(int)}.
	 */
	@Test
	public void testAdd() {
		Calculator calculator = new Calculator();
		assertEquals(0, calculator.getTotal());
		calculator.add(100);
		assertEquals(100, calculator.getTotal());
	}

	/**
	 * Test method for {@link cse360assign3.Calculator#subtract(int)}.
	 */
	@Test
	public void testSubtract() {
		Calculator calculator = new Calculator();
		calculator.add(100);
		calculator.subtract(50);
		assertEquals(50, calculator.getTotal());
		calculator.subtract(50);
		assertEquals(0, calculator.getTotal());
	}

	/**
	 * Test method for {@link cse360assign3.Calculator#multiply(int)}.
	 */
	@Test
	public void testMultiply() {
		Calculator calculator = new Calculator();
		calculator.add(10);
		calculator.multiply(10);
		assertEquals (100, calculator.getTotal());
	}

	/**
	 * Test method for {@link cse360assign3.Calculator#divide(int)}.
	 */
	@Test
	public void testDivide() {
		Calculator calculator = new Calculator();
		calculator.add(100);
		calculator.divide(10);
		assertEquals(10, calculator.getTotal());
		calculator.divide(0);
		assertEquals(0, calculator.getTotal());
	}

	/**
	 * Test method for {@link cse360assign3.Calculator#getHistory()}.
	 */
	@Test
	public void testGetHistory() {
		fail("Not yet implemented");
	}

}
