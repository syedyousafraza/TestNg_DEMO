package com.package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SecondCase extends LoginTest {
  @Test
  public void f() {	
//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yousaf\\eclipse-workspace\\TestNgDemo\\chromeDriver\\chromedriver.exe");
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	driver.get("https://www.saucedemo.com/");	
	driver.findElement(By.xpath("//div[@class='bot_column']")).isDisplayed();
	
  }
}
