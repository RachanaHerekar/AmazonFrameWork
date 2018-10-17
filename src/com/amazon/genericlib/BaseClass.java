package com.amazon.genericlib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
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
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");
	}
	
	@BeforeMethod()
	public void configBM()
	{
		System.out.println("Login to Amazon:--");
	}

	@AfterMethod()
	public void configAM()
	{
		System.out.println("Logout from Amazon");
	}
	
	@AfterClass()
	public void configAC()
	{
		System.out.println("Close the browser");
		driver.close();
	}
}
