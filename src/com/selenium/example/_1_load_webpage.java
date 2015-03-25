package com.selenium.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class _1_load_webpage extends go{
	
public static WebDriver driver;	
	public String st = "Mozilla";	
	public String link = "http://www.toysrus.com";
	
	public void gotolink()
	{		/*		
		
		if(st.equals("Mozilla"))
		{
			driver=new FirefoxDriver();
		}
		else if (st.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (st.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Selenium\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();	
		}*/
		driver=new FirefoxDriver();
		System.out.println(link+" loaging...");
		driver.get(link);
		
	}
}
