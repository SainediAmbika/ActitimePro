package TestCase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.ActitimePro.generic.BaseTest;

public class TC3Test extends BaseTest{
@Test
public void TC3 ()
{
	driver.findElement(By.id("(//div[text()='Calls'])[2]")).click();
}
}
