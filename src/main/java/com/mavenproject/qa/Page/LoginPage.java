package com.mavenproject.qa.Page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.mavenproject.qa.Base.TestBase;

public class LoginPage extends TestBase {
	// Declaration
	
			@FindBy(xpath ="//img[@alt='Facebook']") private WebElement login_fblogo;
			@FindBy(xpath ="//h2[contains(text(),'the people in your life')]") private WebElement login_fbtagline;
			@FindBy(xpath ="//input[@id='email']") private WebElement username;
			@FindBy(xpath ="//input[@id='pass']") private WebElement password;
			@FindBy(xpath ="//button[@type='submit']") private WebElement login_btn;
			@FindBy(xpath ="//a[text()='Forgotten password?']") private WebElement forgotpassword;
			@FindBy(xpath ="//a[@data-testid='open-registration-form-button']") private WebElement createnewaccbtn;
			@FindBy(xpath ="//a[text()='Create a Page']") private WebElement createpagelink;
			@FindBy(xpath ="//div[@id='pageFooterChildren']/ul/li/a") private List <WebElement> footerlinks;

			// intialization
			
			public LoginPage(WebDriver driver) {
				PageFactory.initElements(driver, this);
			}
			
			
			// usage
			
			public void verifyFacebookLoginPageLogo() {
				Assert.assertTrue(login_fblogo.isDisplayed(), "Fb logo is not displayed on login page");
				Reporter.log("verifyFacebookLoginPageLogo",true);
			}
			
			public void verifyFacebookLoginPageTagline() {
				Assert.assertTrue(login_fbtagline.isDisplayed(), "Fb Tagline is not displayed on login page");
				Reporter.log("verifyFacebookLoginPageTagline",true);
			}
			
			public void verifyFacebookLoginPageCreateNewAccountBtn() {
				Assert.assertTrue(createnewaccbtn.isDisplayed(), "Fb New Account Button is not displayed on login page");
				Reporter.log("verifyFacebookLoginPageCreateNewAccountBtn",true);
			}
			
			public void verifyFacebookLoginPageCreatePage() {
				Assert.assertTrue(createpagelink.isDisplayed(), "Fb Crete Page Link is not displayed on login page");
				Reporter.log("verifyFacebookLoginPageCreatePage",true);
			}
			
			public void setFacebookLoginPageUsername() {
				Assert.assertTrue(username.isDisplayed(), "Fb Username Field is not displayed on login page");
				Assert.assertTrue(username.isEnabled(), "Fb Username Field is not enabled on login page");
				username.sendKeys("Paresh");
				Reporter.log("setFacebookLoginPageUsername",true);
			}
			
			public void setFacebookLoginPagePassword() {
				Assert.assertTrue(password.isDisplayed(), "Fb Username Field is not displayed on login page");
				password.sendKeys("Paresh@9874895278922547923");
				Reporter.log("setFacebookLoginPagePassword",true);
			}
			
			public void clickFacebookLoginPageLoginBtn() {
				Assert.assertTrue(login_btn.isDisplayed(), "Fb Login Button is not displayed on login page");
				Assert.assertTrue(login_btn.isEnabled(), "Fb Login Button is not Enabled on login page");
				login_btn.click();
				Reporter.log("clickFacebookLoginPageLoginBtn",true);
			}
			
			public void verifyFacebookLoginPageFooterLinks() {
				Assert.assertEquals(footerlinks.size(), 31);
				for(int i=0; i<footerlinks.size();i++) {
					System.out.println(footerlinks.get(i).getText());
				}
				Reporter.log("verifyFacebookLoginPageLogo",true);
			}

}
