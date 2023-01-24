package TestNg.com.swiggy;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.microsoft.playwright.Page;
import com.swiggy.Homepage;
import com.swiggy.PlaywrightFactory;


public class HomePageTest {
	PlaywrightFactory pf;
	
	Page page;
	Homepage homepage;
	
	@BeforeTest
	public void setup() {
		pf = new PlaywrightFactory();
		page=pf.initbrowser("chrome");
		homepage=new Homepage(page);
	}
	
	@Test(priority = 2)
	public void homePageTitleTest() {
		String actualTitle = homepage.gethomepagetitle();
		Assert.assertEquals(actualTitle, "Order food online from India's best food delivery service. Order from restaurants near you");
	}
	
	@Test(priority = 3)
	public void homePageUrlTest() {
		String actualURL =homepage.gethomepageurl();
		Assert.assertEquals(actualURL, "https://www.swiggy.com/");
	}
	
//	@Test(priority = 1)
//	public void searchLocationTest() throws InterruptedException {
//		boolean locConfirm = homepage.searchLocation("Bengaluru");
//		Thread.sleep(3000);
//		Assert.assertTrue(locConfirm);
//	}
	
//	@Test(priority = 4)
//	public void searchFoodTest() {
//		String actualSearchPageURL = homepage.searchFood("Biriyani");
//		Assert.assertEquals(actualSearchPageURL, "https://www.swiggy.com/search?query=Biryani");
//	}
	@Test(priority = 1)
	public void testdosearchdeliverylocation() {
		String actualSearchPageURL = homepage.dosearchlocation("Bengaluru");
		Assert.assertEquals(actualSearchPageURL, "https://www.swiggy.com/");
	}
	
	
	@AfterTest
	public void teardown() {
		page.context().browser().close();
	}
}
