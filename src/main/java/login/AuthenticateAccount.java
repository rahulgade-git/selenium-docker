package login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticateAccount extends xpath {
	String code;

	public void enterMobileNumber() throws InterruptedException {
		WebElement phone = driver.findElement(By.xpath(inputPhone));
		phone.click();
		phone.sendKeys(getPhoneNumber());
		Thread.sleep(1000);
		driver.findElement(By.xpath(btnContinue)).click();
		Thread.sleep(1000);
		WebElement frame = driver.findElement(By.xpath("//iframe"));
		int fsize = 0;
			driver.switchTo().frame(fsize);
			driver.switchTo().frame(0);
			if (driver.findElements(By.xpath(chkboxCaptcha)).size() > 0) {
				driver.findElement(By.xpath("//label[@id='recaptcha-anchor-label']")).click();
			}
		/*
		 * driver.switchTo().frame(driver.findElement(By.xpath(
		 * "//iframe[@id='recaptcha-iframe']"))); WebElement reCaptcha =
		 * driver.findElement(By.xpath(frameCaptcha)); int count =
		 * driver.findElements(By.xpath(frameCaptcha)).size(); if(count>0) {
		 * //driver.switchTo().frame(reCaptcha); //WebElement chkCaptcha =
		 * driver.findElement(By.xpath(chkboxCaptcha)); //chkCaptcha.click();
		 * driver.findElement(By.xpath("//iframe")).click();
		 * driver.switchTo().frame(reCaptcha); driver.switchTo().frame(try)
		 * driver.findElement(By.xpath(chkboxCaptcha)).click();
		 * //driver.findElement(By.xpath("//*[contains(text(),'Prove')]")).sendKeys(Keys
		 * .TAB); driver.findElement(By.xpath("//h1")).sendKeys(Keys.ENTER);*/
		  Thread.sleep(1000); 
		  System.out.println(driver.findElements(By.xpath("//iframe")).size());
		  System.out.println(driver.findElements(By.xpath("//iframe")));
		  WebElement test = driver.findElement(By.xpath("//iframe"));
		  driver.switchTo().frame(0);
		  driver.switchTo().frame(1);
		  System.out.println(driver.findElements(By.xpath("//iframe")).size());
		  System.out.println(driver.findElements(By.xpath("//iframe")));
		  WebElement imgCaptcha = driver.findElement(By.xpath(frameImgCaptcha));
		  driver.switchTo().frame(imgCaptcha); 
		  int countSkip =  driver.findElements(By.xpath(btnSkip)).size(); 
		  while(countSkip<0) {
		  driver.findElement(By.xpath(btnRefresh)).click(); 
		  }
		  driver.findElement(By.xpath(btnSkip)).click(); 
		  Thread.sleep(1000); 
		
	}

	public void openCodeReader() throws InterruptedException {
		String window = driver.getWindowHandle();
		WebDriver drivernew = new ChromeDriver();
		drivernew.get(messageUrl);
		drivernew.manage().window().maximize();
		Thread.sleep(10000);
		drivernew.findElement(By.xpath(openMessage)).click();
		Thread.sleep(2000);
		WebElement readCode = drivernew.findElement(By.xpath(readMessageCode));
		readCode.click();
		String message = readCode.getText();
		code = message.substring(35, 39);
		Thread.sleep(2000);
		drivernew.quit();
		driver.switchTo().window(window);
	}

	public void enterVerificationCode() throws InterruptedException {
		WebElement inputAuthCode = driver.findElement(By.xpath(inputCode));
		inputAuthCode.click();
		inputAuthCode.sendKeys(code);
		Thread.sleep(2000);
		driver.findElement(By.xpath(btnVerifyCode)).click();
		Thread.sleep(2000);
	}
}
