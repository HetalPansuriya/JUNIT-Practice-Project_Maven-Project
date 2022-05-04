package TestCases;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

//How to Report Errors and Collect Errors?
//ValidationTest: To compare expected value with actual value..report and collect errors..(can do using Assertions)
public class Validations {
 
	@Rule
	public ErrorCollector errcol = new ErrorCollector();	//to fail test
	
	
@Test
public void validate() {
	
	String expectedValue="ABC"; //read from XLS or Properties file
	String actualValue="abc";	//read from Selenium..using driver.findelement/we extract from webpage
	System.out.println("Start");
	try {
	Assert.assertEquals(expectedValue, actualValue);
	}catch(Throwable e) {
		System.out.println("Some Error"+e.getMessage());
		//fail
		errcol.addError(e);
	}
	System.out.println("End");
	try {
	Assert.assertTrue("Error Message", 4>12);	//for passing //or
	}catch(Throwable e) {
		System.out.println("Some Error"+e.getMessage());
		//fail
		errcol.addError(e);		//have to continuously use this errcl otherwise it'll only show last erro
	}
	//Assert.assertTrue("Error Message-Element not Found", isElementPresent("id"))
	//Assert.assertFalse(actualValue, false);	//for failing
	//Assert.fail();////when u r sure that test should be fail
	//Assert.fail("Had to be logged in but not logged in");
}
}
