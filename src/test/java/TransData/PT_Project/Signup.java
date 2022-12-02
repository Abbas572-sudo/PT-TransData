package TransData.PT_Project;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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



public class Signup extends BaseTest{
	ExtentReports extent;
  
	String email = "datatrans79@gmail.com";
	
	String password = "98n058310A310@";
	String newpassword = "98n058310A310@@";
	
	@Test(priority=1)

	public void userShouldAbletoSiginUPwithvalidEmailPassword() throws IOException, InterruptedException {
		launchPT();
		Thread.sleep(20000);
		driver.findElement(By.cssSelector("div[class='signIn'] ul li a")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".btn.btn-sign-in.w-100.mt-1")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#first_name")).sendKeys("trans");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#last_name")).sendKeys("data");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#email")).sendKeys("talha01@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#password")).sendKeys("98n058310A310@");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#password-confirm")).sendKeys("98n058310A310@");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
	   
		
		//.toast-message
		
	}
	
	@Test(priority=2)

	public void userShouldnotAbletoSiginUPwithivalidEmail() throws IOException, InterruptedException {
		launchPT();
		Thread.sleep(20000);
		driver.findElement(By.cssSelector("div[class='signIn'] ul li a")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".btn.btn-sign-in.w-100.mt-1")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#first_name")).sendKeys("trans");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#last_name")).sendKeys("data");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#email")).sendKeys("datatrans79@");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#password")).sendKeys("98n058310A310@");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#password-confirm")).sendKeys("98n058310A310@");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
	   
		
		
		
	}
	@Test(priority=3)

	public void userShouldnotAbletoSiginUPwithivalidPassword() throws IOException, InterruptedException {
		launchPT();
		Thread.sleep(20000);
		driver.findElement(By.cssSelector("div[class='signIn'] ul li a")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".btn.btn-sign-in.w-100.mt-1")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#first_name")).sendKeys("trans");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#last_name")).sendKeys("data");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#email")).sendKeys("talha19@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#password")).sendKeys("98");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#password-confirm")).sendKeys("98");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(3000);
		String Alert =driver.findElement(By.cssSelector("span[role='alert'] strong")).getText();
	    Assert.assertEquals(Alert , "The password must be at least 12 characters." );
	    Thread.sleep(3000);
	    driver.close();
	   
		
		
		
	}
	@Test(priority=4)

	public void userShouldnotAbletoSiginUPwithNumberInFirstName() throws IOException, InterruptedException {
		launchPT();
		Thread.sleep(20000);
		driver.findElement(By.cssSelector("div[class='signIn'] ul li a")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".btn.btn-sign-in.w-100.mt-1")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#first_name")).sendKeys("123");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#last_name")).sendKeys("data");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#email")).sendKeys("talha9@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#password")).sendKeys("98n058310A310@");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#password-confirm")).sendKeys("98n058310A310@");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(3000);
		String Alert =driver.findElement(By.cssSelector("span[role='alert'] strong")).getText();
	    Assert.assertEquals(Alert , "The first name may only contain letters." );
	    Thread.sleep(3000);
	    driver.close();
	   
		
		
		
	}
	@Test(priority=5)

	public void userShouldnotAbletoSiginUPwithNumberLasttName() throws IOException, InterruptedException {
		launchPT();
		Thread.sleep(20000);
		driver.findElement(By.cssSelector("div[class='signIn'] ul li a")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".btn.btn-sign-in.w-100.mt-1")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#first_name")).sendKeys("trans");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#last_name")).sendKeys("123");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#email")).sendKeys("talha39@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#password")).sendKeys("98n058310A310@");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#password-confirm")).sendKeys("98n058310A310@");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(3000);
		String Alert =driver.findElement(By.cssSelector("span[role='alert'] strong")).getText();
	    Assert.assertEquals(Alert , "The last name may only contain letters." );
	    Thread.sleep(3000);
	    driver.close();
	   
		
		
		
	}
	@Test(priority=6)

	public void userShouldnotAbletoSiginUPifPasswordFieldIsdifferent() throws IOException, InterruptedException {
		launchPT();
		Thread.sleep(20000);
		driver.findElement(By.cssSelector("div[class='signIn'] ul li a")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".btn.btn-sign-in.w-100.mt-1")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#first_name")).sendKeys("trans");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#last_name")).sendKeys("data");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#email")).sendKeys("talha29@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#password")).sendKeys("98n058310A310@");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#password-confirm")).sendKeys("98n058310A210@");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(3000);
		String Alert =driver.findElement(By.cssSelector("span[role='alert'] strong")).getText();
	    Assert.assertEquals(Alert , "The password confirmation does not match." );
	    Thread.sleep(3000);
	    driver.close();
	   
		
		
		
	}
	@Test(priority=7)

