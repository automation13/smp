package com.selenium.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _10_add_item_to_cart extends _1_load_webpage{

	public void add_item() throws InterruptedException{
		
		System.out.println("Start adding items in the cart...");
		driver.findElement(By.xpath("//a[@class='mainNavLink' and text()='Age']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//div[@class='sliderWrapper']/p[6]/a")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class=' clearfix prodloop_row_cont firstRow']/div/div/div/div/a/img)[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("cartAddition")).click();
		Thread.sleep(4000);
		driver.get(link);
		System.out.println("1d item added");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@class='mainNavLink' and text()='Age']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='sliderWrapper']/p[6]/a")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class=' clearfix prodloop_row_cont firstRow']/div/div/div/div/a/img)[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("cartAddition")).click();
		Thread.sleep(4000);
		driver.get(link);
		System.out.println("2d item added");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@class='mainNavLink' and text()='Age']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='sliderWrapper']/p[6]/a")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class=' clearfix prodloop_row_cont firstRow']/div/div/div/div/a/img)[3]")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("cartAddition")).click();
		Thread.sleep(4000);
		driver.get(link);
		System.out.println("3d item added");
		driver.findElement(By.id("hdrCart")).click();
		System.out.println("3 items added and cart button verified");
		Thread.sleep(5000);
		driver.get(link);
		System.out.println("Going back to Home page...");
		Thread.sleep(5000);
		WebElement a = driver.findElement(By.id("hdrCart"));
		new Actions(driver).moveToElement(a).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='minicart_proceed']/a[@href='/cart/index.jsp']")).click();
		System.out.println("3 items added View cart and checkout link verified");		
		
	}
}
