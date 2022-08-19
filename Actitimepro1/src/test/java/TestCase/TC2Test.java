package TestCase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.ActitimePro.generic.BaseTest;

public class TC2Test  extends BaseTest {
@Test
public void TC2()
{
driver.findElement(By.xpath("(//div[text()='Calls'])[1]")).click();
}
}
