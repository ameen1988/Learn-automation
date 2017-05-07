package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage 
{
	WebDriver driver;
	
	public Homepage(WebDriver ldriver)
	{
		this.driver = ldriver;
	}
	
	@FindBy(xpath=".//*[@id='container']/div/header/div[1]/div[1]/div/ul/li[9]/a") WebElement LogInLink;
	
	@FindBy(xpath=".//*[@id='container']/div/header/div[1]/div[1]/div/ul/li[8]/a") WebElement SignUpLink;
	
	@FindBy(xpath=".//*[@id='container']/div/header/div[1]/div[2]/div/div/a") WebElement CartLink;
	
	public void clickonLogInLink()
	{
		LogInLink.click();
	}
	
	public void clickonSignUpLink()
	{
		SignUpLink.click();
	}
	public void clickonCartLink()
	{
		CartLink.click();
	}
	
	public String getApplicationTitle()
	{
		return driver.getTitle();
	}

}
