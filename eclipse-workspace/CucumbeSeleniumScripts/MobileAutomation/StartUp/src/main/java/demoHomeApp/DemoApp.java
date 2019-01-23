//package demoHomeApp;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//import org.junit.Assert;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Capabilities;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.By;
////import org.junit.Test;
////import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.RemoteWebDriver;
//import org.openqa.selenium.support.FindBy;
////import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter;
//
////import baseScript.CommonAPI;
//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.MobileDriver;
////import io.appium.java_client.MobileElement;
////import io.appium.java_client.MobileElement;
////import io.appium.java_client.android.AndroidDriver;
////import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.MobileElement;
//import io.appium.java_client.TouchAction;
////import io.appium.java_client.TouchShortcuts;
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.AndroidKeyCode;
////import io.appium.java_client.android.nativekey.AndroidKey;
////import io.appium.java_client.android.nativekey.KeyEvent;
////import io.appium.java_client.android.nativekey.KeyEventFlag;
//
//public class DemoApp {
//
//	
////	 @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.widget.Button")
//	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.widget.Button\n" + 
//			"")
//	public WebElement continueButton;
//	 
//
//    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button")
//    public WebElement continueButton2;
//
//    public WebElement getContinueButton(AppiumDriver ad) {
//        return continueButton;
//    }
//
//    public void setContinueButton(WebElement continueButton) {
//        this.continueButton = continueButton;
//    }
//
//    public WebElement getContinueButton2(AppiumDriver ad) {
//        return continueButton2;
//    }
//
//    public void setContinueButton2(WebElement continueButton2) {
//        this.continueButton2 = continueButton2;
//    }
//
//    public void clickOnContinueButton(AppiumDriver ad){
//        getContinueButton(ad).click();
//    }
//
//    public void clickOnContinueButton2(AppiumDriver ad){
//        getContinueButton2(ad).click();
//    }
//
//    public void clickToContinue(AppiumDriver ad) throws InterruptedException{
//    	clickOnContinueButton(ad);
//	}
//    public void clickToContinue2(AppiumDriver ad) throws InterruptedException{
//    	clickOnContinueButton2(ad);
//	}
//    
//    
//    //------------------------------------------------
//    //------------------------------------------------
//    
////  @FindBy(id = "br.com.golmobile.nypost:id/welcome_continue")
////  @FindBy(id = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.widget.Button")
//
//  @FindBy(className = "android.widget.ImageButton")
//  public WebElement btnBurger;
//
//  @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView")
//  public WebElement btnSearch;
//  
//  public WebElement getTxtPageHeading() {
//      return txtPageHeading;
//  }
//
//  public void setTxtPageHeading(WebElement txtPageHeading) {
//      this.txtPageHeading = txtPageHeading;
//  }
//
//  public void clickOnTextPageHeading(){
//      getTxtPageHeading().click();
//  }
//
//  @FindBy(xpath = "//android.widget.RelativeLayout[1]/android.widget.TextView[1]")
////  @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Menu\"]")
//  public WebElement txtPageHeading;
//  @FindBy(xpath = "br.com.golmobile.nypost:id/item_background")
////          "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.LinearLayout[1]/android.widget.ImageView[1]")
//  public WebElement imgPageHeading;
//  @FindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
//  public WebElement txtSectionTopHeadline;
//  @FindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[2]/android.support.v4.view.ViewPager[1]/android.widget.RelativeLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
//  public WebElement txtNewsItemHeadline;
//  @FindBy(xpath = "//android.widget.ListView[1]/android.widget.RelativeLayout")
////"//android.widget.ListView[1]/android.widget.RelativeLayout"
//  List<WebElement> mainMenu = new ArrayList<WebElement>();
//  @FindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.Button")
//  List<WebElement> alertTendingNews = new ArrayList<WebElement>();
//  String mainMenuArr[] = {"Latest Stories",/*"SAVED ARTICLES",*/"News","Metro", "Page Six","Sports","Business","Opinion","Entertainment","Fashion","Living","Media","Tech","Real Estate","Video","Photos","Page Six TV","Saved Articles","Settings"};
//  
//  public void setAlertTendingNews() {
//	  boolean displayed = alertTendingNews.get(0).isDisplayed();
//	  if (displayed = true) {
//          alertTendingNews.get(0).click();
//	  }
//	  else {
//            alertTendingNews.get(1).click();
//          }
//      }
//
////  public void setAlertTendingNews(String condition) {
////      if (alertTendingNews.get(0).isDisplayed()) {
////          switch (condition) {
////              case "yes":
////                  alertTendingNews.get(0).click();
////                  break;
////              case "no":
////                  alertTendingNews.get(1).click();
////                  break;
////          }
////      }
////  }
//  
////  	public void Menu(AppiumDriver ad){
////	  try {
//////			  ad.tap(1, 74, 135, 100);
////	//		  ad.findElement(By.className("//android.widget.ImageButton[@content-desc=\"Open menu\"]")).click();
//////		  getBtnBurger(ad).click();
////	  	}catch(Exception e) { 	  
////	  }
////	}
//  
//	public WebElement getBtnBurger(AppiumDriver ad) {
//		return btnBurger;
//	}
//	
//	public void setBtnBurger(WebElement btnBurger) {
//		this.btnBurger = btnBurger;
//	}
//	
//	public void getMenu(AppiumDriver ad){
//		
//		try {
////			  ad.tap(1, 74, 135, 100);
////			ad.tap(1, btnBurger, 200);
////			  ad.findElement(By.className("//android.widget.ImageButton[@content-desc=\"Open menu\"]")).click();
//		  getBtnBurger(ad).click();
//	  	}catch(Exception e) { 	  
//	  }
////	      ad.tap(1, btnBurger, 2);
////	      getBtnBurger(ad).click();
//		
//	}
//
//	public WebElement getBtnSearch(AppiumDriver ad) {
//		return btnSearch;
//	}
//
//	public void setBtnSearch(WebElement btnSearch) {
//		this.btnSearch = btnSearch;
//	}
//  
//	public boolean validateClickable(AppiumDriver ad, WebElement element) {
//		try {
//          WebDriverWait wait = new WebDriverWait(ad, 10);
////          wait.until(ExpectedConditions.elementToBeClickable(element));
//      } catch (Error e) {
//          return false;
//      }
//      return true;
//	}
////  
//	  @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ViewAnimator/android.widget.FrameLayout/android.support.v4.view.ViewPager/android.widget.ViewAnimator/android.view.View/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView")
//	  WebElement searchEditField;
//	
//	public WebElement getSearchEditField(AppiumDriver ad) {
//		return searchEditField;
//	}
//	
//	public void setSearchEditField(WebElement searchEditField) {
//		this.searchEditField = searchEditField;
//	}
//	
////	public void operateOnEditSearchField(AppiumDriver ad) {
////		getSearchEditField(ad).sendKeys(Keys.ENTER);
////	}
//  
//	public void typeOnBtnSearch(AppiumDriver ad) throws InterruptedException{
//		
//	//	ad.tap(1, getBtnSearch(ad), 200);
//		ad.tap(1, 143, 200, 0);
//		//validateClickablead, btnSearch);
//	//	ad.findElementById("search_container").sendKeys("Latest Stories");
//		Thread.sleep(1000);
//	    
//	    ad.tap(1, 70, 139, 0);
//	    Thread.sleep(1000);
//	   // ad.tap(1, 128, 286, 0);
//	    Thread.sleep(1000);
//	    ad.getKeyboard().sendKeys("Latest Stories");
////	    getSearchEditField(ad).sendKeys("Latest Stories");
////	    ad.tap(1, btnSearch, 200);
//	  
//	  /*ad.tap(1, 295, 143, 100);*/
//	    ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		//ad.tap(1, 991, 1684, 200);
//	    ad.navigate();
//	    
//	   // new TouchAction(ad);
//	   System.out.println("hashcode: "+ad.getKeyboard().hashCode());
//	   //WebDriver ad1;
//	   //ad1.get.sendKeyEvent(AndroidKeyCode.ENTER);
//	   //new TouchAction(ad);
//	   getSearchEditField(ad).click();
//	   
////	   ad.getKeyboard().sendKeyEvent(AndroidKeyCode.ENTER);
////	   pressKey(new KeyEvent(AndroidKey.ENTER)
////               .withFlag(KeyEventFlag.SOFT_KEYBOARD)
////               .withFlag(KeyEventFlag.KEEP_TOUCH_MODE)
////               .withFlag(KeyEventFlag.EDITOR_ACTION));
//	  // ad.getKeyboard().pressKey("AndroidKeyCode.ENTER");
//	   //ad.getKeyboard().sendKeys("y");
//	}
//	
////	public void tapOnSearchIcon(WebDriver md) {
////		//new TouchAction(md);
////		md.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
////		((TouchShortcuts) md).tap(1, 991, 1684, 200);
////		
//////		ad.tap(1, btnSearch, 200);	
////	//	ad.getKeyboard().sendKeys(Keys.ENTER);
////	    //  ad.getKeyboard().sendKeys("Latest Stories");
////	//      getBtnBurger(ad).click();
////		
////		
////	  }
//
////	public void submitSearch(AppiumDriver<MobileElement> ad) {
////		try {
////		ad.tap(1, btnSearch.getLocation().getX(),btnSearch.getLocation().getY(), 10);
////		}catch(Exception e) {
////			
////		}
////		ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
//		
////	}
//	
////    public List<String> getTextsSearch(AppiumDriver ad, List<WebElement> elements) {
////    	List<MobileElement> els = ad.findElementsById("br.com.golmobile.nypost:id/container");
////        List<String> text = new ArrayList<String>();
////        for (WebElement element : els) {
////        	text.add(element.getAttribute("className"));
////        	System.out.println("elements are: "+text);
////        }
////        
////        return text;
////        
////    }
//
//	public void getTopStories(AppiumDriver ad) throws InterruptedException{
//	//      Menu(ad);
////		  ad.manage().timeouts();
//	//	  ad.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//	//	  ad.scrollToExact(mainMenuArr[5]).click();
//	      //scrollAndClickByName(mainMenuArr[0]);     
//	//    	if(ad.scrollToExact(mainMenuArr[0]).isDisplayed()) {
//	//    		System.out.println("LATEST STORIES heading displayed!");
//	//    		//Assert.assertTrue(txtPageHeading.getText().contains("Latest Stories"));
//	//    	}
//	//    	else {
//	//    		System.out.println("Latest Stories heading is not displayed!");
//	//    	}
////	    	ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	}
//	
////  public void getSavedArticles(AppiumDriver ad){
////      getMenu();
////      scrollAndClickByName(mainMenuArr[15]);
////      Assert.assertTrue(txtPageHeading.getText().contains("SAVED ARTICLES"));
////  }
////  
////  public void getNews(AppiumDriver ad){
////      getMenu();
////      scrollAndClickByName(mainMenuArr[1]);
//////      Assert.assertTrue(txtPageHeading.getText().contains("NEWS"));
////  }
////  public void getMetro(AppiumDriver ad){
////      getMenu();
////      scrollAndClickByName(mainMenuArr[2]);
//////      Assert.assertTrue(txtPageHeading.getText().contains("METRO"));
////  }
////  public void getPageSix(AppiumDriver ad){
////      getMenu();
////      scrollAndClickByName(mainMenuArr[3]);
////      //Assert.assertTrue(imgPageHeading.getSize().width==229);
////      //Assert.assertTrue(imgPageHeading.getSize().height==54);
////  }
////  public void getSports(AppiumDriver ad){
////      getMenu();
////      scrollAndClickByName(mainMenuArr[4]);
//////      Assert.assertTrue(txtPageHeading.getText().contains("SPORTS"));
////  }
//  public void getBusiness(AppiumDriver ad){
//// 	Menu(ad);
//    //ad.scrollToExact(mainMenuArr[5]).click();
////      Assert.assertTrue(txtPageHeading.getText().contains("BUSINESS"));
//  }
////  public void getOpinion(AppiumDriver ad){
////      getMenu();
////      scrollAndClickByName(mainMenuArr[6]);
//////      Assert.assertTrue(txtPageHeading.getText().contains("OPINION"));
////  }
////  public void getEntertainment(AppiumDriver ad){
////      getMenu();
////      scrollAndClickByName(mainMenuArr[7]);
//////      Assert.assertTrue(txtPageHeading.getText().contains("ENTERTAINMENT"));
////  }
////  public void getFashion(AppiumDriver ad){
////      getMenu();
////      scrollAndClickByName(mainMenuArr[8]);
//////      Assert.assertTrue(txtPageHeading.getText().contains("FASHION"));
////  }
////  public void getLiving(AppiumDriver ad){
////      getMenu();
////      scrollAndClickByName(mainMenuArr[9]);
//////      Assert.assertTrue(txtPageHeading.getText().contains("LIVING"));
////  }
////  public void getMedia(AppiumDriver ad){
////      getMenu();
////      scrollAndClickByName(mainMenuArr[10]);
//////      Assert.assertTrue(txtPageHeading.getText().contains("MEDIA"));
////  }
////  public void getTech(AppiumDriver ad){
////      getMenu();
////      scrollAndClickByName(mainMenuArr[11]);
//////      Assert.assertTrue(txtPageHeading.getText().contains("TECH"));
////  }
////  public void getRealEstate(AppiumDriver ad){
////      getMenu();
////      scrollAndClickByName(mainMenuArr[12]);
//////      Assert.assertTrue(txtPageHeading.getText().contains("REAL ESTATE"));
////  }
////  public void getPhotots(AppiumDriver ad){
////      getMenu();
////      scrollAndClickByName(mainMenuArr[14]);
//////      Assert.assertTrue(txtPageHeading.getText().contains("PHOTOS"));
////  }
////  public void getVideo(AppiumDriver ad){
////      getMenu();
////      scrollAndClickByName(mainMenuArr[13]);
//////      Assert.assertTrue(txtPageHeading.getText().contains("VIDEO"));
////  }
////  public void getAbout(AppiumDriver ad) {
////      getMenu();
////      scrollAndClickByName(mainMenuArr[16]);
////      //Assert.assertTrue(txtPageHeading.getText().contains("ABOUT"));
////  }
//  
////public void scrollToElement(AppiumDriver ad, String text){
////      MobileElement we = (MobileElement) ad.findElementByXPath(text);
////      ad.scrollTo(we.getText());
////  }
//  
//  public void captureToValidateTopStories(AppiumDriver ad) throws InterruptedException{
//	  getTopStories(ad);
//  }
//  
//  public void captureToValidateBusiness(AppiumDriver ad) throws InterruptedException{
//	  getBusiness(ad);
//  }
//  
////  public void captureToValidateEntertainment(AppiumDriver ad) throws InterruptedException{
////	  getEntertainment(ad);
////  }
////  
////  public void captureToValidateFashion(AppiumDriver ad) throws InterruptedException{
////	  getFashion(ad);
////  }
////  
////  public void captureToValidateMetro(AppiumDriver ad) throws InterruptedException{
////	  getMetro(ad);
////  }
////  
////  public void captureToValidateNews(AppiumDriver ad) throws InterruptedException{
////	  getNews(ad);
////  }
////  
////  public void captureToValidateOpinion(AppiumDriver ad) throws InterruptedException{
////	  getOpinion(ad);
////  }
////  
////  public void captureToValidatePageSix(AppiumDriver ad) throws InterruptedException{
////	  getPageSix(ad);
////  }
////  
////  public void captureToValidateMedia(AppiumDriver ad) throws InterruptedException{
////	  getMedia(ad);
////  }
////  
////  public void captureToValidateRealEstate(AppiumDriver ad) throws InterruptedException{
////	  getRealEstate(ad);
////  }
////  
////  public void captureToValidateSports(AppiumDriver ad) throws InterruptedException{
////	  getSports(ad);
////  }
////  
////  public void captureToValidateLiving(AppiumDriver ad) throws InterruptedException{
////	  getLiving(ad);
////  }
////  
////  public void captureToValidatePhotots(AppiumDriver ad) throws InterruptedException{
////	  getPhotots(ad);
////  }
////  
////  public void captureToValidateVideo(AppiumDriver ad) throws InterruptedException{
////	  getVideo(ad);
////  }
////  
////  public void captureToValidateTech(AppiumDriver ad) throws InterruptedException{
////	  getTech(ad);
////  }
////
////  public void captureToValidateSavedArticles(AppiumDriver ad) throws InterruptedException{
////	  getSavedArticles(ad);
////  }
////
////  public void goToArticles(AppiumDriver ad) throws InterruptedException {
////      getAbout(ad);
////  }
//}
