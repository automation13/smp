package com.selenium.example;

import org.openqa.selenium.By;

public class _7_verify_gift_cards_link extends _1_load_webpage {

	public void check_link() throws InterruptedException
	{	
		System.out.println("Verify that Gift Cards link working");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='liText' and contains(text(),'Gift Cards')]")).click();
		System.out.println("Gift Cards link working, going back to home page...");
		Thread.sleep(10000);
		driver.get(link);
	}

}
