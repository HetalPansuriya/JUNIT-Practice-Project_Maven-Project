package TestCases;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

//To run with different sets of userNames and passwords

	//Step 1:mention the annotation - @RunWith
	@RunWith(Parameterized.class)
	public class LoginTest {
	// Step 2: declare global variables
	String username;
	String password;
	String browser;
	String email;
	
	// Step 3: have to make a constructor../build a constructor
	public LoginTest(String username, String password, String browser, String email) {
	this.username=username;
	this.password=password;
	this.browser=browser;
	this.email= email;
	}
	@Test
	public void loginTest() {
		System.out.println(username+"......."+password+"......"+browser+"......"+email);
	}
	//Step 4 : declare an annotation @Parameters.......number of rows*number of time u want to run the test=
	@Parameters
	public static Collection<Object[]>getData(){
		
		Object[][] data = new Object[4][4]; 	//want to run test 4 time = 4rows  ..3 columns
		
		//1st Row
		data[0][0]="U1";		//username1
		data[0][1]="P1";		//password1
		data[0][2]="Mozilla";	//Browser
		data[0][3]= "eMail1";		//email1
		//2nd Row
		data[1][0]="U2";		//username1
		data[1][1]="P2";		//password1
		data[1][2]="Chrome";	//Browser
		data[1][3]= "eMail2";
		//3rd Row
		data[2][0]="U3";		//username1
		data[2][1]="P3";		//password1
		data[2][2]="IE";	    //Browser
		data[2][3]= "eMail3";
		//4th Row
		data[3][0]="U4";		//username1
		data[3][1]="P4";		//password1
		data[3][2]="Safari";	//Browser
		data[3][3]= "eMail4";
		
		return Arrays.asList(data);
	}
}
