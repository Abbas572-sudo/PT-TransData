package PT.TestComponents;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.gson.JsonObject;



public class BaseTest {
	
	public WebDriver driver;
	
	public WebDriver intializeDriver() throws IOException {
		
		Properties pro = new Properties();
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//main//java//Resources//objectModle//objectModleResources.properties");
		pro.load(fis);
	    String browserName = pro.getProperty("browser");
	    
	    
	    if(browserName.equalsIgnoreCase("chrome")) {
	    	
	    	System.setProperty("webdriver.chrome.driver", "/Users/muhammadabbas/Downloads/chromedriver");
	    	

	    	driver = new ChromeDriver();
	    }
	    
	    return driver;
		
		
		
		
		
		
	}
	
	public WebDriver intializeDriverNew() throws IOException {
		
		Properties pro = new Properties();
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//main//java//Resources//objectModle//objectModleResources.properties");
		pro.load(fis);
	    String browserName = pro.getProperty("browser");
	    
	    
	    if(browserName.equalsIgnoreCase("chrome")) {
	    	
	    	System.setProperty("webdriver.chrome.driver", "/Users/muhammadabbas/Downloads/chromedriver");
	    	ChromeOptions options = new ChromeOptions();
		    options.addArguments("user-data-dir=/tmp/tarun");
		    options.addArguments("--start-maximized");
		   
	    	driver = new ChromeDriver(options);
	    
		      
	    }
	    
	    return driver;
		
		
		
		
		
		
	}
	
	public String getScreenShot(String testCaseName,WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File file = new File(System.getProperty("user.dir")+"//reports//"+testCaseName+".png");
		FileUtils.copyFile(source, file);
		return System.getProperty("user.dir")+"//reports//"+testCaseName+".png";
	}
	
	
	
	public void launchPT() throws IOException {
		driver = intializeDriver();
		driver.manage().window().maximize();
		driver.get("https://pt-demo.tdemo.biz/");
		
		}
	public void launchPTNew() throws IOException {
		driver = intializeDriverNew();
		driver.manage().window().maximize();
		driver.get("https://pt-demo.tdemo.biz/");
		
		}
	

}
