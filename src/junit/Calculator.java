package junit;

/**
 * @author Maya
 */
public class Calculator {
	
	/**
	 * adds values
	 * @param a First int
	 * @param b Second int
	 * @return added ints
	 */
	public int add(int a, int b) {
		//adds
		return a + b;
	}
	
	/**
	 * subtracts values
	 * @param a First int
	 * @param b Second int
	 * @return subtracted ints
	 */
	public int subtract(int a, int b) {
		//subtracts
		return a - b;
	}
	
	/**
	 * multiplies values
	 * @param a First int
	 * @param b Second int
	 * @return multiplied ints
	 */
	public int multiply(int a, int b) {
		//multiplies
		return a * b;
	}
	
	/**
	 * divides values
	 * @param a First int
	 * @param b Second int
	 * @return divided ints
	 */
	public int divide(int a, int b) {
		//divides
		return a / b;
	}

	/**
	 * prints calculator functions
	 * @param args Takes in any number of values
	 */
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println("Addition: " + calc.add(6, 3));
		System.out.println("Subtraction: " + calc.subtract(6, 3));
		System.out.println("Multiplication: " + calc.multiply(6, 3));
		System.out.println("Division: " + calc.divide(6, 3));

	}

}
