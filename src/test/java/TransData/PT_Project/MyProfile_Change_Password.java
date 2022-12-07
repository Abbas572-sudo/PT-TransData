package TransData.PT_Project;

import PT.TestComponents.BaseTest;
import com.aventstack.extentreports.ExtentReports;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;


public class MyProfile_Change_Password extends BaseTest{
	ExtentReports extent;
  
	String email = "datatrans79@gmail.com";
	
	String password = "98n058310A310@";
	String newpassword = "98n058310A310@@@";



	@Test(priority=1 , description ="Verify that user can change password ")
	
	
	public void Test1()  throws IOException, InterruptedException {
		launchPTNew();


		/*Thread.sleep(20000);
		driver.findElement(By.cssSelector("div[class='signIn'] ul li a")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#email")).sendKeys("nasiqzaheem@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#password")).sendKeys("98058312@");
		Thread.sleep(10000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();*/
		Thread.sleep(20000);
        driver.findElement(By.cssSelector("img[alt='User']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[normalize-space()='My Profile']")).click();
        Thread.sleep(3000);
       driver.findElement(By.cssSelector("a[class$='btn-warning']")).click();
	   Thread.sleep(3000);
	   driver.findElement(By.cssSelector("input[name='current_password']")).sendKeys("51214@");
       Thread.sleep(3000);
	   driver.findElement(By.cssSelector("input[name='password']")).sendKeys("5121472@");
	   Thread.sleep(3000);
	   driver.findElement(By.cssSelector("input[name='password_confirmation']")).sendKeys("5121472@");
       Thread.sleep(3000);
	   driver.findElement(By.cssSelector("button[class$='btn-sign-in']")).click();
        Thread.sleep(3000);
		driver.close();
		
	}
	@Test(priority=2 , description ="Verify that user can not change password when current password and new password are same")
	public void Test2()  throws IOException, InterruptedException {
		launchPTNew();
		Thread.sleep(20000);
		driver.findElement(By.cssSelector("img[alt='User']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[normalize-space()='My Profile']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a[class$='btn-warning']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[name='current_password']")).sendKeys("5121472@");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("5121472@");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[name='password_confirmation']")).sendKeys("5121472@");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[class$='btn-sign-in']")).click();
		Thread.sleep(3000);
		String Alert =driver.findElement(By.cssSelector("div[role='alert']")).getText();
		Assert.assertEquals(Alert , "Validation Error: Your new password can not be same as any of your recent passwords. Please choose a new password.");

		driver.close();

	}

	@Test(priority=3 , description ="Verify that user can not change password when new password and confirm password is different")
	public void Test3()  throws IOException, InterruptedException {
		launchPTNew();
		Thread.sleep(20000);
		driver.findElement(By.cssSelector("img[alt='User']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[normalize-space()='My Profile']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a[class$='btn-warning']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[name='current_password']")).sendKeys("5121472@");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("909012@");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[name='password_confirmation']")).sendKeys("909012#");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[class$='btn-sign-in']")).click();
		Thread.sleep(3000);
		String Alert =driver.findElement(By.cssSelector("div[role='alert']")).getText();
		Assert.assertEquals(Alert , "Validation Error: The password confirmation and password must match.");

		driver.close();

	}

	@Test(priority=4 , description ="Left New password field empty")
	public void Test4()  throws IOException, InterruptedException {
		launchPTNew();
		Thread.sleep(20000);
		driver.findElement(By.cssSelector("img[alt='User']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[normalize-space()='My Profile']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a[class$='btn-warning']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[name='current_password']")).sendKeys("5121472@");
		Thread.sleep(3000);
		/*driver.findElement(By.cssSelector("input[name='password']")).sendKeys("51272@");
		Thread.sleep(3000);*/
		driver.findElement(By.cssSelector("input[name='password_confirmation']")).sendKeys("51214#");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[class$='btn-sign-in']")).click();
		Thread.sleep(3000);
		String Alert =driver.findElement(By.cssSelector("div[role='alert']")).getText();
		driver.close();

	}

	@Test(priority=5 , description ="Left New password field empty")
	public void Test5()  throws IOException, InterruptedException {
		launchPTNew();
		Thread.sleep(20000);
		driver.findElement(By.cssSelector("img[alt='User']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[normalize-space()='My Profile']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a[class$='btn-warning']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[name='current_password']")).sendKeys("5121472@");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("03182430572");
		Thread.sleep(3000);
		/*driver.findElement(By.cssSelector("input[name='password_confirmation']")).sendKeys("51214#");
		Thread.sleep(3000);*/
		driver.findElement(By.cssSelector("button[class$='btn-sign-in']")).click();
		Thread.sleep(3000);
		String Alert =driver.findElement(By.cssSelector("div[role='alert']")).getText();
		Assert.assertEquals(Alert , "Validation Error: The password confirmation and password must match.");
		driver.close();

	}
	@Test(priority=6, description ="Verify that user can not change password with invalid new password")
	public void Test6()  throws IOException, InterruptedException {
		launchPTNew();
		Thread.sleep(20000);
		driver.findElement(By.cssSelector("img[alt='User']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[normalize-space()='My Profile']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a[class$='btn-warning']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[name='current_password']")).sendKeys("03182430572");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("03456500972");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[name='password_confirmation']")).sendKeys("03456500972");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[class$='btn-sign-in']")).click();
		Thread.sleep(3000);
		String Alert =driver.findElement(By.cssSelector("div[role='alert']")).getText();
		Assert.assertEquals(Alert , "Validation Error: The password confirmation and password must match.");
		driver.close();

	}
	



}
