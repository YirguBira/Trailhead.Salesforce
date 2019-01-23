package facebookHome;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		plugin = {"pretty"} /*"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-extent-reports/report.html","html:target/cucumber-reports/Cucumber"}*/,
		features = "facebook.feature",
		glue = "facebookHome",
		monochrome = true
		
		)

public class FacebookTestRunner {
//	 @AfterClass
//	 public static void writeExtentReport() {
//	 Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
//	 }
}
