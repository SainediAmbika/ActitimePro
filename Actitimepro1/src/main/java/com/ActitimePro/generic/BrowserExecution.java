package com.ActitimePro.generic;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;

public class BrowserExecution extends BaseTest {
	@Parameters("browser")
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Browser");
		String str=s.next();
		if(str.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\ActitimePro\\src\\main\\resources\\Browser\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if (str.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\eclipse-workspace\\ActitimePro\\src\\main\\resources\\Browser\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else {
			System.out.println();
		}
		driver.get("https://demo.actitime.com/login.do");
	}
}
