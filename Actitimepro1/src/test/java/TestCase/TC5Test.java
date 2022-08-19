package TestCase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.ActitimePro.generic.BaseTest;

public class TC5Test extends BaseTest {
@Test
public void TC5()
{
	driver.findElement(By.id("container_users")).click();
}
}
