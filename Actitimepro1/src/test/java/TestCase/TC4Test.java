package TestCase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.ActitimePro.generic.BaseTest;

public class TC4Test extends BaseTest{
@Test
public void TC4()
{
	driver.findElement(By.id("container_tasks")).click();
	driver.findElement(By.cssSelector("div.title.ellipsis")).click();
	driver.findElement(By.cssSelector("div.item.createNewCustomer")).click();
	
}
}
