package cse360assign3;

/**
 * 
 * @author Angel Diaz
 * @version 17 FEB 2016
 * @pin 303
 *
 */
public class Calculator {

	private int total;
	private String history = "";
	/**
	 * Creates a new instance of Calculator.
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
		history = Integer.toString(total);
	}
	
	/**
	 * Returns the total.
	 * 
	 * @return
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * Adds value to the total.
	 * 
	 * @param value
	 */
	public void add (int value) {
		total = total + value;
		history = history + " + " + Integer.toString(value);
	}
	
	/**
	 * Subtracts value from total.
	 * 
	 * @param value
	 */
	public void subtract (int value) {
		total = total - value;
		history = history + " - " + Integer.toString(value);
	}
	
	/**
	 * Multiplies total by value.
	 * 
	 * @param value
	 */
	public void multiply (int value) {
		total = total * value;
		history = history + " * " + Integer.toString(value);
	}
	
	/**
	 * Dives the toal by value.
	 * 
	 * @param value
	 */
	public void divide (int value) {
		total = (value == 0) ? 0 : (total / value);
		history = history + " / " + Integer.toString(value);
	}
	
	/**
	 * Returns history.
	 * 
	 * @return
	 */
	public String getHistory () {
		return history;
	}
}