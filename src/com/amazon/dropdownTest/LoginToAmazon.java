package com.amazon.dropdownTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.amazon.genericlib.BaseClass;

public class LoginToAmazon {
	
	static WebDriver driver;
	
	@Test
	public void loginPageTest()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");
		Actions act = new Actions(driver);
		WebElement wb = driver.findElement(By.xpath("//a[@id='nav-link-yourAccount']/span[1]"));
		act.moveToElement(wb).perform();
		driver.findElement(By.xpath("//div[@id='nav-flyout-ya-signin']/a/span")).click();
		String expTitle = "Amazon Sign In";
		String actTitle = driver.getTitle();
		Assert.assertEquals(actTitle, expTitle);
		System.out.println("Login Page displayed");
		driver.close();
	}

	
	@Test
	public void loginAmazonDetailsTest() throws Throwable
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");
		Actions act = new Actions(driver);
		WebElement wb = driver.findElement(By.xpath("//a[@id='nav-link-yourAccount']/span[1]"));
		act.moveToElement(wb).perform();
		driver.findElement(By.xpath("//div[@id='nav-flyout-ya-signin']/a/span")).click();
		driver.findElement(By.id("ap_email")).sendKeys("9742020752");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("amazon");
		driver.findElement(By.id("signInSubmit")).click();
		//Actions act1 = new Actions(driver);
		WebElement wb1 = driver.findElement(By.xpath("//a[@id='nav-link-yourAccount']/span[1]"));
		act.moveToElement(wb1).perform();
		WebElement wb2 = driver.findElement(By.xpath("//span[text()='Sign Out']"));
		act.moveToElement(wb2).click().perform();
		String expTitle = "Amazon Sign In";
		String actTitle = driver.getTitle();
		Assert.assertEquals(actTitle, expTitle);
		System.out.println("Signed in and Signed out successfully");
		driver.close();
	}
	
	
}
