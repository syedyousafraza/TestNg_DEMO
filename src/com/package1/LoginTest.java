package com.package1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class LoginTest {

	private static final String String = null;
	public static WebDriver driver;
	public WebDriverWait wait;
	public String vars;


	@Test
	public void SuccessLogin() {
		//	String filepath = "./chromeDriver/chromedriver.exe";
		//	System.setProperty("webdriver.chrome.driver", filepath);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yousaf\\eclipse-workspace\\TestNgDemo\\chromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		//VERIFY USER LANDS ON PRODUCTS PAGE
		String pageTitle = driver.findElement(By.xpath("//span[@class='title']")).getText();
		String expectedTitle = "PRODUCTS";

		if (pageTitle.equals(expectedTitle)) {
			System.out.println("VERIFY USER LANDS ON PRODUCTS PAGE - PASS");
		} else
			System.out.println("VERIFY USER LANDS ON PRODUCTS PAGE - FAIL");	
		}
		
		@Test
		public void verifyLogout() {
					
			driver.findElement(By.xpath("//button[normalize-space()='Open Menu']")).click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			// Implicit WAIT

			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();

			// explicit wait condition
			WebDriverWait w = new WebDriverWait(driver, 3);
			// presenceOfElementLocated condition
			w.until(ExpectedConditions.presenceOfElementLocated(By.id("login-button")));

			if (driver.findElement(By.id("login-button")).isDisplayed()) {
				System.out.println("Verify User Logout Successfully - Pass");
			} else
				System.out.println("Verify User Logout Successfully - FAIL");
		};
	
	@BeforeClass
	public void beforeClass() {
	}

	@AfterClass
	public void afterClass() {
	}

}
