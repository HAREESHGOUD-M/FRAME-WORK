package com.hrms.lib;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.openqa.selenium.By;

public class General extends Global {
	
	public void openapplication() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\HP\\Desktop\\SURESH SELENIUM\\geckodriver.exe");
		driver=new FirefoxDriver();
	driver.navigate().to(url);
	Reporter.log("APPLICATION IS OPEN");
	}
	public void loginintoapplication()throws Exception {
		driver.findElement(By.name(loginname)).sendKeys(un);
		driver.findElement(By.name(password)).sendKeys(pw);
		driver.findElement(By.name(loginbutton)).click();
		Thread.sleep(3000);
		
		System.out.println("APPLICATION LOGIN COMPLETED");
		Reporter.log("APPLICATION LOGIN");
	
	}
	
	
	
public void logoutintoaplication() throws Exception {
	driver.findElement(By.linkText(logoutlink)).click();
	
	
	Thread.sleep(3000);
	System.out.println("ALLICATION LOGOUT COMPLETED");
	Reporter.log("APPLICATION LOGOUT");
	driver.close();
}
}
