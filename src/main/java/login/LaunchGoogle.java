package login;



import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
 
public class LaunchGoogle extends xpath{
	
	public LaunchGoogle() throws MalformedURLException {
		//System.setProperty("webdriver.chrome.driver",getDriverPath());
		ChromeOptions options = new ChromeOptions();
		URL url = new URL("http://localhost:4444/wd/hub");        
        driver = new RemoteWebDriver(url, options);
		//driver =  new ChromeDriver();
		driver.get(getApplicationUrl());
		driver.manage().window().maximize();
	}
}
