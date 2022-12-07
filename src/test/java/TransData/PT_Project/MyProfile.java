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


	@Test(priority=1 , description ="Verify that user can update profile with valid first name ")
	
	
	public void VerifythatuserCanupdatprofilewithvalidfirstname()  throws IOException, InterruptedException {
		launchPTNew();
		
		Thread.sleep(20000);
		driver.findElement(By.cssSelector("div[class='signIn'] ul li a")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#email")).sendKeys("nasiqzaheem@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#password")).sendKeys("98058311");
		Thread.sleep(10000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(20000);
        driver.findElement(By.cssSelector("img[alt='User']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[normalize-space()='My Profile']")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input[name='first_name']")).clear();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input[name='first_name']")).sendKeys("Muhammad");
       Thread.sleep(3000);
       driver.findElement(By.cssSelector("button[class='btn btn-sign-in']")).click();
        String Alert =driver.findElement(By.cssSelector(".toast.toast-success")).getText();
	     Assert.assertEquals(Alert , "Profile has been updated successfully");
        driver.close();
		
	}
	
	@Test(priority=2 , description ="Verify that user can not update profile with invalid first name")
	
	
	public void Verifythatusercannotupdateprofilewithinvalidfirstname() throws IOException, InterruptedException {
		launchPTNew();
		Thread.sleep(20000);
        driver.findElement(By.cssSelector("img[alt='User']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[normalize-space()='My Profile']")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input[name='first_name']")).clear();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input[name='first_name']")).sendKeys("1234");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("button[class='btn btn-sign-in']")).click();
        Thread.sleep(3000);
        String Alert =driver.findElement(By.cssSelector(".alert")).getText();
	     Assert.assertEquals(Alert , "Validation Error: The first name may only contain letters.");
        driver.close();
		
	}
	
	@Test(priority=3 , description ="Verify that user can update profile with valid last name")
	
	
	public void Verifythatusercanupdateprofilewithvalidlastname()  throws IOException, InterruptedException {
		launchPTNew();
		Thread.sleep(20000);
        driver.findElement(By.cssSelector("img[alt='User']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[normalize-space()='My Profile']")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input[name='last_name']")).clear();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input[name='last_name']")).sendKeys("Abbas");
       Thread.sleep(3000);
       driver.findElement(By.cssSelector("button[class='btn btn-sign-in']")).click();
        String Alert =driver.findElement(By.cssSelector(".toast.toast-success")).getText();
	     Assert.assertEquals(Alert , "Profile has been updated successfully");
        driver.close();
//		
	}
	@Test(priority=4 , description ="Verify that user can not update profile with invalid last name")
	
	
	public void Verifythatusercannotupdateprofilewithinvalidlastname() throws IOException, InterruptedException {
		launchPTNew();
		Thread.sleep(20000);
        driver.findElement(By.cssSelector("img[alt='User']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[normalize-space()='My Profile']")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input[name='last_name']")).clear();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input[name='last_name']")).sendKeys("1234");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("button[class='btn btn-sign-in']")).click();
        Thread.sleep(3000);
        String Alert =driver.findElement(By.cssSelector(".alert")).getText();
	     Assert.assertEquals(Alert , "Validation Error: The last name may only contain letters.");
        driver.close();
		
	}
	@Test(priority=5 , description ="Verify that user can update profile with valid phone number")
	
	
	public void Verifythatusercanupdateprofilewithvalidphonenumber() throws IOException, InterruptedException {
		launchPTNew();
		Thread.sleep(20000);
        driver.findElement(By.cssSelector("img[alt='User']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[normalize-space()='My Profile']")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("button[class='btn btn-sign-in']")).click();
        Thread.sleep(3000);
        String Alert =driver.findElement(By.cssSelector(".toast.toast-success")).getText();
	     Assert.assertEquals(Alert , "Profile has been updated successfully");
        driver.close();
		
	}
@Test(priority=6 , description ="Verify that user can not update profile with invalid phone number")
	
	
	public void Verifythatusercannotupdateprofilewithinvalidphonenumber() throws IOException, InterruptedException {
		launchPTNew();
		Thread.sleep(20000);
        driver.findElement(By.cssSelector("img[alt='User']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[normalize-space()='My Profile']")).click();

       
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("button[class='btn btn-sign-in']")).click();
        Thread.sleep(3000);
        String Alert =driver.findElement(By.cssSelector(".toast.toast-success")).getText();
	     Assert.assertEquals(Alert , "Profile has been updated successfully");
        driver.close();
		
	}
@Test(priority=7 , description ="Verify that user can update profile by selecting insurance from drop down list")


