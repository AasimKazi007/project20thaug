package com.mavenproject.qa.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.mavenproject.qa.Base.TestBase;

public class RegistrationPage extends TestBase{
	// Declaration  ==> webelements
    // initialization ==> pagefactory
    // usage  ==> validation ==> methods
	
	 // Declaration.
	
 // Object Repository
	@FindBy (xpath ="//img[@alt='Facebook']") private WebElement reg_fblogo;
	@FindBy (xpath ="//a[text()='Already have an account?']") private WebElement already_acc;
	@FindBy (xpath ="//a[@title='Sign up for Facebook']") private WebElement signuplink;
	@FindBy (name ="firstname") private WebElement firstname;
	@FindBy (name ="lastname") private WebElement surname;
	@FindBy (name ="reg_email__") private WebElement mob_email;
	@FindBy (name ="reg_passwd__") private WebElement password;
	@FindBy (name ="birthday_day") private WebElement birthday;
	@FindBy (name ="birthday_month") private WebElement birthmonth;
	@FindBy (name ="birthday_year") private WebElement birthyear;
	@FindBy (xpath ="//label[text()='Male']") private WebElement gender_male;
	@FindBy (xpath ="//label[text()='Female']") private WebElement gender_female;
	@FindBy (name ="websubmit") private WebElement signupbtn;
	
	// initalization
	public RegistrationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	// usage.
	
	public void  clickFacebookSignupLink() {
		signuplink.click();
	}
	
	public void verifyFacebookRegistrationPagefblogo() {
		Assert.assertTrue(reg_fblogo.isDisplayed(), "The fb logo is not displayed on registration page");
	}
	
	public void verifyFacebookRegistrationPageAlreadyAccount() {
		Assert.assertTrue(already_acc.isDisplayed(), "The fb already having account option is not displayed on registration page");
		Assert.assertEquals(already_acc.getText(), "Already have an account?");
	}
	
	public void setFacebookRegistrationPageFirstName(String fn) {
		firstname.sendKeys(fn);
	}
	
	public void setFacebookRegistrationPageLastName() {
		surname.sendKeys("ZXCVBNM");
	}
	
	public void setFacebookRegistrationPageMob_Email() {
		mob_email.sendKeys("ZXCVBNM@gmail.com");
	}
	
	public void setFacebookRegistrationPagePassword() {
		password.sendKeys("ABC@123654789");
	}
	
	public void setFacebookRegistrationPageBirthDay() {
		Select bday= new Select(birthday);
		Assert.assertTrue(birthday.isDisplayed(), "The Birthday option is not displayed on registration page");
		Assert.assertFalse(birthday.isSelected());
		bday.selectByVisibleText("19");
	}
	
	public void setFacebookRegistrationPageBirthMonth() {
		Select bmonth= new Select(birthmonth);
		Assert.assertTrue(birthmonth.isDisplayed(), "The Birthmonth option is not displayed on registration page");
		Assert.assertFalse(birthmonth.isSelected());
		bmonth.selectByVisibleText("Mar");
	}
	
	public void setFacebookRegistrationPageBirthYear() {
		Select byear= new Select(birthyear);
		Assert.assertTrue(birthyear.isDisplayed(), "The Birthyear option is not displayed on registration page");
		Assert.assertFalse(birthyear.isSelected());
		byear.selectByVisibleText("1955");
	}
	
	public void setFacebookRegistrationPageGender( String gender) {
		if(gender.equalsIgnoreCase("male")) {
			gender_male.click();
		}else if(gender.equalsIgnoreCase("female")) {
			gender_female.click();
		}else {
			System.out.println("User has provided the wrong input");
		}
	}
	
	public void clickFacebookRegistrationPageSubmitBtn(){
		signupbtn.click();
	   
	   
	} 
}
