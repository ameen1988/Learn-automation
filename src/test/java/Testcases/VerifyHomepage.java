package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Factory.BrowserFactory;
import Factory.DataProviderFactory;
import Pages.Homepage;

public class VerifyHomepage 
{
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		driver = BrowserFactory.getbrowser("ie");
		
		driver.get(DataProviderFactory.getconfig().getApplicationUrl());
		
	}
	@Test
	public void testHomepage()
	{
				
		Homepage home = PageFactory.initElements(driver, Homepage.class);
		
		String title = home.getApplicationTitle();
		
		Assert.assertTrue(title.contains("Online"));
	}
	
	@AfterMethod	
	public void tearDown()
	{
		BrowserFactory.closebrowser(driver);
	}
		
	
}
