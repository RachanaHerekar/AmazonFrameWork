package com.amazon.dropdownTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.amazon.genericlib.BaseClass;

public class AmazonPrimeMemeber extends BaseClass {
	
	@Test
	public void verifyPrimeMemeberTest()
	{
		Actions act = new Actions(driver);
		WebElement wb = driver.findElement(By.xpath("//a[@id='nav-link-yourAccount']/span[1]"));
		act.moveToElement(wb).perform();
		driver.findElement(By.xpath("//div[@id='nav-flyout-yourAccount']/div[2]/a[5]/span")).click();
		String actMsg = driver.findElement(By.xpath("//div[@id='membershipInfoLeftPanelDiv']")).getText();
		System.out.println(actMsg);
		
	}

}
