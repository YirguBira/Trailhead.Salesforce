//package demoHomeTest;
//
//import java.io.File;
//import java.io.IOException;
//import java.net.URL;
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import cucumber.api.PendingException;
//import cucumber.api.java.Before;
//import cucumber.api.java.en.*;
//import demoHomeApp.DemoApp;
//import demoHomeApp.FactoryDemo;
//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.MobileDriver;
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.ios.IOSDriver;
//import io.appium.java_client.remote.MobileCapabilityType;
//import io.appium.java_client.remote.MobilePlatform;
//
//public class DemoTest {
//	
//	String OS = "Android";
//	String appType = "Phone";
//	String deviceType = "Emulator";
//	String deviceName = "Nexus";
//	String version = "5.1";
//	String  moduleName = "StartUp";
//	String app = "/Users/eclipse-workspace/CucumbeSeleniumScripts/MobileAutomation/StartUp/src/main/java/App/nyp2.apk";
//	String  appName = "nyp2.apk";
//	String  appPackage = "br.com.golmobile.nypost";
//	String appActivity = "com.wizeline.nypost.ui.collections.NYPCollectionActivity";
//	String platformName = "Android";
//	String platformVersion = "5.1";
//	String automationName = "UiAutomator";
//	String newCommandTimeout = "240";
//	File appDirectory= new File("src/app");
//	File findApp = new File(appDirectory,appName);
//	
//	AppiumDriver ad;
//	
////	-------------------
////	@Before
////	public void setUpCuke() throws IOException, InterruptedException {
////		commonAPI2.setUp(OS, appType, deviceType, deviceName, version, moduleName, appName, appPackage, appActivity);
////	}
////	------------------------------------------------------
//@Before
//public AppiumDriver setUpAndroidEnv()throws IOException,InterruptedException{
//	DesiredCapabilities cap = new DesiredCapabilities();
//	cap.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
//	cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
//	cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, version);
//	cap.setCapability("noReset","true");
//	cap.setCapability("unicodeKeyboard", "false");
//	cap.setCapability("resetKeyboard", "false");
//	cap.setCapability(MobileCapabilityType.APP, findApp.getAbsolutePath());
////	ad = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
//	 ad = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
//	ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	return ad;
//}
//	
//	FactoryDemo factoryDemo = new FactoryDemo();
//	DemoApp demoApp = new DemoApp();
//
////	------------------------------------------------------
//	@Given("demo app is open")
//	public void demo_app_is_open() {
//	    // Write code here that turns the phrase above into concrete actions
//	
////	    throw new PendingException();
//	}
//
//	@When("the user enters username")
//	public void the_user_enters_username() {
//	    // Write code here that turns the phrase above into concrete actions
//		ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
//		try {
//			ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//			factoryDemo.clickToGetMenu(ad);
//		}catch(Exception e) {
//			
//		}
//		
//		try {
//			
//			ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//			factoryDemo.enterValueInSearchField(ad);
//			} catch (InterruptedException e) {
//				//e.printStackTrace();
//			} 
//		
//		List<WebElement> elements = null;
//		
//		try {
//			factoryDemo.captureWebElementSearchTexts(ad);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//				
//		//throw new PendingException();
//	}
//
//	@When("the user enters password")
//	public void the_user_enters_password() {
//	    // Write code here that turns the phrase above into concrete actions
//			
////		throw new PendingException();
//	}
//
//	@When("the user clicks on Sign In button")
//	public void the_user_clicks_on_Sign_In_button() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("the user will be able to sign into the app ho")
//	public void the_user_will_be_able_to_sign_into_the_app_ho() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//}