public void Verifythatusercanupdateprofilebyselectinginsurancefromdropdownlist () throws IOException, InterruptedException {
	launchPTNew();
	Thread.sleep(20000);
    driver.findElement(By.cssSelector("img[alt='User']")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//a[normalize-space()='My Profile']")).click();
    Thread.sleep(3000);
    Select insurance = new Select(driver.findElement(By.cssSelector("select[name='insurance']")));
    insurance.selectByVisibleText("UHC");
    Thread.sleep(3000);
    driver.findElement(By.cssSelector("button[class='btn btn-sign-in']")).click();
    
    Thread.sleep(3000);
    String Alert =driver.findElement(By.cssSelector(".toast.toast-success")).getText();
    Assert.assertEquals(Alert , "Profile has been updated successfully");
    driver.close();
	
}
@Test(priority=8 , description ="Verify that user can update profile by selecting maritial status")


public void Verifythatusercanupdateprofilebyselectingmaritialstatus () throws IOException, InterruptedException {
	launchPTNew();
	Thread.sleep(20000);
    driver.findElement(By.cssSelector("img[alt='User']")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//a[normalize-space()='My Profile']")).click();
    Thread.sleep(3000);
    Select insurance = new Select(driver.findElement(By.cssSelector("select[name='martial_status']")));
    insurance.selectByVisibleText("Married");
    Thread.sleep(3000);
    driver.findElement(By.cssSelector("button[class='btn btn-sign-in']")).click();
    
    Thread.sleep(3000);
    String Alert =driver.findElement(By.cssSelector(".toast.toast-success")).getText();
    Assert.assertEquals(Alert , "Profile has been updated successfully");
    driver.close();
	
}
@Test(priority=9 , description ="Verify that user can update profile by un select maritial status")


public void Verifythatusercanupdateprofilebyunselectmaritialstatus () throws IOException, InterruptedException {
	launchPTNew();
	Thread.sleep(20000);
    driver.findElement(By.cssSelector("img[alt='User']")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//a[normalize-space()='My Profile']")).click();
    Thread.sleep(3000);
    Select insurance = new Select(driver.findElement(By.cssSelector("select[name='martial_status']")));
    insurance.selectByVisibleText("Please Marital Status");
    Thread.sleep(3000);
    driver.findElement(By.cssSelector("button[class='btn btn-sign-in']")).click();
    
    Thread.sleep(3000);
    String Alert =driver.findElement(By.cssSelector(".toast.toast-success")).getText();
    Assert.assertEquals(Alert , "Profile has been updated successfully");
    driver.close();
	
}
@Test(priority=10 , description ="Verify that user can update profile by selecting gender")

public void Verifythatusercanupdateprofilebyselectinggender () throws IOException, InterruptedException {
	launchPTNew();
	Thread.sleep(20000);
    driver.findElement(By.cssSelector("img[alt='User']")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//a[normalize-space()='My Profile']")).click();
    Thread.sleep(3000);
   driver.findElement(By.cssSelector("#male")).click();
    Thread.sleep(3000);
    driver.findElement(By.cssSelector("button[class='btn btn-sign-in']")).click();
    
    Thread.sleep(3000);
    String Alert =driver.findElement(By.cssSelector(".toast.toast-success")).getText();
    Assert.assertEquals(Alert , "Profile has been updated successfully");
    driver.close();
	
}

@Test(priority=11 , description ="Verify that user can update date of birth ")


public void Verifythatusercanupdatedateofbirth  () throws IOException, InterruptedException {
	launchPTNew();
	Thread.sleep(20000);
    driver.findElement(By.cssSelector("img[alt='User']")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//a[normalize-space()='My Profile']")).click();
    Thread.sleep(3000);
   driver.findElement(By.cssSelector("input[name='date_of_birth']")).sendKeys("10/04/1995");
    Thread.sleep(3000);
    driver.findElement(By.cssSelector("button[class='btn btn-sign-in']")).click();
    
    Thread.sleep(3000);
    String Alert =driver.findElement(By.cssSelector(".toast.toast-success")).getText();
    Assert.assertEquals(Alert , "Profile has been updated successfully");
    driver.close();
	
}


	@Test(priority=12 , description ="Verify that user can upload profile pic")
	
	
	public void Verifythatusercanuploadprofilepic  () throws IOException, InterruptedException, AWTException {

		launchPTNew();
		
		Thread.sleep(20000);
	    driver.findElement(By.cssSelector("img[alt='User']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//a[normalize-space()='My Profile']")).click();
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//input[@id='upfile']")).sendKeys("/Users/muhammadabbas/Desktop/Abbas.jpeg");
	   Thread.sleep(3000);
	   

	    String Alert =driver.findElement(By.cssSelector(".toast.toast-success")).getText();
	    Assert.assertEquals(Alert , "Profile has been updated successfully");
	    driver.close();
		
	}
	@Test(priority=13 , description ="Verify that user should not able to update profile with out date of birth ")
	
	
	public void Verifythatusershouldnotabletoupdateprofilewithoutdateofbirth () throws IOException, InterruptedException, AWTException {
		launchPTNew();
		Thread.sleep(20000);
	    driver.findElement(By.cssSelector("img[alt='User']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//a[normalize-space()='My Profile']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector("input[name='date_of_birth']")).clear();
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector("button[class='btn btn-sign-in']")).click();
	    
	    Thread.sleep(3000);
	    String Alert =driver.findElement(By.cssSelector(".toast.toast-success")).getText();
	    Assert.assertEquals(Alert , "Profile has been updated successfully");
	    driver.close();
		
	}
//	


}
