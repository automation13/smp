package com.selenium.example;

import org.openqa.selenium.By;

public class _5_verify_registry_link extends _1_load_webpage{

	public void check_link() throws InterruptedException
	{	
		System.out.println("Verify that Baby Registry link working");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='liText' and contains(text(),'Baby Registry')]")).click();
		System.out.println("Baby Registry link working, going back to home page...");
		Thread.sleep(10000);
		driver.get(link);
	}
	
}
