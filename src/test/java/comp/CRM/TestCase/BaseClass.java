package comp.CRM.TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import comp.CRM.Pages.HomePage;

public class BaseClass {
	
public WebDriver driver;

@BeforeTest
public void setup()
{
	driver = new ChromeDriver();
	driver.get("https:automationplayground.com/crm/");
	
	hp =new HomePage();
}
}
