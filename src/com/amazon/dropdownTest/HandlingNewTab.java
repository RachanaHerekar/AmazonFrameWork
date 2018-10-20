package com.amazon.dropdownTest;

import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.amazon.genericlib.BaseClass;

public class HandlingNewTab extends BaseClass {
	
	@Test
	public void handleNewTab()
	{
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone x",Keys.ENTER);
		driver.findElement(By.xpath("//ul[@id='s-results-list-atf']/li[1]/div/div/div/div[2]/div[1]/div[1]/a/h2")).click();
		Set<String> set = driver.getWindowHandles();
		Iterator<String> it = set.iterator();
		String parentSessionId = it.next();
		String childSessionId = it.next();
		driver.switchTo().window(childSessionId);
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		String expMsg = "Added to Cart";
		String actMsg = driver.findElement(By.xpath("//div[@id='huc-v2-order-row-confirm-text']/h1")).getText();
		
		if(actMsg.equals(expMsg))
		{
			System.out.println("Product added successfully to the cart");
			
		}
		else
		{
			System.out.println("Product not added successfully");
		}
		Assert.assertEquals(expMsg, actMsg);
		driver.close();
		driver.switchTo().window(parentSessionId);
		
		
	}

}
