package com.mavenproject.qa.TestCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.mavenproject.qa.Base.TestBase;
import com.mavenproject.qa.Page.RegistrationPage;

public class RegistrationTest extends TestBase {
	
	@BeforeClass
	public void setup() {
		Crossbrowser("chrome");
	}
	
	@AfterClass
	public void teardown() {
		driver.close();
	}
	
	@Test
	public void FacebookRegistrationPageTest() {
	  
		RegistrationPage rgpage = new RegistrationPage(driver);
		rgpage.clickFacebookSignupLink();
		rgpage.verifyFacebookRegistrationPagefblogo();
		rgpage.verifyFacebookRegistrationPageAlreadyAccount();
		rgpage.setFacebookRegistrationPageFirstName("ABCDEFGH");
		rgpage.setFacebookRegistrationPageLastName();
		rgpage.setFacebookRegistrationPageMob_Email();
		rgpage.setFacebookRegistrationPagePassword();
		rgpage.setFacebookRegistrationPageBirthDay();
		rgpage.setFacebookRegistrationPageBirthMonth();
		rgpage.setFacebookRegistrationPageBirthYear();
		rgpage.setFacebookRegistrationPageGender("female");
		rgpage.clickFacebookRegistrationPageSubmitBtn();
	}
}
