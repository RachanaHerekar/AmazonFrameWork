package com.amazon.dropdownTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.amazon.genericlib.BaseClass;

public class DealOfTheDay extends BaseClass {
	
	@Test
	public void captureDealOfTheDayTest()
	{
		String data = driver.findElement(By.xpath("//h2[contains(text(),'Deal of the Day') and contains(@class,'a-color-base headline truncate-1line')]")).getText();
		System.out.println(data);
		//To capture the price image and name of product
//		WebElement wb = driver.findElement(By.xpath("//div[@id='gw-card-layout']/div[5]/div/div[2]/a/div/img"));
//		WebElement wb1 = driver.findElement(By.xpath("//div[@id='gw-card-layout']/div[5]/div/div[2]/span"));
		WebElement wb2 = driver.findElement(By.xpath("//div[@id='gw-card-layout']/div[5]/div/div[2]/p/span/span/span[2]/span[2]"));
//		
//		System.out.println("Product name is--->"+  wb1);
		System.out.println("Product price is--->"+  wb2);
		
		WebElement wb3 = driver.findElement(By.xpath("//div[@id='gw-card-layout']/div[4]/div/div[2]"));
		System.out.println(wb3);
	}

}
