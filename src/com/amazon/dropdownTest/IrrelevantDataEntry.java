package com.amazon.dropdownTest;

import org.jboss.netty.util.internal.SystemPropertyUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.amazon.genericlib.BaseClass;


public class IrrelevantDataEntry extends BaseClass{
	
	@Test
	public void irrelevantDataTest()
	{
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("%&*^");
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		String actErrorMsg = driver.findElement(By.xpath("//h1[@id='noResultsTitle']")).getText();
		String[] arr = actErrorMsg.split(" ");
		String msg = arr[2];
		System.out.println(msg);
		String expErrorMsg = "Your search " + msg + " did not match any products.";
		System.out.println(expErrorMsg);
		
		System.out.println(actErrorMsg);
		//String actErrorMsg = driver.findElement(By.xpath("//h1[contains(text(),'Your search') and contains(text(),'did not match any products.')]")).getText();
		if(actErrorMsg.equals(expErrorMsg))
		{
			System.out.println("Your search did not match any products--->Pass");
		}
		else
		{
			System.out.println("Your search has matched--->Fail");
		}
	}
	

}
