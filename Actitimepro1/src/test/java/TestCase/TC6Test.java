package TestCase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.ActitimePro.generic.BaseTest;

public class TC6Test extends BaseTest {
@Test
public void TC6()
{
	driver.findElement(By.id("popup_menu_settings")).click();
}
}

