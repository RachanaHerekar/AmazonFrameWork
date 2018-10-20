package com.amazon.genericlib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public abstract class BaseClass {
	public static WebDriver driver;
	
	@BeforeClass
	public void configBC()
	{
		System.out.println("Launch the browser");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");
	}
	
	@BeforeMethod()
	public void configBM()
	{
		System.out.println("Login to Amazon:--");
//		Actions act = new Actions(driver);
//		WebElement wb = driver.findElement(By.xpath("//a[@id='nav-link-yourAccount']/span[1]"));
//		act.moveToElement(wb).perform();
//		driver.findElement(By.xpath("//div[@id='nav-flyout-ya-signin']/a/span")).click();
//		driver.findElement(By.id("ap_email")).sendKeys("9742020752");
//		driver.findElement(By.id("continue")).click();
//		driver.findElement(By.xpath("//input[@id='ap_password' and  @type='password']")).sendKeys("amazon");
//		driver.findElement(By.id("signInSubmit")).click();
	}

	@AfterMethod()
	public void configAM()
	{
		System.out.println("Logout from Amazon");
//		Actions act = new Actions(driver);
//		WebElement wb1 = driver.findElement(By.xpath("//a[@id='nav-link-yourAccount']/span[1]"));
//		act.moveToElement(wb1).perform();
//		WebElement wb2 = driver.findElement(By.xpath("//span[text()='Sign Out']"));
//		act.moveToElement(wb2).click().perform();
//		driver.navigate().back();
	}
	
	@AfterClass()
	public void configAC()
	{
		System.out.println("Close the browser");
		driver.close();
	}
}
