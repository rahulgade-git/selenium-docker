package login;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import configProvider.ConfigFileReader;

public class xpath extends ConfigFileReader{
	
	  public static RemoteWebDriver driver;
	//  public static ChromeDriver driver;  	 
//public static ConfigFileReader config = new ConfigFileReader();
public String acceptAllCookies = "(//button/div[contains(text(),'All')])[2]";
//public String signInBtn = "//span[text()='Sign in']";
public String signInBtn = "//a[@alt='Sign up' or text()='Sign up' or @id='createacc']";
/*
 * public String changeLanguage = "//a[text()='English']"; public String
 * selectFrame = "//iframe[@name='callout']"; public String frameSignInBtn =
 * "//a[@aria-label='Sign in']"; public String createAccountLink =
 * "//span[text()='Create account']"; public String selectPersonalUseRadioBtn =
 * "//span[text()='For my personal use']"; public String inputFirstName =
 * "//input[@id = 'firstName']"; public String inputLastName =
 * "//input[@id = 'lastName']"; public String nextBtn =
 * "//div[@id = 'collectNameNext']"; public String selectMonth =
 * "//select[@id = 'month']"; public String inputDay = "//input[@id = 'day']";
 * public String inputYear = "//input[@id = 'year']"; public String selectGender
 * = "//select[@id = 'gender']"; public String ageNextBtn =
 * "//div[@id = 'birthdaygenderNext']"; public String createEmailRadioBtn =
 * "//div[text() = 'Create your own Gmail address']"; public String
 * inputGmailAddress = "//input[@name = 'Username']"; public String
 * inputPassword = "//input[@name = 'Passwd']"; public String
 * inputConfirmPassword = "//input[@name = 'PasswdAgain']"; public String
 * passwordNextBtn = "//div[@id = 'createpasswordNext']";
 */
public String inputFirstName = "//input[@name = 'firstName']";
public String inputLastName = "//input[@name = 'lastName']";
public String inputEmailAddress = "//input[@name = 'userId']";
public String inputEmailPassword = "//input[@name = 'password']";
public String selectMonth = "//select[@name = 'mm']";
public String inputDay = "//input[@name = 'dd']";
public String inputYear = "//input[@name = 'yyyy']";
public String btnContinue = "//button[@name = 'signup']";
public String inputPhone = "//input[@name = 'phone']";
public String messageUrl = "https://messages.google.com/web/conversations";
public String openMessage = "//span[contains(text(),'Yahoo')]";
public String readMessageCode = "//div[@class='ng-star-inserted' and contains(text(),'Yahoo')]";
public String inputCode = "//input[@name = 'code']";
public String btnVerifyCode = "//button[@name = 'verifyCode']";
public String frameCaptcha = "//iframe[@title='reCAPTCHA']";
public String chkboxCaptcha = "//div[@class='recaptcha-checkbox-checkmark']";
public String frameImgCaptcha = "//iframe[@title='recaptcha challenge expires in two minutes']";
public String btnRefresh = "//button[@id='recaptcha-reload-button']";
public String btnSkip = "//button[@id='recaptcha-verify-button' and text()='Skip']";

public static void enterValue(WebElement element, String text) {
    for(int i = 0; i < text.length(); i++) {
        try {
            Thread.sleep(5);
        } catch(InterruptedException e) {}
        String s = new StringBuilder().append(text.charAt(i)).toString();
        element.sendKeys(s);
    }
}
}
