package DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider
{
	Properties pro;
	
	public ConfigDataProvider()
	{
	
		File src = new File("./Configuration/Config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			
			pro = new Properties();
			
			pro.load(fis);
			
		} catch (Exception e) 
		{
			
			System.out.println("Exception is "+e.getMessage());
		}
	}
	
	public String getApplicationUrl()
	{
		String url=pro.getProperty("url");
		return url;
	}
	
	public String getchromePath()
	{
		String url=pro.getProperty("chromePath");
		return url;
	}
	
	public String getiePath()
	{
		String url=pro.getProperty("iePath");
		return url;
	}
}

