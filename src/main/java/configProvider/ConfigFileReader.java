package configProvider;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ConfigFileReader {
	private Properties properties;
	private final String propertyFilePath= "Config//config.properties";

	
	public ConfigFileReader(){
		BufferedReader reader;		
		try {
			
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("config.properties not found at " + propertyFilePath);
		}		
	}
	
	public String getDriverPath(){
		String driverPath = properties.getProperty("driverPath");
		if(driverPath!= null) return driverPath;
		else throw new RuntimeException("driverPath not specified in the config.properties file.");		
	}
	
	public long getImplicitlyWait() {		
		String implicitlyWait = properties.getProperty("implicitlyWait");
		if(implicitlyWait != null) return Long.parseLong(implicitlyWait);
		else throw new RuntimeException("implicitlyWait not specified in the config.properties file.");		
	}
	
	public String getApplicationUrl() {
		String url = properties.getProperty("url");
		if(url != null) return url;
		else throw new RuntimeException("url not specified in the config.properties file.");
	}
	
	public String getPassword() {
		String password = properties.getProperty("password");
		if(password != null) return password;
		else throw new RuntimeException("password not specified in the config.properties file.");
	}
	
	public String getPhoneNumber() {
		String number = properties.getProperty("phoneNumber");
		if(number != null) return number;
		else throw new RuntimeException("phoneNumber not specified in the config.properties file.");
	}
	
	public String getExcelPath() {
		String excelPath = properties.getProperty("excelPath");
		if(excelPath != null) return excelPath;
		else throw new RuntimeException("phoneNumber not specified in the config.properties file.");
	}
	
}
