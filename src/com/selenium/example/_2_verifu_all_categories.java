package com.selenium.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _2_verifu_all_categories extends _1_load_webpage{
	
	public void do_it() throws InterruptedException
	{	
		
		System.out.println("VERIFYING LINKS MENU START");
		
		functions fn = new functions();
		fn.find_link("Boys' Toys");
		fn.find_link("Girls' Toys");
		fn.find_link("Age");
		fn.find_link("Character");	
		fn.find_link("Brand");
		
		WebElement a = driver.findElement(By.xpath("//a[@class='mainNavLink clearance' and text()='Clearance']"));
		new Actions(driver).moveToElement(a).perform();
		System.out.println("Clearance Verified");
		Thread.sleep(700);
		
		fn.find_link("Action Figures");	
		fn.find_link("Bikes, Scooters & Ride-Ons");
		fn.find_link("Building Sets & Blocks");
		fn.find_link("Dolls & Stuffed Animals");
		fn.find_link("Electronics");
		fn.find_link("Games & Puzzles");
		fn.find_link("Halloween Store");
		fn.find_link("Outdoor Play");
		fn.find_link("Preschool Toys");
		fn.find_link("Video Games");
		fn.find_link("See All Categories");
		
		WebElement r=driver.findElement(By.xpath("//div[@class='icon savingsCenter']//a[text()='Savings Center']")) ;
		new Actions(driver).moveToElement(r).perform();
		System.out.println("Savings Center Verified");
		Thread.sleep(700);
		
		WebElement s = driver.findElement(By.xpath("//div[@class='icon giftCards']//a[text()='Gift Cards']")) ;
		new Actions(driver).moveToElement(s).perform();
		System.out.println("Gift Cards Verified");
		Thread.sleep(700);
		
		WebElement t = driver.findElement(By.xpath("//div[@class='icon giftFinder']//a[text()='Gift Finder']")) ;
		new Actions(driver).moveToElement(t).perform();
		System.out.println("Gift Finder Verified");
		Thread.sleep(700);
		System.out.println("-------------------------");		
		System.out.println("VERIFYING LINKS MENU DONE");
	}
}
