package facebookHome;

import java.io.IOException;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import baseScript.MobileAPI;
import cucumber.api.java.en.*;
import io.appium.java_client.AppiumDriver;

public class SignIntoFacebookTest extends MobileAPI{
	
	AppiumDriver ad;
	
	@Test
	public void runTestsInOrder() throws IOException, InterruptedException {
		try {
		capabilities_are_set_up();
		the_user_starts_the_Facebook_app();
		he_should_be_able_to_see_the_app_home_page();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

//	@Test
	@Given("capabilities are set up")
	public void capabilities_are_set_up() throws IOException, InterruptedException {

		ad = setUpAppiumDriver(ad, "Android","Phone","Emulator","Nexus","5.1","Facebook","nyp2.apk","","");
		System.out.println("Starting test");
		
//		ad = setUpAppiumDriver(ad, "iOS","iPhone","Simulator","iPhone 6","10.2","Facebook","UICatalog6.1.app.zip","","");
//		log("Starting test", ad);
		
		if(ad==null) {
			System.out.println("No driver");
		}else {
			System.out.println("Hello driver");
		}		
	}

//	@Test
	@When("the user starts the Facebook app")
	public void the_user_starts_the_Facebook_app() {
	    // Write code here that turns the phrase above into concrete actions
		try {
		if(ad==null) {
			System.out.println("driver == null;");
		
		}
		else {
			System.out.println("driver != null;");
			Thread.sleep(5000);
			ad.findElement(By.id("br.com.golmobile.nypost:id/welcome_continue")).click();
			ad.findElement(By.id("br.com.golmobile.nypost:id/continue_customize")).click();
		}
		}catch(Exception e) {
//				e.printStackTrace();
		}
		
//		    throw new PendingException();
	}

//	@Test
	@Then("he should be able to see the app home page")
	public void he_should_be_able_to_see_the_app_home_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WebElement getMenu = ad.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Open menu\"]"));			
		String [] menuItems = {"Latest Stories","Metro","Page Six","Sports","Business","Opinion","Entertainment","Fashion","Living","Media","Tech","Real Estate","Video","Settings","Photos","Page Six TV","Saved Articles","News"};
		for(String menu : menuItems){
			getMenu.click();
			Thread.sleep(2000);
			System.out.println(ad.scrollTo(menu).getText());				
			ad.scrollToExact(menu).click();
			Thread.sleep(2000);
		}	
	}
}
