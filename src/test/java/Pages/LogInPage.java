package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class LogInPage 
{
	
	WebDriver driver;
	public LogInPage(WebDriver ldriver)
	{
		
		this.driver= ldriver;
		
	}
	
	@FindBy(xpath="//a[@class='_2k0gmP'][@href='/account/login?ret=/']") WebElement Link;
	@FindBy(xpath="//input[@class='_2zrpKA']") WebElement Username;
	@FindBy(xpath="//input[@class='_2zrpKA _3v41xv']") WebElement Password;
	@FindBy(xpath="//button[@class='_2AkmmA _1LctnI _7UHT_c']") WebElement LogInButton;
	@FindBy(xpath="//a[@class='_3NFO0d']") WebElement CartButton;
	@FindBy(xpath="//a[@class='_1AHrFc _2k0gmP']") WebElement UserButton;
	@FindBy(xpath="a[@class='_2k0gmP'][@href='#']") WebElement LogouttButton;
	
	
	public void ClickOnLoginLink()
	{
		Link.click();
	}
	public void LogInApplication(String User1,String Password1)
	{
		
		Username.sendKeys(User1);
		Password.sendKeys(Password1);
		LogInButton.click();
	}
	
	public void ClickOnCartButton()
	{
		CartButton.click();
	}
	
	public void ClickOnLogoutLink()
	{
		Actions act = new Actions(driver);
		
		act.moveToElement(UserButton).build().perform();
		
		act.click(UserButton).build().perform();
		
		LogouttButton.click();
	}
	
	public void ClickOnLogoutLink2()
	{
		
	}
}
