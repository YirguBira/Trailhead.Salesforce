//package adminTab;
//
//import base.CommonAPI;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import reporting.TestLogger;
//
//public class LoginModal {
//
//    @FindBy(css = ".th-modal-auth__title")
//    public WebElement loginModal;
//    @FindBy(css = ".th-signin-icon__salesforce")
//    public WebElement loginModalClick;
//
//
//    public WebElement getloginModal() {
//        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
//        return loginModal;
//    }
//
//    public void setloginModal(WebElement loginModal) {
//        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
//        this.loginModalClick = loginModal;
//    }
//
//    public WebElement getloginModalClick() {
//        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
//        return loginModalClick;
//    }
//
//    public void setLoginModalClick(WebElement loginModalClick) {
//        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
//        this.loginModalClick = loginModalClick;
//    }
//
//    public boolean isLoginModaDisplayed(WebDriver driver1, String locator){
//        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
//        boolean value = CommonAPI.isPopUpWindowDisplayed(driver1, locator);
//        return value;
//    }
//    public void clickOnSignInWithSalesforce(){
//        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
//        setLoginModalClick(loginModalClick);
//        getloginModalClick().click();
//    }
//
//    public void operateOnLoginModal(WebDriver driver1)throws InterruptedException{
//        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
//        CommonAPI.sleepFor(2);
//        if(isLoginModaDisplayed(driver1, ".th-modal-auth__title")) {
//            TestLogger.log("Yes, displayed. Handle it now.");
//            clickOnSignInWithSalesforce();
//            TestLogger.log("Sleep for 2 sec");
//            CommonAPI.sleepFor(2);
//        }
//    }
//}
