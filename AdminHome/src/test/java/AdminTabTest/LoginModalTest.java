//package AdminTabTest;
//
//import adminTab.LoginModal;
//import base.CommonAPI;
//import org.openqa.selenium.support.PageFactory;
//import org.testng.annotations.Test;
//import reporting.ApplicationLog;
//import reporting.TestLogger;
//
//public class LoginModalTest extends CommonAPI {
//
//    @Test
//    public void testLoginModal()throws InterruptedException{
//        ApplicationLog.epicLogger();
//        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
//        LoginModal loginModal = PageFactory.initElements(driver, LoginModal.class);
//        loginModal.operateOnLoginModal(driver);
//    }
//}
