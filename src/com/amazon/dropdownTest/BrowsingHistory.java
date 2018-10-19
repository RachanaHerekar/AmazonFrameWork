package com.amazon.dropdownTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.amazon.genericlib.BaseClass;

public class BrowsingHistory extends BaseClass{
	
	@Test
	public void viewEditHistoryTest() throws Throwable
	{
		//Thread.sleep(4000);
		Actions act = new Actions(driver);
		WebElement wb = driver.findElement(By.xpath("//div[@id='rhf-container']/div/div[4]/div/div/div[2]/a"));
		act.moveToElement(wb).perform();
		driver.findElement(By.xpath("//div[@id='rhf-container']/div/div[4]/div/div")).click();
		System.out.println("Before viewing any products on amazon");
		String expMsg =" You have no recently viewed Items.";
		String actMsg = driver.findElement(By.xpath("//div[@id='no_items_message']/span")).getText();
		Assert.assertEquals(expMsg, actMsg);
		//add a product and view the browing history
		
		
		

	}

}
