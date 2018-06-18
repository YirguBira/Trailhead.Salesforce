package adminTab;
import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class AdminHome extends CommonAPI {

    // Click on Sign In button (upper right corner)
    @FindBy(css = ".slds-button")
    WebElement signInButton;
    public WebElement getSignInButton() {
        return signInButton;
    }
    public void setSignInButton(WebElement signInButton) {
        this.signInButton = signInButton;
    }
    public void clickOnSignInButton(){
        signInButton.click();
    }

    //Click on Sign In with Salesforce (Singn In options modal)
    @FindBy(css = ".th-modal-auth__title")
    public WebElement loginModal;
    @FindBy(css = ".th-signin-icon__salesforce")
    public WebElement loginModalClick;

    public WebElement getloginModal() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return loginModal;
    }
    public void setloginModal(WebElement loginModal) {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        this.loginModalClick = loginModal;
    }
    public WebElement getloginModalClick() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return loginModalClick;
    }
    public void setLoginModalClick(WebElement loginModalClick) {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        this.loginModalClick = loginModalClick;
    }
    public boolean isLoginModaDisplayed(WebDriver driver1, String locator){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        boolean value = CommonAPI.isPopUpWindowDisplayed(driver1, locator);
        return value;
    }
    public void clickOnSignInWithSalesforce(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        setLoginModalClick(loginModalClick);
        getloginModalClick().click();
    }
    public void operateOnLoginModal(WebDriver driver1)throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CommonAPI.sleepFor(2);
        if(isLoginModaDisplayed(driver1, ".th-modal-auth__title")) {
            TestLogger.log("Yes, it is displayed. Handle it now.");
            clickOnSignInWithSalesforce();
            TestLogger.log("Sleep for 2 sec");
            CommonAPI.sleepFor(2);
        }
    }

    //Enter user name
    @FindBy(css = ".username")
    WebElement userNameField;

    public WebElement getUserNameField() {
        return userNameField;
    }
    public void setUserNameField(WebElement userNameField) {
        this.userNameField = userNameField;
    }
    public void enterUserName() {
        userNameField.sendKeys("yirgu@pat.com");
    }

    //Enter password
    @FindBy(css = ".password")
    WebElement passwordField;
    public WebElement getpasswordField() {
        return passwordField;
    }
    public void setpasswordField(WebElement passwordField) {
        this.userNameField = passwordField;
    }
    public void enterPassword() {
        passwordField.sendKeys("EmeYir90");
    }

    //Click on Login button
    @FindBy(css = "input[type='submit']")
    WebElement logInButton;
    public WebElement getlogInButton() {
        return logInButton;
    }
    public void setlogInButton(WebElement logInButton) {
        this.logInButton = logInButton;
    }
    public void clickOnLoginButton() {
        logInButton.click();
    }

    //Operate on Admin tab
    public void operateOnAdminTab(WebDriver driver1)throws InterruptedException {
        clickOnSignInButton();
        sleepFor(2);
        if(isLoginModaDisplayed(driver1, ".th-modal-auth__title")) {
            TestLogger.log("Yes, displayed. Handle it now.");
            clickOnSignInWithSalesforce();
            TestLogger.log("Sleep for 2 sec");
            CommonAPI.sleepFor(2);
        }
        enterUserName();
        enterPassword();
        clickOnLoginButton();
        }
    }

