//package demoHomeApp;
//
//import java.util.List;
//
//import org.junit.Test;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.PageFactory;
//
////import baseScript.CommonAPI;
////import baseScript.CommonAPI2;
////import baseScript.CommonAPI2;
//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.MobileDriver;
//import io.appium.java_client.android.AndroidDriver;
////import io.appium.java_client.android.AndroidDriver;
////import reporting.TestLogger;
//
//public class FactoryDemo {
//
//	AppiumDriver ad;
//
//	@Test
//	  public void clickToGetMenu(AppiumDriver ad) {
//	  DemoApp demoApp = PageFactory.initElements(ad, DemoApp.class);
//	  demoApp.getMenu(ad);
//	}
//    
//    @Test
//    public void captureAbout(AppiumDriver ad) throws InterruptedException {
//        //TestLogger.log("app is launched ...");
//        DemoApp demoApp = PageFactory.initElements(ad, DemoApp.class);
//        //demoApp.goToArticles(ad);
//        System.out.println("TC1 Passed");
//    }
//    
////    @Test
////    public void tapToSubmit(WebDriver md) throws InterruptedException {
////        //TestLogger.log("app is launched ...");
////        DemoApp demoApp = PageFactory.initElements(ad, DemoApp.class);
////        demoApp.tapOnSearchIcon(md);
////        System.out.println("TC1 Passed");
////    }
//    
//    List<WebElement> elements = null;
//   
//    @Test
//    public void captureWebElementSearchTexts(AppiumDriver ad) throws InterruptedException {
//        //TestLogger.log("app is launched ...");
//    	DemoApp demoApp = PageFactory.initElements(ad, DemoApp.class);
////        demoApp.getTextsSearch(ad, elements);
//        System.out.println("TC1 Passed");
//    }
//    
//    @Test
//    public void enterValueInSearchField(AppiumDriver ad) throws InterruptedException {
//       //TestLogger.log("app is launched ...");
//        DemoApp demoApp = PageFactory.initElements(ad, DemoApp.class);
//        demoApp.typeOnBtnSearch(ad);
//        System.out.println("TC1 Passed");
//        
//    }
//    
//    
////    @Test
////    public void clickToSearch(AppiumDriver ad) throws InterruptedException {
//////       TestLogger.log("app is launched ...");
////        DemoApp demoApp = PageFactory.initElements(ad, DemoApp.class);
////        demoApp.submitSearch(ad); 
////        System.out.println("TC1 Passed");
////    }
//    
//    @Test
//    public void validateTopStories(AppiumDriver ad) throws InterruptedException {
//       //TestLogger.log("app is launched ...");
//        DemoApp demoApp = PageFactory.initElements(ad, DemoApp.class);
//        demoApp.captureToValidateTopStories(ad);
//        System.out.println("TC1 Passed");
//    }
//    
//    @Test
//    public void validateBusiness(AppiumDriver ad) throws InterruptedException {
//       // TestLogger.log("app is launched ...");
//        DemoApp demoApp = PageFactory.initElements(ad, DemoApp.class);
//        demoApp.captureToValidateBusiness(ad);
//        System.out.println("TC1 Passed");
//    }
//}
