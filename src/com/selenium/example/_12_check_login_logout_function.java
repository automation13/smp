package com.selenium.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _12_check_login_logout_function extends _1_load_webpage{
	
	public void login() throws InterruptedException
	{
		WebElement a = driver.findElement(By.xpath("//a[@class='liText' and contains(text(),'My Account / Sign In')]"));
		new Actions(driver).moveToElement(a).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='tipcontent']//a[text()='Sign In']")).click();
		WebElement b = driver.findElement(By.id("emailId"));
		new Actions(driver).sendKeys(b,"kashak88@ymail.com").perform();
		WebElement c = driver.findElement(By.id("passwd"));
		new Actions(driver).sendKeys(c,"1234567890aA").perform();
		System.out.println("Keys sent...");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[@class='checkbg_lt']//input[@width='80' and @type='image' and @height='25' and @border='0' and @alt='Sign In' and @src='/images/checkout/en_US/cart2_signin.gif']")).click();
		Thread.sleep(2000);
		WebElement d = driver.findElement(By.xpath("//span[@class = 'loggedIn']"));
		new Actions(driver).moveToElement(d).perform();
		System.out.println("Log out...");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Sign Out')]")).click();
	}

}