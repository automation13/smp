package com.selenium.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _11_verify_registry_wish extends _1_load_webpage{
	
	public void check_add_but() throws InterruptedException
	{
		System.out.println("Openning Girl's Toys link...");
		driver.findElement(By.xpath("//a[@class='mainNavLink' and text()=\"Girls' Toys\"]")).click();
		Thread.sleep(2200);
		
		System.out.println("Openning Arts and Crafts link...");
		driver.findElement(By.xpath("(//div[@class='sliderWrapper']/p/a)[2]")).click();
		Thread.sleep(2200);
		
		System.out.println("Click 1st element to the cart...");
		driver.findElement(By.xpath("(//div[@class='clearfix prodloop_row_cont firstRow']/div/div/div/div/a/img)[1]")).click();
		Thread.sleep(2200);
		
		WebElement a = driver.findElement(By.id("addToRegistry"));
		new Actions (driver).moveToElement(a).perform();
		System.out.println("Add to Registry button verified");
		Thread.sleep(2200);
		
		WebElement b = driver.findElement(By.id("addToWishList"));
		new Actions (driver).moveToElement(b).perform();
		System.out.println("Add to Wish List button verified");
		Thread.sleep(2200);
		
		driver.get(link);
	}

}
