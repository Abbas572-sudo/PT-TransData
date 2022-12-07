package Resources.objectModle;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ViewName;

public class ExtentReporterNG {
public static ExtentReports getReportObject()
{
String path = System.getProperty("user.dir")+"//reports//index.html";
ExtentSparkReporter reporter = new ExtentSparkReporter(path);

reporter.config().setReportName("PT MyProfile_Change_Password Test  Report");
reporter.config().setDocumentTitle("PT Test Results");
ExtentReports extent =new ExtentReports();
extent.attachReporter(reporter);
extent.setSystemInfo("Tester", "Abbas");

return extent;
}
}





//public class ExtentReporterNG {
//	
//	
////	public static  ExtentReports  getReportObject() {
//////		String path = System.getProperty("user.dir")+"//reports//index.html";
//////		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
//////		reporter.config().setReportName("AskSophieAutomatedTestResult");
//////		reporter.config().setDocumentTitle("TestResults");
//////	
//////		ExtentReports extent =  new ExtentReports();
//////		extent.attachReporter(reporter);
//////		extent.setSystemInfo("Tester", "M.Abbas");
////		
////		String path = System.getProperty("user.dir")+"//reports//index.html";
////		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
////		reporter.config().setReportName("We Automation Result");
////		reporter.config().setDocumentTitle("Test Results");
////		ExtentReports extent =  new ExtentReports();
////		extent.attachReporter(reporter);
////		extent.setSystemInfo("Tester", "Ramesh K");
////		return extent;
////	}
//	
//	public static ExtentReports getReportObject()
//	{
//	String path =System.getProperty("user.dir")+"//reports//index.html";
//	ExtentSparkReporter reporter = new ExtentSparkReporter(path);
//	reporter.config().setReportName("Web Automation Results");
//	reporter.config().setDocumentTitle("Test Results");
//	ExtentReports extent =new ExtentReports();
//	extent.attachReporter(reporter);
//	extent.setSystemInfo("Tester", "Rahul Shetty");
//	return extent;
//	}
//	
//	
//	
//	
//}
