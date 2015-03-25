package com.selenium.example;

public class _4_verify_links_top extends _1_load_webpage{

	public void check_it() throws InterruptedException
	{	
		System.out.println("Start verifying top menu links...");
		
		functions fn = new functions(); 
		fn.check_top_link("Baby Registry");
		fn.check_top_link("Wish List");
		fn.check_top_link("Gift Cards");
		fn.check_top_link("Gift Finder");
		fn.check_top_link("My Account");		
		System.out.println("Top menu link verufy done.");
		System.out.println("----------------------------");		
		Thread.sleep(500);
	}
}
