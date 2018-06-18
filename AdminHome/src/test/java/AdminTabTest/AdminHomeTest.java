package AdminTabTest;

import adminTab.AdminHome;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;
import java.io.IOException;

public class AdminHomeTest extends CommonAPI {
    @Test
    public void clickOnSignInButton()throws InterruptedException, IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        AdminHome adminHome = PageFactory.initElements(driver, AdminHome.class);
        adminHome.operateOnAdminTab(driver);
    }
}
