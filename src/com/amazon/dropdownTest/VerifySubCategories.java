package com.amazon.dropdownTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.amazon.genericlib.BaseClass1;

public class VerifySubCategories extends BaseClass1 {
	
	@Test(priority=1)
	public void verifyEchoAlexaSubCategoryTest()
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Actions act = new Actions(driver);
		WebElement wb = driver.findElement(By.id("nav-link-shopall"));
		act.moveToElement(wb).perform();
		WebElement wb1 = driver.findElement(By.xpath("//div[@id='nav-flyout-shopAll']/div[2]/span[1]/span"));
		act.moveToElement(wb1).perform();
		WebElement wb2 = driver.findElement(By.xpath("//span[text()='All-new Echo Dot']"));
		act.moveToElement(wb2).click().perform();
		String x = "//div[@id='kfs-slide-control']/div[1]/div[1]/table/tbody/tr/td";
	
		boolean actImg = driver.findElement(By.xpath(x)).isDisplayed();
			
		if(actImg)
		{
			System.out.println("All-new Echo Dot page displayed--> PASS");
		}
		else
		{
			System.out.println("All-new Echo page not displayed--> FAIL");
		}
	}
	
	@Test(priority=2)
	public void verifyFireTVStickSubCategoryTest()
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		Actions act = new Actions(driver);
		WebElement wb = driver.findElement(By.id("nav-link-shopall"));
		act.moveToElement(wb).perform();
		WebElement wb1 = driver.findElement(By.xpath("//div[@id='nav-flyout-shopAll']/div[2]/span[2]/span"));
		act.moveToElement(wb1).perform();
		WebElement wb2 = driver.findElement(By.xpath("//span[text()='All-New Fire TV Stick 4K']"));
		act.moveToElement(wb2).click().perform();
		
		String expTitle = "Fire TV Stick 4K";
		String actTitle = driver.getTitle();
		if(actTitle.contains(expTitle))
		{
			System.out.println("All-New Fire TV Stick 4Kt page displayed--> PASS");
		}
		else
		{
			System.out.println("All-New Fire TV Stick 4Kt page not displayed--> FAIL");
		}
	
	}
	
	@Test(priority=3)
	public void verifyKindleEReadersAndEbooksSubCategoryTest()
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		Actions act = new Actions(driver);
		WebElement wb = driver.findElement(By.id("nav-link-shopall"));
		act.moveToElement(wb).perform();
		WebElement wb1 = driver.findElement(By.xpath("//div[@id='nav-flyout-shopAll']/div[2]/span[3]/span"));
		act.moveToElement(wb1).perform();
		WebElement wb2 = driver.findElement(By.xpath("//span[text()='Kindle']"));
		act.moveToElement(wb2).click().perform();
		
		String expTitle = "All-New Kindle E-reader";
		String actTitle = driver.getTitle();
		if(actTitle.contains(expTitle))
		{
			System.out.println("Kindle page displayed--> PASS");
		}
		else
		{
			System.out.println("Kindle page not displayed--> FAIL");
		}
	
	}
	
	@Test(priority=4)
	public void verifyAmazonPrimeVideoSubCategoryTest()
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Actions act = new Actions(driver);
		WebElement wb = driver.findElement(By.id("nav-link-shopall"));
		act.moveToElement(wb).perform();
		WebElement wb1 = driver.findElement(By.xpath("//div[@id='nav-flyout-shopAll']/div[2]/span[4]/span"));
		act.moveToElement(wb1).perform();
		WebElement wb2 = driver.findElement(By.xpath("//span[text()='All Videos']"));
		act.moveToElement(wb2).click().perform();
		
		String expTitle = "Amazon Prime Video";
		String actTitle = driver.getTitle();
		if(actTitle.contains(expTitle))
		{
			System.out.println("All Videos page displayed--> PASS");
		}
		else
		{
			System.out.println("All Videos page not displayed--> FAIL");
		}
	
	}

	@Test(priority=5)
	public void verifyAmazonPrimeMusicSubCategoryTest()
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Actions act = new Actions(driver);
		WebElement wb = driver.findElement(By.id("nav-link-shopall"));
		act.moveToElement(wb).perform();
		WebElement wb1 = driver.findElement(By.xpath("//div[@id='nav-flyout-shopAll']/div[2]/span[5]/span"));
		act.moveToElement(wb1).perform();
		WebElement wb2 = driver.findElement(By.xpath("//span[text()='CDs and Vinyls']"));
		act.moveToElement(wb2).click().perform();
		
		String expTitle = "Music CD";
		String actTitle = driver.getTitle();
		if(actTitle.contains(expTitle))
		{
			System.out.println("Amazon Prime Music page displayed--> PASS");
		}
		else
		{
			System.out.println("Amazon Prime Music page not displayed--> FAIL");
		}
	
	}
	
	
	@Test(priority=6)
	public void verifyAaMobileComputersSubCategoryTest()
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Actions act = new Actions(driver);
		WebElement wb = driver.findElement(By.id("nav-link-shopall"));
		act.moveToElement(wb).perform();
		WebElement wb1 = driver.findElement(By.xpath("//div[@id='nav-flyout-shopAll']/div[2]/span[6]/span"));
		act.moveToElement(wb1).perform();
		WebElement wb2 = driver.findElement(By.xpath("//span[text()='Power Banks']"));
		act.moveToElement(wb2).click().perform();
				
		String expTitle = "Power Bank";
		String actTitle = driver.getTitle();
		if(actTitle.contains(expTitle))
		{
			System.out.println("Power Banks page displayed--> PASS");
		}
		else
		{
			System.out.println("Power Banks page not displayed--> FAIL");
		}
	
	}
	
	@Test(priority=7)
	public void verifyTVAppliancesElectronicsSubCategoryTest()
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Actions act = new Actions(driver);
		WebElement wb = driver.findElement(By.id("nav-link-shopall"));
		act.moveToElement(wb).perform();
		WebElement wb1 = driver.findElement(By.xpath("//div[@id='nav-flyout-shopAll']/div[2]/span[7]/span"));
		act.moveToElement(wb1).perform();
		WebElement wb2 = driver.findElement(By.xpath("//span[text()='Cameras']"));
		act.moveToElement(wb2).click().perform();
		
		String expTitle = "Camera Store Online";
		String actTitle = driver.getTitle();
		if(actTitle.contains(expTitle))
		{
			System.out.println("Cameras page displayed--> PASS");
		}
		else
		{
			System.out.println("Cameras page not displayed--> FAIL");
		}
	}
	
	@Test(priority=8)
	public void verifyMenFasionSubCategoryTest()
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Actions act = new Actions(driver);
		WebElement wb = driver.findElement(By.id("nav-link-shopall"));
		act.moveToElement(wb).perform();
		WebElement wb1 = driver.findElement(By.xpath("//div[@id='nav-flyout-shopAll']/div[2]/span[8]/span"));
		act.moveToElement(wb1).perform();
		WebElement wb2 = driver.findElement(By.xpath("//span[text()='Shirts']"));
		act.moveToElement(wb2).click().perform();
		
		String expTitle = "Shirts: Buy Shirts For Men";
		String actTitle = driver.getTitle();
		if(actTitle.contains(expTitle))
		{
			System.out.println("Shirts page displayed--> PASS");
		}
		else
		{
			System.out.println("Shirts page not displayed--> FAIL");
		}
	}
	
	@Test(priority=9)
	public void verifyWomenFasionSubCategoryTest()
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Actions act = new Actions(driver);
		WebElement wb = driver.findElement(By.id("nav-link-shopall"));
		act.moveToElement(wb).perform();
		WebElement wb1 = driver.findElement(By.xpath("//div[@id='nav-flyout-shopAll']/div[2]/span[9]/span"));
		act.moveToElement(wb1).perform();
		WebElement wb2 = driver.findElement(By.xpath("//span[text()='Handbags & Clutches']"));
		act.moveToElement(wb2).click().perform();
		
		String expTitle = "Handbags: Buy Handbags";
		String actTitle = driver.getTitle();
		if(actTitle.contains(expTitle))
		{
			System.out.println("Handbags & Clutches page displayed--> PASS");
		}
		else
		{
			System.out.println("Handbags & Clutches page not displayed--> FAIL");
		}
	}
	
	@Test(priority=10)
	public void verifyHomeKitchenPetsSubCategoryTest()
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Actions act = new Actions(driver);
		WebElement wb = driver.findElement(By.id("nav-link-shopall"));
		act.moveToElement(wb).perform();
		WebElement wb1 = driver.findElement(By.xpath("//div[@id='nav-flyout-shopAll']/div[2]/span[10]/span"));
		act.moveToElement(wb1).perform();
		WebElement wb2 = driver.findElement(By.xpath("//span[text()='Home Storage']"));
		act.moveToElement(wb2).click().perform();
		
		String expTitle = "Storage: Buy Storage products online";
		String actTitle = driver.getTitle();
		if(actTitle.contains(expTitle))
		{
			System.out.println("Home Storage page displayed--> PASS");
		}
		else
		{
			System.out.println("Home Storage page not displayed--> FAIL");
		}
	}
	
	@Test(priority=11)
	public void verifyBeautyHealthGrocerySubCategoryTest()
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Actions act = new Actions(driver);
		WebElement wb = driver.findElement(By.id("nav-link-shopall"));
		act.moveToElement(wb).perform();
		WebElement wb1 = driver.findElement(By.xpath("//div[@id='nav-flyout-shopAll']/div[2]/span[11]/span"));
		act.moveToElement(wb1).perform();
		WebElement wb2 = driver.findElement(By.xpath("//span[text()=' Diet & Nutrition']"));
		act.moveToElement(wb2).click().perform();
		
		String expTitle = "Protein Supplements:";
		String actTitle = driver.getTitle();
		if(actTitle.contains(expTitle))
		{
			System.out.println("Diet & Nutrition page displayed--> PASS");
		}
		else
		{
			System.out.println("Diet & Nutrition page not displayed--> FAIL");
		}
	}
	
	@Test(priority=12)
	public void verifySportsFitnessBagsLuggageSubCategoryTest()
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Actions act = new Actions(driver);
		WebElement wb = driver.findElement(By.id("nav-link-shopall"));
		act.moveToElement(wb).perform();
		WebElement wb1 = driver.findElement(By.xpath("//div[@id='nav-flyout-shopAll']/div[2]/span[12]/span"));
		act.moveToElement(wb1).perform();
		WebElement wb2 = driver.findElement(By.xpath("//span[text()='Fitness Accessories']"));
		act.moveToElement(wb2).click().perform();
		
		String expTitle = "Exercise & Fitness Accessories:";
		String actTitle = driver.getTitle();
		if(actTitle.contains(expTitle))
		{
			System.out.println("Fitness Accessories page displayed--> PASS");
		}
		else
		{
			System.out.println("Fitness Accessories page not displayed--> FAIL");
		}
	}
	
	@Test(priority=13)
	public void verifyToysBabyProductsKidsFashionSubCategoryTest()
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Actions act = new Actions(driver);
		WebElement wb = driver.findElement(By.id("nav-link-shopall"));
		act.moveToElement(wb).perform();
		WebElement wb1 = driver.findElement(By.xpath("//div[@id='nav-flyout-shopAll']/div[2]/span[13]/span"));
		act.moveToElement(wb1).perform();
		WebElement wb2 = driver.findElement(By.xpath("//span[text()='Baby Products']"));
		act.moveToElement(wb2).click().perform();
		
		String expTitle = "Baby Products: Buy New";
		String actTitle = driver.getTitle();
		if(actTitle.contains(expTitle))
		{
			System.out.println("Baby Products page displayed--> PASS");
		}
		else
		{
			System.out.println("Baby Products page not displayed--> FAIL");
		}
	}
	
	@Test(priority=14)
	public void verifyCarMotorBikeIndustrialSubCategoryTest()
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Actions act = new Actions(driver);
		WebElement wb = driver.findElement(By.id("nav-link-shopall"));
		act.moveToElement(wb).perform();
		WebElement wb1 = driver.findElement(By.xpath("//div[@id='nav-flyout-shopAll']/div[2]/span[14]/span"));
		act.moveToElement(wb1).perform();
		WebElement wb2 = driver.findElement(By.xpath("//span[text()='Car Accessories']"));
		act.moveToElement(wb2).click().perform();
		
		String expTitle = "Car Accessories:";
		String actTitle = driver.getTitle();
		if(actTitle.contains(expTitle))
		{
			System.out.println("Car Accessories page displayed--> PASS");
		}
		else
		{
			System.out.println("Car Accessories page not displayed--> FAIL");
		}
	}
	
	@Test(priority=15)
	public void verifyBooksSubCategoryTest()
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Actions act = new Actions(driver);
		WebElement wb = driver.findElement(By.id("nav-link-shopall"));
		act.moveToElement(wb).perform();
		WebElement wb1 = driver.findElement(By.xpath("//div[@id='nav-flyout-shopAll']/div[2]/span[15]/span"));
		act.moveToElement(wb1).perform();
		WebElement wb2 = driver.findElement(By.xpath("//span[text()='All Books']"));
		act.moveToElement(wb2).click().perform();
		
		String expTitle = "Book Store Online";
		String actTitle = driver.getTitle();
		if(actTitle.contains(expTitle))
		{
			System.out.println("All Books page displayed--> PASS");
		}
		else
		{
			System.out.println("All Books page not displayed--> FAIL");
		}
	}
	
	@Test(priority=16)
	public void verifyMoviesMusicVideoGamesSubCategoryTest()
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Actions act = new Actions(driver);
		WebElement wb = driver.findElement(By.id("nav-link-shopall"));
		act.moveToElement(wb).perform();
		WebElement wb1 = driver.findElement(By.xpath("//div[@id='nav-flyout-shopAll']/div[2]/span[16]/span"));
		act.moveToElement(wb1).perform();
		WebElement wb2 = driver.findElement(By.xpath("//span[text()='All Movies & TV Shows']"));
		act.moveToElement(wb2).click().perform();
		
		String expTitle = "DVD & Blu-ray Store";
		String actTitle = driver.getTitle();
		if(actTitle.contains(expTitle))
		{
			System.out.println("All Movies & TV Shows page displayed--> PASS");
		}
		else
		{
			System.out.println("All Movies & TV Shows page not displayed--> FAIL");
		}
	}
	
	@Test(priority=17)
	public void verifyGiftCardMobileRechargesSubCategoryTest()
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Actions act = new Actions(driver);
		WebElement wb = driver.findElement(By.id("nav-link-shopall"));
		act.moveToElement(wb).perform();
		WebElement wb1 = driver.findElement(By.xpath("//div[@id='nav-flyout-shopAll']/div[2]/span[17]/span"));
		act.moveToElement(wb1).perform();
		WebElement wb2 = driver.findElement(By.xpath("//span[text()=' All Gift Cards']"));
		act.moveToElement(wb2).click().perform();
		
		String expTitle = "Gift Cards & Vouchers";
		String actTitle = driver.getTitle();
		if(actTitle.contains(expTitle))
		{
			System.out.println("All Gift Cards page displayed--> PASS");
		}
		else
		{
			System.out.println("All Gift Cards page not displayed--> FAIL");
		}
	}
	
	@Test(priority=18)
	public void verifyGlobalStoreSubCategoryTest()
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Actions act = new Actions(driver);
		WebElement wb = driver.findElement(By.id("nav-link-shopall"));
		act.moveToElement(wb).perform();
		WebElement wb1 = driver.findElement(By.xpath("//div[@id='nav-flyout-shopAll']/div[2]/span[18]/span"));
		act.moveToElement(wb1).perform();
		WebElement wb2 = driver.findElement(By.xpath("//span[text()='Musical Instruments']"));
		act.moveToElement(wb2).click().perform();
		
		String expTitle = "Amazon.in";
		String actTitle = driver.getTitle();
		if(actTitle.contains(expTitle))
		{
			System.out.println("Global Store page displayed--> PASS");
		}
		else
		{
			System.out.println("Global Store page not displayed--> FAIL");
		}
	}

	
	@Test(priority=19)
	public void verifyFullSStoreDirectorySubCategoryTest()
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Actions act = new Actions(driver);
		WebElement wb = driver.findElement(By.id("nav-link-shopall"));
		act.moveToElement(wb).perform();
		WebElement wb1 = driver.findElement(By.xpath("//div[@id='nav-flyout-shopAll']/div[2]/a/span"));
		act.moveToElement(wb1).click().perform();
		
		String expTitle = "Amazon.in";
		String actTitle = driver.getTitle();
		if(actTitle.contains(expTitle))
		{
			System.out.println("Full Store Directory page displayed--> PASS");
		}
		else
		{
			System.out.println("Full Store Directory page not displayed--> FAIL");
		}
	}
}

