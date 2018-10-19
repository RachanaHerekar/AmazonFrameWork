package com.amazon.dropdownTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.amazon.genericlib.BaseClass;

public class RegisterAddress extends BaseClass {
	
	@Test
	public void addressRegisterTest()
	{
		driver.findElement(By.xpath("//span[@id='glow-ingress-line1']")).click();
		driver.findElement(By.xpath("//a[text()='Manage address book']")).click();
		driver.findElement(By.id("ya-myab-plus-address-icon")).click();
		//Enter the details
		
		driver.findElement(By.id("address-ui-widgets-enterAddressFullName")).sendKeys("Rachana Ramesh Herekar");
		driver.findElement(By.id("address-ui-widgets-enterAddressPhoneNumber")).sendKeys("9742020752");
		driver.findElement(By.id("address-ui-widgets-enterAddressPostalCode")).sendKeys("590003");
		driver.findElement(By.id("address-ui-widgets-enterAddressLine1")).sendKeys("2406,Kacheri Galli Shahapur Bgm");
		driver.findElement(By.id("address-ui-widgets-enterAddressCity")).sendKeys("Belgaum");
		WebElement wb = driver.findElement(By.xpath("//span[@id='address-ui-widgets-enterAddressStateOrRegion']/span/span/span"));
		Actions act = new Actions(driver);
		act.moveToElement(wb).click().perform();
		WebElement wb2 = driver.findElement(By.xpath("//a[text()='KARNATAKA']"));
		act.moveToElement(wb2).click().perform();
//		Select sel = new Select(wb);
//		sel.selectByVisibleText("KARNATAKA");
		driver.findElement(By.xpath("//div[@id='address-ui-widgets-enterAddressFormContainer']/span/span/input")).click();
	
	}

	
}
