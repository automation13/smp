package com.selenium.example;

public class go{

	public static void main(String[] args) throws InterruptedException{
		
		_1_load_webpage gts=new _1_load_webpage();
		gts.gotolink();
		
		// proveraem nalichie vseh silok v menu
		
		_2_verifu_all_categories vac=new _2_verifu_all_categories();
		vac.do_it();		
		
		//proveraem sublinks v menu
		_3_verify_all_subcategories vas = new _3_verify_all_subcategories();
		vas.do_it();
			
		//proverka ssilok v verhy shapki sajta
		_4_verify_links_top vlt = new _4_verify_links_top();
		vlt.check_it();
		
		_5_verify_registry_link vrl = new _5_verify_registry_link();
		vrl.check_link();
		
		_6_verify_wish_list_link vwl = new _6_verify_wish_list_link();
		vwl.check_link();
		
		_7_verify_gift_cards_link vgl = new _7_verify_gift_cards_link();
		vgl.check_link();
		
		_8_verify_gift_finder_link vfl = new _8_verify_gift_finder_link();
		vfl.check_link();
		
		_9_verify_my_acc_link vml=new _9_verify_my_acc_link();
		vml.check_link();
		
		_10_add_item_to_cart aic = new _10_add_item_to_cart();
		aic.add_item();
		
		_11_verify_registry_wish vrw = new _11_verify_registry_wish();
		vrw.check_add_but();
		
		_12_check_login_logout_function clf = new 	_12_check_login_logout_function();
		clf.login();
		System.out.println("-------------------------------");
		System.out.println("TEST AUTOMATION DONE SUCCEFULY");
		
	}
}
