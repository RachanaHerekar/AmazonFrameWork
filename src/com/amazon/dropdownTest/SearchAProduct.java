package com.amazon.dropdownTest;

import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.amazon.genericlib.BaseClass;

public class SearchAProduct extends BaseClass {
	
	@Test
	public void searchAndAddToCartTest()
	{
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("curtains",Keys.ENTER);
		driver.findElement(By.xpath("//ul[@id='s-results-list-atf']/li[2]/div/div[4]/div[1]/a/h2")).click();
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
		driver.findElement(By.xpath("//a[@id='hlb-view-cart-announce']")).click();
		driver.findElement(By.xpath("//form[@id='activeCartViewForm']/div[2]/div[1]/div[4]/div[2]/div[1]/div/div/div[2]/div/span[1]/span/input")).click();
		
		
	}

}
