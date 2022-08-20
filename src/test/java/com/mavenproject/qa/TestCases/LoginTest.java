package com.mavenproject.qa.TestCases;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.mavenproject.qa.Base.TestBase;
import com.mavenproject.qa.Page.LoginPage;



public class LoginTest extends TestBase {
	
	@BeforeClass
	public void setup() {
		Crossbrowser("chrome");
	}
	
	@AfterClass
	public void teardown() {
		driver.close();
	}
	
	@Test
	public void FacebookLoginPageTest() {
		
		LoginPage lp = new LoginPage(driver);
		lp.verifyFacebookLoginPageLogo();
		lp.verifyFacebookLoginPageTagline();
		lp.verifyFacebookLoginPageCreateNewAccountBtn();
		lp.verifyFacebookLoginPageCreatePage();
		lp.verifyFacebookLoginPageFooterLinks();
		lp.setFacebookLoginPageUsername();
		lp.setFacebookLoginPagePassword();
		lp.clickFacebookLoginPageLoginBtn();
	}

}
