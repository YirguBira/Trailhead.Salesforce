//package reporting;
//
//import com.relevantcodes.extentreports.ExtentReports;
////import org.testng.ITestContext;
////import org.testng.Reporter;
//import java.io.File;
//
////import org.testng.ITestContext;
////import org.testng.Reporter;
//
//public class ExtentManager {
//    public static ExtentReports extent;
////    public static ITestContext context;
//
//    public synchronized static ExtentReports getInstance() {
//        if (extent == null) {
////            File outputDirectory = new File(context.getOutputDirectory());
////            File resultDirectory = new File(outputDirectory.getParentFile(), "html");
//            extent = new ExtentReports(System.getProperty("user.dir") + "/Extent-Report/ExtentReport.html", true);
////            Reporter.log("Extent Report directory: " + resultDirectory, true);
//            extent.addSystemInfo("Host Name" , "Local")
//                    .addSystemInfo("Environment", "QA")
//                    .addSystemInfo("User Name", "Team Two");
//            extent.loadConfig(new File(System.getProperty("user.dir") + "/report-config.xml"));
//        }
//        return extent;
//    }
////    public static void setOutputDirectory(ITestContext context) {
////        ExtentManager.context = context;
////    }
//}
