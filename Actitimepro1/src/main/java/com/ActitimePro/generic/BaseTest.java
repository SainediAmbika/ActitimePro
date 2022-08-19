package com.ActitimePro.generic; 

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ActitimePro.Utility.DataFetch;

public class BaseTest implements Constant{
	DataFetch f=new DataFetch();
	public static WebDriver driver;
	@BeforeClass
	public void openBrowser() throws Throwable
	{
		System.setProperty(chromeKey, chromePath);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(f.propertiesFetch(propPath, "url"));
			}
	@BeforeMethod
	public void Login() throws Throwable
	{
		driver.findElement(By.id ("username")).sendKeys(f.propertiesFetch(propPath, "username"),Keys.TAB,f.propertiesFetch(propPath, "password"),Keys.ENTER);
		
	}
	@Test
	public void tc1()
	{
		driver.findElement(By.id("taskSearchControl_field")).sendKeys("Data");
	}
	@AfterMethod
	public void logout()
	{
		driver.findElement(By.id("logoutLink")).click();
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}
}


