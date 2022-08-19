package TestCase;

import org.openqa.selenium.By;

import org.testng.annotations.Test;

import com.ActitimePro.generic.BaseTest;

public class TC1Test extends BaseTest{
	@Test
	public void tc1()
	{
		driver.findElement(By.id("taskSearchControl_field")).sendKeys("Data");
	}	
}