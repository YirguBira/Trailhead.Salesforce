//package demoHomeApp;
//
//import java.io.File;
//import java.io.IOException;
//import java.net.URL;
//import java.util.concurrent.TimeUnit;
//
////import org.junit.Before;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.testng.annotations.Optional;
//
////import baseScript.CommonAPI2;
//import cucumber.api.java.Before;
//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.ios.IOSDriver;
//import io.appium.java_client.remote.MobileCapabilityType;
//import io.appium.java_client.remote.MobilePlatform;
//
//public class SetUpAndTearDown {
//
//	AppiumDriver ad;
//	String deviceType = "Emulator";
//	String appType = "Phone";
//	String platformName = "Android";
//	String deviceName = "Nexus";
//	String platformVersion = "5.1";
//	String automationName = "UiAutomator2";
////	String appName = "Browser.apk";
//	String appName = "nyp2.apk";
//	String app = "/Users/eclipse-workspace/CucumbeSeleniumScripts/MobileAutomation/StartUp/src/App/nyp2.apk";
//	String newCommandTimeout = "240";
//	String appPackage = "br.com.golmobile.nypost";
//	File appDirectory;
//	File findApp;
//	String OS = "Android";
//	String version;
//	String moduleName;
//	String appActivity;
//	
////	CommonAPI2 commonAPI2 = new CommonAPI2();
//	
////	@Before
////	public void setUpCuke() throws IOException, InterruptedException {
////		commonAPI2.setUp(OS, appType, deviceType, deviceName, version, moduleName, appName, appPackage, appActivity);
////	}
//	
//	
//	
//	
////	----------------------------------------
////	-----------------------------------------
//	
//
//
////--------------------------------------------------------------------
////--------------------------------------------------------------------	
//	
//	
//	
//	
////	@Before
////    public void setUp(@Optional("android")String OS,@Optional("mobile") String appType,@Optional("real device") String deviceType,
////                      @Optional("") String deviceName, @Optional("") String version,@Optional("") String moduleName,
////                      @Optional("") String appName,@Optional("") String appPackage,@Optional("") String appActivity)throws IOException,InterruptedException{
////        if(OS.equalsIgnoreCase("ios")){
////            if(appType.contains("iPhone")){
////                appDirectory = new File("src/app");
////                findApp = new File(appDirectory,appName);
////                if(deviceType.equalsIgnoreCase("RealDevice")){
////                    ad = commonAPI2.setUpiOsEnv(deviceName,version);
////                }else if (deviceType.equalsIgnoreCase("Simulator")){
////                    ad = commonAPI2.setUpiOsEnv(deviceName,version);
////                }
////            }else if(appType.equalsIgnoreCase("iPad 2")){
////                appDirectory = new File("src/app");
////                findApp = new File(appDirectory,appName);
////                if(deviceType.contains("RealDevice")){
////                    ad = commonAPI2.setUpiOsEnv(deviceName,version);
////                }else if (deviceType.equalsIgnoreCase("Simulator")){
////                    ad = commonAPI2.setUpiOsEnv(deviceName,version);
////                }
////            }
////        }else if(OS.equalsIgnoreCase("Android")){
////            if(appType.contains("Phone")){
////                appDirectory = new File("src/app");
////                findApp = new File(appDirectory,appName);
////                if(deviceType.equalsIgnoreCase("RealDevice")){
////                    ad = commonAPI2.setUpAndroidEnv(deviceName,version, appActivity, appActivity, appActivity, appActivity, appActivity, appActivity, appActivity);
////                }else if (deviceType.equalsIgnoreCase("Emulator")){
////                    ad =commonAPI2.setUpAndroidEnv(deviceName,version, appActivity, appActivity, appActivity, appActivity, appActivity, appActivity, appActivity);
////                }
////            }else if(OS.equalsIgnoreCase("Tablets")){
////                if(deviceType.equalsIgnoreCase("RealDevice")){
////                    ad = commonAPI2.setUpAndroidEnv(deviceName,version, appActivity, appActivity, appActivity, appActivity, appActivity, appActivity, appActivity);
////                }else if (deviceType.equalsIgnoreCase("Emulator")){
////                    ad = commonAPI2.setUpAndroidEnv(deviceName,version, appActivity, appActivity, appActivity, appActivity, appActivity, appActivity, appActivity);
////                }
////            }
////        }
////    }
//}
