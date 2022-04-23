package test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assume;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.*;

import junit.Calculator;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
@RunWith(Parameterized.class)
public class CalculatorTest {
	
	enum Type {ADD, SUBTRACT, MULTIPLY, DIVIDE};
	
	@Parameter(0)
	public Type type;
	@Parameter(1)
	public int a1;
	@Parameter(2)
	public int a2;
	@Parameter(3)
	public int result;
	
	/**
	 * defines different types of data with parameters
	 * @return Data as a list
	 */
	@Parameters
	public static Collection<Object[]> data(){
		Object[][] data = new Object[][] {
			{Type.ADD, 2, 1, 3 }, {Type.ADD, 5, 2, 7 },
			{Type.SUBTRACT, 2, 1, 1}, {Type.SUBTRACT, 5, 2, 3 },
			{Type.MULTIPLY, 2, 1, 2}, {Type.MULTIPLY, 5, 2, 10 },
			{Type.DIVIDE, 2, 1, 2 }, {Type.DIVIDE, 5, 2, 2 }
		};
		return Arrays.asList(data);
	}

	/**
	 * tests add function
	 */
	@Test
	public void testAdd() {
		//checks a1 + a2 parameters are added properly
		Assume.assumeTrue(type == Type.ADD);
		Calculator calc = new Calculator();
		Assert.assertEquals(result, calc.add(a1,  a2));
	}

	/**
	 * tests subtract function
	 */
	@Test
	public void testSubtract() {
		//checks a1 - a2 parameters are subtracted properly
		Assume.assumeTrue(type == Type.SUBTRACT);
		Calculator calc = new Calculator();
		Assert.assertEquals(result, calc.subtract(a1, a2));
	}

	/**
	 * tests multiply function
	 */
	@Test
	public void testMultiply() {
		//checks a1 * 2 parameters are multiplied properly
		Assume.assumeTrue(type == Type.MULTIPLY);
		Calculator calc = new Calculator();
		Assert.assertEquals(result, calc.multiply(a1, a2));
	}

	/**
	 * tests divide function
	 */
	@Test
	public void testDivide() {
		//checks a1 / a2 parameters are divided properly
		Assume.assumeTrue(type == Type.DIVIDE);
		Calculator calc = new Calculator();
		Assert.assertEquals(result, calc.divide(a1, a2));
	}

}
