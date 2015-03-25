package com.selenium.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _3_verify_all_subcategories extends _1_load_webpage{
	
	public void do_it() throws InterruptedException
	{

		//driver.findElement(By.xpath("//a[@class='mainNavLink' and text()=\"Boys' Toys\"]")).click();		
		//driver.findElement(By.xpath("//a[@class='hdrMenuCat' and text()='Birth - 12 Months']")).click();
		
		WebElement a = driver.findElement(By.xpath("//a[@class='mainNavLink' and text()='Age']"));
		new Actions(driver).moveToElement(a).perform();
		System.out.println("Age menu open, Start verifying sublinks...");
		Thread.sleep(1000);
		
		functions fn=new functions();
		fn.check_sub_link("Birth - 12 Months");
		fn.check_sub_link("12 - 24 Months");
		fn.check_sub_link("Birth - 12 Months");
		fn.check_sub_link("5 - 7 Years");
		fn.check_sub_link("8 - 11 Years");
		fn.check_sub_link("12 - 14 Years");
		fn.check_sub_link("Big Kids");
		System.out.println("Verifying sublinks done.");
		System.out.println("---------------------------");
		Thread.sleep(1000);
		/*
		WebElement a = driver.findElement(By.xpath("//a[@class='mainNavLink' and text()=\"Boys' Toys\"]"));
		new Actions(driver).moveToElement(a).perform();
		*/
		
	//Thread.sleep(100);
		
		
	//	WebElement a = 
	//	driver.findElement(By.xpath("//a[@href='/family/index.jsp?categoryId=13041264']")).click();
		//new Actions(driver).click(a);
	
	}
	
	

}
