package TestCases;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)//to run test in order
public class ShopMobilePhone {

	@Test
	public void test_a_searchForMobile() {
		System.out.println("Searching For Mobile");
	}
	@Test
	public void test_b_selectMobile() {
		System.out.println("Selecting Mobile");
	}
	@Test
	public void test_c_checkout() {
		System.out.println("Checking Out");
	}
}
