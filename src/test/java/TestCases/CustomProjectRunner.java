package TestCases;


//it will run all files together of this package

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
LoginTest.class,
IgnoreTest.class,
ShopMobilePhone.class,
Validations.class,

})
public class CustomProjectRunner {

}
//generate report
//run-command prompt-ANT/MAVEN
//create EXE file 

