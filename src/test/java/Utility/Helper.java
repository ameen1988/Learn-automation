package Utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Helper {
	
	public static String capturescreenshot(WebDriver driver, String screenshotname)
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		String destination = "C:\\Users\\Ameen\\workspace\\com.learnautomation.hybrid\\Screenshots"+screenshotname+System.currentTimeMillis()+".png";
		
		try 
		{
			FileUtils.copyFile(src, new File(destination));
		} catch (IOException e) 
		{
			System.out.println(e.getMessage());
		}
		
		return destination;
	}

}
