package com.selenium.example;

import org.openqa.selenium.By;

public class _6_verify_wish_list_link extends _1_load_webpage{

	public void check_link() throws InterruptedException
	{	
		System.out.println("Verify that Wish List link working");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='liText' and contains(text(),'Wish List')]")).click();
		System.out.println("Wish link working, going back to home page...");
		Thread.sleep(10000);
		driver.get(link);
	}
}
