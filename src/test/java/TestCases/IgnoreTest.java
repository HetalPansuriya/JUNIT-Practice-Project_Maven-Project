package TestCases;

import org.junit.Assume;
import org.junit.FixMethodOrder;
//import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING) // to run test in order
public class IgnoreTest {

	@Test
	public void test_a_searchForMobile() {
		System.out.println("Searching For Mobile");
	}

	@Test
	public void test_b_selectMobile() {
		System.out.println("Selecting Mobile");
	}

	//@Ignore				//it will ignore this test
	@Test
	public void test_c_checkout() {
		//check xls
		Assume.assumeTrue(false);		//or 2nd way //this line will also ignore this test
		System.out.println("Checking Out");
	}
}