	public void userShouldnotAbletoSiginUPifFirstNameFieldIsEmpty() throws IOException, InterruptedException {
		launchPT();
		Thread.sleep(20000);
		driver.findElement(By.cssSelector("div[class='signIn'] ul li a")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".btn.btn-sign-in.w-100.mt-1")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.cssSelector("#first_name")).sendKeys("");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#last_name")).sendKeys("data");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#email")).sendKeys("talha3@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#password")).sendKeys("98n058310A310@");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#password-confirm")).sendKeys("98n058310A210@");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(3000);

	    driver.close();
	   
		
		
		
	}
	@Test(priority=8)

	public void userShouldnotAbletoSiginUPifFirstFieldIsEmpty() throws IOException, InterruptedException {
		launchPT();
		Thread.sleep(20000);
		driver.findElement(By.cssSelector("div[class='signIn'] ul li a")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".btn.btn-sign-in.w-100.mt-1")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#first_name")).sendKeys("trans");
//		Thread.sleep(3000);
//		driver.findElement(By.cssSelector("#last_name")).sendKeys("data");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#email")).sendKeys("talha5@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#password")).sendKeys("98n058310A310@");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#password-confirm")).sendKeys("98n058310A210@");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(3000);
		
	    driver.close();
	   
		
		
		
	}
	@Test(priority=9)

	public void userShouldnotAbletoSiginUPifEmailFieldIsEmpty() throws IOException, InterruptedException {
		launchPT();
		Thread.sleep(20000);
		driver.findElement(By.cssSelector("div[class='signIn'] ul li a")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".btn.btn-sign-in.w-100.mt-1")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#first_name")).sendKeys("trans");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#last_name")).sendKeys("data");
//		Thread.sleep(3000);
//		driver.findElement(By.cssSelector("#email")).sendKeys("datatrans79@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#password")).sendKeys("98n058310A310@");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#password-confirm")).sendKeys("98n058310A210@");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(3000);
		
	    driver.close();
	   
		
		
		
	}
	@Test(priority=10)

	public void userShouldnotAbletoSiginUPifPasswordFieldIsEmpty() throws IOException, InterruptedException {
		launchPT();
		Thread.sleep(20000);
		driver.findElement(By.cssSelector("div[class='signIn'] ul li a")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".btn.btn-sign-in.w-100.mt-1")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#first_name")).sendKeys("trans");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#last_name")).sendKeys("data");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#email")).sendKeys("talha7@gmail.com");
		Thread.sleep(3000);
//		driver.findElement(By.cssSelector("#password")).sendKeys("98n058310A310@");
//		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#password-confirm")).sendKeys("98n058310A210@");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(3000);
		
	    driver.close();
	   
		
		
		
	}
	
	@Test(priority=11)

	public void userShouldnotAbletoSiginUPifConfirmPasswordFieldIsEmpty() throws IOException, InterruptedException {
		launchPT();
		Thread.sleep(20000);
		driver.findElement(By.cssSelector("div[class='signIn'] ul li a")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".btn.btn-sign-in.w-100.mt-1")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#first_name")).sendKeys("trans");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#last_name")).sendKeys("data");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#email")).sendKeys("talha89@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#password")).sendKeys("98n058310A310@");
		Thread.sleep(3000);
//		driver.findElement(By.cssSelector("#password-confirm")).sendKeys("98n058310A210@");
//		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(3000);
		
	    driver.close();
	   
		
		
		
	}
	
	
	@Test(priority=12)

	public void userShouldnotAbletoSiginUPwithAlreadyRegisreEmail() throws IOException, InterruptedException {
		launchPT();
		Thread.sleep(20000);
		driver.findElement(By.cssSelector("div[class='signIn'] ul li a")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".btn.btn-sign-in.w-100.mt-1")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#first_name")).sendKeys("trans");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#last_name")).sendKeys("data");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#email")).sendKeys("nasiqzaheem@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#password")).sendKeys("98n058310A310@");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#password-confirm")).sendKeys("98n058310A310@");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(3000);
		String Alert =driver.findElement(By.cssSelector("span[role='alert'] strong")).getText();
	    Assert.assertEquals(Alert , "The email has already been taken." );
	    Thread.sleep(3000);
	    driver.close();
	   
	  
		
		
	}







	

}
