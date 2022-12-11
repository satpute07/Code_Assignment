package org.utilies;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseUtility {
	public WebDriver startUp(String bName, String url){
		WebDriver driver= null;
		
		if(bName.equalsIgnoreCase("ch")||bName.equalsIgnoreCase("Chrome")){
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			
		}else if(bName.equalsIgnoreCase("ff")||bName.equalsIgnoreCase("firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		}else {
			System.out.println("Invalid Browser Name");
		}
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}
}
