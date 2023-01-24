package com.swiggy;

import com.microsoft.playwright.Page;

public class Homepage {
	private Page page;
	Homepage homepage;
	//private String dropdown = "span.icon-downArrow kVKTT";
	private String enter_your_delivery_location = "input[placeholder = 'Enter your delivery location']";
	private String selectLocation = "span._2W-T9";
	private String displayLocationInHome = "span._3HusE";
	private String  searchicon = "//span[text()='Search']";
	private String  searchFoodTextBox = "input._2FkHZ";
	private String selectBiriyani = "div._1Z_E6";
	
	// constructor
	public Homepage(Page page) {
		this.page = page;
	}


         public String gethomepagetitle() 
         {
        	return page.title();
         }
         
         public String gethomepageurl() 
         {
        	 return page.url();
         }
         
       //  public boolean dosearchLocation(String productname){
//        	 page.click(enter_your_delivery_location);
//        	 page.fill(selectBiriyani, productname);
        	// page.fill(enter_your_delivery_location, productname);
        	// page.click(productname);
			//return false;
         
//        	 //page.click(dropdown);
//        	 page.fill(searchTextBox, loc);
//        	 page.click(selectLocation);
//        	 return page.isVisible(displayLocationInHome);
      //   }
         
         public String dosearchlocation(String loc)
         {
        	// page.click(searchicon);
        	page.fill(enter_your_delivery_location, loc);
        	page.click("//span[text()='Bengaluru, Karnataka, India']");
        	 return page.url();
         }
        
         
         
         
         
         
     
         
         
         
}