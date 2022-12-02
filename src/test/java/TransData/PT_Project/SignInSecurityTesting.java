package TransData.PT_Project;

import org.testng.annotations.Test;
import org.zaproxy.clientapi.core.ClientApi;
import org.zaproxy.clientapi.core.ClientApiException;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.google.common.io.Files;

import PT.TestComponents.BaseTest;

import java.io.File;
import java.io.IOException;


import org.testng.annotations.Test;



public class SignInSecurityTesting{
	ExtentReports extent;
    static final String  ZAP_PROXY_ADDRESS = "localhost";
    static final int  ZAP_PROXY_PORT = 8080;
    static final String  ZAP_API_KEY = "vuome0imauvagrjrl76logj18r";
  
	private WebDriver driver;
	private ClientApi api;
	
	@BeforeMethod
	
	public  void setup() {
		String proxyServerUrl = ZAP_PROXY_ADDRESS +":"+ZAP_PROXY_PORT;
		Proxy proxy = new Proxy();
		proxy.setHttpProxy(proxyServerUrl);
		proxy.setSslProxy(proxyServerUrl);
		ChromeOptions co = new ChromeOptions();
		co.setAcceptInsecureCerts(true);
		co.setProxy(proxy);
		System.setProperty("webdriver.chrome.driver", "/Users/muhammadabbas/Downloads/chromedriver");
        driver = new ChromeDriver(co);
        api = new ClientApi(ZAP_PROXY_ADDRESS,ZAP_PROXY_PORT,ZAP_API_KEY);
		
	}
	
	@Test(priority=1)
	
	public void userShouldAbletoSignInWithValidCrendentionals() throws IOException, InterruptedException {
		
		driver.get("https://pt-demo.tdemo.biz/");
		Thread.sleep(60000);
		driver.findElement(By.cssSelector("div[class='signIn'] ul li a")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#email")).sendKeys("nasiqzaheem@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#password")).sendKeys("98058311");
		Thread.sleep(10000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(300000);
		driver.close();
		
	}
	@AfterMethod()
	public void tearDown() throws ClientApiException {
		if(api!=null) {
			String title = "Price Transparency Security Testing Report";
			String template = "traditional-html";
			String description = "This is Price Transparency Security Testing Report Tested by OWASP-ZAP \n *Tools and Technologies \n 1:Selenium \n 2:TestNG \n 3:Html-Report \n 4:OWASP-ZAP \n *Attempt:Active-Scan \n *Crawler:Ajax Spider \n *Default Alert Threshhold:High \n *Default Attack Strength:High \n *Test for Following Defects \n 1:SQL injection \n 2:Broken Authentication \n 3:Sensitive data exposure \n 4:Broken Access control \n 5:Security misconfiguration \n 6:Cross Site Scripting (XSS) \n 7:Insecure Deserialization \n 8:Components with known vulnerabilities \n 9;Missing security headers";
			String reportfilename = "PT-Security-Report.html";
			String targetFolder = System.getProperty("user.dir");
			String sites = "https://pt-demo.tdemo.biz/";
			
			api.reports.generate(title, template, null, description, null, sites, null, null, null, reportfilename, null, targetFolder, null);
		}
	}

}
