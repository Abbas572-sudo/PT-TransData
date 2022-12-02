package TransData.PT_Project;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.google.common.io.Files;

import PT.TestComponents.BaseTest;


import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;



public class SignIn extends BaseTest{
	ExtentReports extent;
  
	String email = "datatrans79@gmail.com";
	
	String password = "98n058310A310@";
	String newpassword = "98n058310A310@@@";


	@Test(priority=1 , description ="ali")
	
	
	public void userShouldAbletoSignInWithValidCrendentionals() throws IOException, InterruptedException {
		launchPT();
		
		Thread.sleep(20000);
		driver.findElement(By.cssSelector("div[class='signIn'] ul li a")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#email")).sendKeys("nasiqzaheem@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#password")).sendKeys("98n058310");
		Thread.sleep(10000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(20000);
		 String Alert =driver.findElement(By.cssSelector(".dropdown-toggle")).getText();
	     Assert.assertEquals(Alert , "Muhammad ");
	     Thread.sleep(3000);
		driver.close();
		
	}

@Test(priority=2)
	
	public void userShouldnotAbletoSiginWithUnRegisterCrendentionals() throws IOException, InterruptedException {
		launchPT();
		Thread.sleep(20000);
		driver.findElement(By.cssSelector("div[class='signIn'] ul li a")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#email")).sendKeys("talhanouman@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#password")).sendKeys("98n058310");
		Thread.sleep(10000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		String Alert =driver.findElement(By.cssSelector("span[role='alert'] strong")).getText();
	     Assert.assertEquals("These credentials do not match our records.",Alert );
	     Thread.sleep(3000);
	     driver.close();
		
	}
//	
@Test(priority=3)

public void userShouldnotAbletoSiginWithInavalidEmail() throws IOException, InterruptedException {
	launchPT();
	Thread.sleep(20000);
	driver.findElement(By.cssSelector("div[class='signIn'] ul li a")).click();
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("#email")).sendKeys("talhanouman@gmail");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("#password")).sendKeys("98n058310");
	Thread.sleep(10000);
	driver.findElement(By.cssSelector("button[type='submit']")).click();
	String Alert =driver.findElement(By.cssSelector("span[role='alert'] strong")).getText();
    Assert.assertEquals("These credentials do not match our records.",Alert );
    Thread.sleep(3000);
    driver.close();
	
}
@Test(priority=4)

public void userShouldnotAbletoSiginWithInavalidpassword() throws IOException, InterruptedException {
	launchPT();
	Thread.sleep(20000);
	driver.findElement(By.cssSelector("div[class='signIn'] ul li a")).click();
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("#email")).sendKeys("nasiqzaheem@gmail.com");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("#password")).sendKeys("98n058310A123");
	Thread.sleep(10000);
	driver.findElement(By.cssSelector("button[type='submit']")).click();
	String Alert =driver.findElement(By.cssSelector("span[role='alert'] strong")).getText();
    Assert.assertEquals("These credentials do not match our records.",Alert );
    Thread.sleep(3000);
    driver.close();
}
@Test(priority=5)

public void userShouldnotAbletoSiginWithInavalidcaptcha() throws IOException, InterruptedException {
	launchPT();
	Thread.sleep(20000);
	driver.findElement(By.cssSelector("div[class='signIn'] ul li a")).click();
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("#email")).sendKeys("nasiqzaheem@gmail.com");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("#password")).sendKeys("98n058310");
	Thread.sleep(10000);
	driver.findElement(By.cssSelector("button[type='submit']")).click();
	String Alert =driver.findElement(By.cssSelector("span[role='alert'] strong")).getText();
    Assert.assertEquals("Invalid Captcha!",Alert );
    driver.close();
  }
@Test(priority=6)

public void userShouldnotAbletoSigininifEmailFiledISEmpty() throws IOException, InterruptedException {
	launchPT();
	Thread.sleep(20000);
	driver.findElement(By.cssSelector("div[class='signIn'] ul li a")).click();
	//Thread.sleep(3000);
	//driver.findElement(By.cssSelector("#email")).sendKeys("nasiqzaheem@gmail.com");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("#password")).sendKeys("98n058310");
	Thread.sleep(10000);
	driver.findElement(By.cssSelector("button[type='submit']")).click();
	Thread.sleep(3000);
    driver.close();
 }
@Test(priority=7)

public void userShouldnotAbletoSiginifPasswordFiledISEmpty() throws IOException, InterruptedException {
	launchPT();
	Thread.sleep(20000);
	driver.findElement(By.cssSelector("div[class='signIn'] ul li a")).click();
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("#email")).sendKeys("nasiqzaheem@gmail.com");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("#password")).sendKeys("98n058310");
	Thread.sleep(30000);
	driver.findElement(By.cssSelector("button[type='submit']")).click();
	Thread.sleep(3000);
    driver.close();
}
@Test(priority=8)

public void userShouldnotAbletoSiginifCpatchaFieldIsEmpty() throws IOException, InterruptedException {
	launchPT();
Thread.sleep(20000);
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("div[class='signIn'] ul li a")).click();
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("#email")).sendKeys("nasiqzaheem@gmail.com");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("#password")).sendKeys("98n058310");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("button[type='submit']")).click();
    driver.close();
   
	
	
	
}

@Test(priority=9)

public void userShouldnotAbletoClickonRemebermeCheckBox() throws IOException, InterruptedException {
	launchPT();
	Thread.sleep(20000);
	driver.findElement(By.cssSelector("div[class='signIn'] ul li a")).click();
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("#email")).sendKeys("nasiqzaheem@gmail.com");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("#password")).sendKeys("98n058310");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("#remember")).click();
	Thread.sleep(3000);
    driver.close();
}
@Test(priority=10)

public void ChekcRemeberMefunction() throws IOException, InterruptedException {
	launchPT();
	Thread.sleep(20000);
	driver.findElement(By.cssSelector("div[class='signIn'] ul li a")).click();
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("#email")).sendKeys("nasiqzaheem@gmail.com");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("#password")).sendKeys("98n058310");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("#remember")).click();
	Thread.sleep(30000);
	driver.findElement(By.cssSelector("button[type='submit']")).click();
	Thread.sleep(20000);
	driver.findElement(By.cssSelector("img[alt='User']")).click();
	Thread.sleep(3000);
	driver.findElement(By.cssSelector(".dropdown-item.text-center[href='https://pt-demo.tdemo.biz/logout']")).click();
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("div[class='signIn'] ul li a")).click();
	Thread.sleep(10000);
	driver.findElement(By.cssSelector("button[type='submit']")).click();
	Thread.sleep(20000);
	 String Alert =driver.findElement(By.cssSelector(".dropdown-toggle")).getText();
    Assert.assertEquals("Muhammad ",Alert );
    Thread.sleep(3000);
    driver.close();
   
	
	
	
}
	
	

}
