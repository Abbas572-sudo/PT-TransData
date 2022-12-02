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
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.google.common.io.Files;

import PT.TestComponents.BaseTest;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;



public class MyProfile extends BaseTest{
	ExtentReports extent;
  
	String email = "datatrans79@gmail.com";
	
	String password = "98n058310A310@";
	String newpassword = "98n058310A310@@@";


	@Test(priority=1 , description ="Verify that user can change password ")
	
	
	public void VerifythatusercanChangepassword()  throws IOException, InterruptedException {
		launchPTNew();


		Thread.sleep(20000);
		driver.findElement(By.cssSelector("div[class='signIn'] ul li a")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#email")).sendKeys("nasiqzaheem@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#password")).sendKeys("98058312@");
		Thread.sleep(10000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(20000);
        driver.findElement(By.cssSelector("img[alt='User']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[normalize-space()='My Profile']")).click();
        Thread.sleep(3000);
       driver.findElement(By.cssSelector("a[class$='btn-warning']")).click();
	   Thread.sleep(3000);
	   driver.findElement(By.cssSelector("input[name='current_password']")).sendKeys("98058312@");
       Thread.sleep(3000);
	   driver.findElement(By.cssSelector("input[name='password']")).sendKeys("98058311");
	   Thread.sleep(3000);
	   driver.findElement(By.cssSelector("input[name='password_confirmation']")).sendKeys("98058311");
       Thread.sleep(3000);
	   driver.findElement(By.cssSelector("button[class$='btn-sign-in']")).click();
        Thread.sleep(3000);
	   String Alert =driver.findElement(By.cssSelector(".toast.toast-success")).getText();
	     Assert.assertEquals(Alert , "Password changed successfully");

		driver.close();
		
	}
	



}
