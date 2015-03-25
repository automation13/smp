package com.selenium.example;

import org.openqa.selenium.By;

public class _8_verify_gift_finder_link extends _1_load_webpage{
	

	public void check_link() throws InterruptedException
	{	
		System.out.println("Verify that Gift Finder link working");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='liText' and contains(text(),'Gift Finder')]")).click();
		System.out.println("Gift Finder link working, going back to home page...");
		Thread.sleep(10000);
		driver.get(link);
	}

}
