package TestCases;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	private static Calculator calculator;
	@BeforeClass
	public static void init() {
	
		calculator = new Calculator();
		System.out.println("object created");
	}
	@AfterClass
	public static void destroy() {
		calculator = null ;
		System.out.println("object detsroyed");
	}
	
	@Test
	public void test_add_success() {
		assertEquals(17, calculator.add(12, 5));
		System.out.println("inside test");
	}
	@Test
	public void test_sub_success() {
		assertEquals(7, calculator.sub(12,5));
		System.out.println("hey");
	}
	@Test
	public void test_multi_success() {
		assertEquals(12, calculator.multi(2,6));
		System.out.println("hey");
	}
	@Test
	public void test_div_success() {
		assertEquals(2, calculator.div(12,6));
		System.out.println("hey");
	}
	@Test
	public void test_prime_number() {
		assertEquals(true, calculator.isPrime(5));
	}

}
