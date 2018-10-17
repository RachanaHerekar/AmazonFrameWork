package com.amazon.dropdownTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.amazon.genericlib.BaseClass;

public class Amazon_DropDown extends BaseClass {

		@Test
		public void amazonDropDownMenu()
		{
			Actions act = new Actions(driver);
			WebElement wb = driver.findElement(By.id("nav-link-shopall"));
			act.moveToElement(wb).perform();
			WebElement wb1 = driver.findElement(By.xpath("//div[@id='nav-flyout-shopAll']/div[2]/span[1]/span"));
			act.moveToElement(wb1).perform();
			WebElement wb2 = driver.findElement(By.xpath("//span[text()='All-new Echo Dot']"));
			wb2.click();
			String x = "//div[@id='kfs-slide-control']/div[1]/div[1]/table/tbody/tr/td";
		
			boolean actImg = driver.findElement(By.xpath(x)).isDisplayed();
				
			if(actImg)
			{
				System.out.println("Correct page displayed--> PASS");
			}
			else
			{
				System.out.println("Wrong page displayed--> FAIL");
			}
		}
		
		@Test
		public void captureAllCategories()
		{
			Actions act = new Actions(driver);
			WebElement wb = driver.findElement(By.id("nav-link-shopall"));
			act.moveToElement(wb).perform();
			List<WebElement> lst = driver.findElements(By.xpath("//div[@id='nav-flyout-shopAll']/div[2]/span[*]"));
			System.out.println("Number of categories are-->"+lst.size());
			System.out.println("List of categories are:-->");
			for(WebElement wb1 : lst)
			{
				System.out.println(wb1.getText());
			}
		}

}
