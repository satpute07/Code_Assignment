package org.testNGEx1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.utilies.BaseUtility;

public class Example01 {
  @Test
  public void testCase1() {
	  System.out.println("Test Case 1");
	  BaseUtility bu= new BaseUtility();
		String url= "https://en.wikipedia.org/wiki/Pushpa:_The_Rise";
		WebDriver driver= bu.startUp("ch", url);
		WebElement ele1= driver.findElement(By.xpath
				("//body[1]/div[3]/div[3]/div[5]/div[1]/table[1]/tbody[1]/tr[12]/td[1]/div[1]/ul[1]/li[1]"));
		WebElement ele2= driver.findElement(By.xpath
				("//td[normalize-space()='India']"));
		System.out.println("Realese Date :"+ ele1.getText());
		System.out.println("Country :"+ ele2.getText());
  }
  @Test
  public void testCase2() {
	  System.out.println("Test Case 2");
	  BaseUtility bu= new BaseUtility();
	  String url= "https://www.imdb.com/title/tt9389998/?ref_=nv_sr_srsg_0";
	  WebDriver driver= bu.startUp("ch", url);    
	  WebElement cele1= driver.findElement(By.xpath
			("//li[@data-testid='title-details-releasedate']//div[@class='ipc-metadata-list-item__content-container']"));
	WebElement cele2= driver.findElement(By.xpath
			("//a[normalize-space()='India']"));
	System.out.println("Realese Date :"+ cele1.getText());
	System.out.println("Country :"+ cele2.getText());
  }
}