package Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Factory.BrowserFactory;
import Factory.DataProviderFactory;
import Pages.LogInPage;

public class VerifyLogInPage 
{
	WebDriver driver;
	ExtentReports report;
	ExtentTest logger;
	
	@BeforeMethod
	public void setup()
	{
		report = new ExtentReports("./Reports/LogInReports.html",true);
		
		logger = report.startTest("Verify LogIn Page");
		
		driver = BrowserFactory.getbrowser("firefox");
		
		driver.get(DataProviderFactory.getconfig().getApplicationUrl());
		
		logger.log(LogStatus.INFO, "Application is up & running");
		
	}
	@Test
	public void testHomepage()
	{
		LogInPage login = PageFactory.initElements(driver, LogInPage.class);
		
		login.ClickOnLoginLink();
		
		logger.log(LogStatus.INFO, "Clicked on Login link");

		
		login.LogInApplication(DataProviderFactory.getexcel().getData(0, 0, 0), DataProviderFactory.getexcel().getData(0, 0, 1));
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		login.ClickOnCartButton();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		System.out.println(driver.getTitle());
		
		//Assert.assertTrue(title.contains("Shopping"));
		

		
		
		
		
	}
	
	@AfterMethod	
	public void tearDown()
	{
		BrowserFactory.closebrowser(driver);
		
		report.endTest(logger);
		report.flush();
	}
		
	
}
