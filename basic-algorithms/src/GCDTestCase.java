import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class GCDTestCase {

	static GCD gcd = null;
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("BEFORE");
		gcd = new GCD();
	}
	
	/*
	@Before
	public void before() {
		System.out.println("BEFORE EACH");
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("AFTER");
		
	}
	@After
	public void after() {
		System.out.println("AFTER EACH");
	}
	
	@Test
	public void test_with_negative_a_and_positive_b() {	
		int expected = 1;
		int actual = gcd.calculate_rec(-1, 10);
		
		assertEquals(expected, actual);
	}
*/

	@Test
	public void test_with_positive_a_and_negative_b() {
		int expected = 1;
		int actual = gcd.calculate_rec(10, -1);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_with_negative_a_and_negative_b() {
		int expected = 1;
		int actual = gcd.calculate_rec(-10, -1);
		
		assertEquals(expected, actual);
	}

	@Test
	public void test_with_positive_a_and_positive_b() {
		int expected = 3;
		int actual = gcd.calculate_rec(12, 21);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_with_zero_a_and_positive_b() {
		int expected = 14;
		int actual = gcd.calculate_rec(0, 14);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_when_a_is_equal_b() {
		int values[] = {-1, -2, 1, 2, 0};
		for (int value: values) {
			int actual = gcd.calculate_rec(value, value);
			assertEquals(Math.abs(value), actual);
		}

	}
}
