package login;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import configProvider.ExcelFileReader;

public class AccountCreation extends xpath{
	public void signin() throws Exception {
		ExcelFileReader excelReader = new ExcelFileReader();
		driver.findElement(By.xpath(signInBtn)).click();
		//driver.switchTo().frame((WebElement) By.xpath(frame));
		//driver.findElement(By.xpath(frameSignIn)).click();
		Thread.sleep(1000);
		WebElement firstName = driver.findElement(By.xpath(inputFirstName));
		firstName.click();
		//firstName.sendKeys(excelReader.readExcel());
		enterValue(firstName,excelReader.readExcel());
		WebElement lastName = driver.findElement(By.xpath(inputLastName));
		lastName.click();
		//lastName.sendKeys(excelReader.lastName);
		enterValue(lastName,excelReader.lastName);
		WebElement email = driver.findElement(By.xpath(inputEmailAddress));
		email.click();
		//email.sendKeys(excelReader.emailAddress);
		enterValue(email,excelReader.emailAddress);
		email.sendKeys(Keys.TAB);
		WebElement password = driver.findElement(By.xpath(inputEmailPassword));
		password.click();
		//password.sendKeys(getPassword());
		enterValue(password,getPassword());
		password.sendKeys(Keys.TAB);
		WebElement month = driver.findElement(By.xpath(selectMonth));
		month.click();
		Select select = new Select(month);
		select.selectByValue("3");
		driver.findElement(By.xpath("//*[contains(text(),'Create a Yahoo')]")).click();
		//lastName.sendKeys(Keys.TAB);
		WebElement day = driver.findElement(By.xpath(inputDay));
		day.click();
		//day.sendKeys(excelReader.day);
		enterValue(day,excelReader.day);
		day.sendKeys(Keys.TAB);
		WebElement year = driver.findElement(By.xpath(inputYear));
		year.click();
		//year.sendKeys(excelReader.year);
		enterValue(year,excelReader.year);
		driver.findElement(By.xpath(btnContinue)).click();
		Thread.sleep(2000);
	}
 }
