import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import sun.security.util.Length;

/**
 * 
 */

/**
 * @author edragta
 *
 */
public class MyTestClass {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() {
		MyClass tester=new MyClass();
		 // assert statements
        assertTrue(tester.multiply(10, 10)==100);
        assertTrue(tester.multiply(10, 1)==10);
        assertTrue(tester.multiply(10, 11)==110);
		//fail("Not yet implemented");
	}
	@Test
	public void test2() {
		assertTrue("Current System Time", System.currentTimeMillis()>1);
		
	}
	@Test
	public void test3() {
		String S1="devendra.gupta@ericsson.com";
		assertTrue("myEmail id Length",S1.length()>10);
	}
	

}
