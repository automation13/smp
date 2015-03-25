package com.selenium.example;

import org.openqa.selenium.By;

public class _9_verify_my_acc_link extends _1_load_webpage{

	public void check_link() throws InterruptedException
	{	
		System.out.println("Verify that my acc link working");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='liText' and contains(text(),'My Account')]")).click();
		System.out.println("My Account link working, going back to home page...");
		Thread.sleep(10000);
		driver.get(link);
	}
}
