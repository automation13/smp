package com.selenium.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class functions extends _1_load_webpage{
	
	public void find_link(String str) throws InterruptedException
	{			
		WebElement a = driver.findElement(By.xpath("//a[@class='mainNavLink' and text()=\""+str+"\"]"));
		new Actions(driver).moveToElement(a).perform();
		System.out.println(str+" Verified");
		Thread.sleep(1000);
	}
	
	public void check_sub_link(String Str) throws InterruptedException
	{	
		WebElement b = driver.findElement(By.xpath("//a[@class='hdrMenuCat' and text()=\""+Str+"\"]"));
		new Actions(driver).moveToElement(b).perform();
		System.out.println(Str+" Verified ee");
		Thread.sleep(500);
	}
	
	public void check_top_link(String str) throws InterruptedException
	{
		WebElement b = driver.findElement(By.xpath("//a[@class='liText' and contains(text(),\""+str+"\")]"));
		new Actions(driver).moveToElement(b).perform();
		System.out.println(str+" verified");
		Thread.sleep(500);
	}
	
	
	
	
	
	
	
	
	/*
	public void find_sublink(String str) throws InterruptedException
	{
		//List <String> list = new List <String>();
		//elementData = (E[]) new Object[10];
		
		//WebElement a = driver.findElement(By.xpath(""));
		//List <WebElement> b = driver.findElements(By.xpath("//a[@class='mainNavLink' and text()='Age']"));
		//WebElement b = driver.findElement(By.xpath("//a[@class='mainNavLink' and text()='Age']"));
	//	driver.findElement(By.xpath("//a[@class='mainNavLink' and text()='Age']"));
		if (b > 0) {	 
		  //new Actions(driver).moveToElement(elements.get(0)).perform();
		System.out.println("element exist");
		}
		//System.out.println(b);
		List <WebElement> elements = driver.findElement(By.xpath("//a[@class='mainNavLink' and text()='Age']"));
		if (elements.size() > 0) {
		  new Actions(driver).moveToElement(elements.get(0)).perform();
		}
		
		
	}*/
	
	

}
