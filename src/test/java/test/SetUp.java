package test;

import org.testng.annotations.*;

import login.AccountCreation;
import login.AuthenticateAccount;
import login.LaunchGoogle;
import login.xpath;

public class SetUp extends xpath{
	static LaunchGoogle launch;
	static AccountCreation create;
	static AuthenticateAccount authenticate;
@Test             
public void launcher() throws Exception {      
	launch = new LaunchGoogle();
	create = new AccountCreation();
	create.signin();
	authenticate = new AuthenticateAccount();
	//authenticate.enterMobileNumber();
	//authenticate.openCodeReader();
	//authenticate.enterVerificationCode();  
}     
@BeforeTest  
public void beforeTest() {  
System.out.println("before test");  
}     
@AfterTest  
public void afterTest() {  
driver.quit();  
System.out.println("after test");  
}         
}  
