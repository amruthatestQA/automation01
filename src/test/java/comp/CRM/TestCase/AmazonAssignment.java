package comp.CRM.TestCase;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class AmazonAssignment {
	
	WebDriver driver;
	@Parameters({"bname"})
	@Test
	public void browserTest(String bname) throws MalformedURLException, InterruptedException, URISyntaxException
	{
		if(bname.equalsIgnoreCase("chrome"))
		{
			ChromeOptions options= new ChromeOptions();
			URL url = new URI("http://localhost:4444").toURL();
			driver=new RemoteWebDriver(url, options);
			System.out.println("connection established with chrome browser");
		}
		if(bname.equalsIgnoreCase("firefox"))
		{
			FirefoxOptions options=new FirefoxOptions();
			URL url = new URI("http://localhost:4444").toURL();
			driver=new RemoteWebDriver(url, options);
			System.out.println("connection established between firefox");
		}
		if(bname.equalsIgnoreCase("edge"))
		{
			EdgeOptions options=new EdgeOptions();
			URL url = new URI("http://localhost:4444").toURL();
			driver=new RemoteWebDriver(url, options);
			System.out.println("connection established between edge");
		}
		Thread.sleep(5000);
		driver.get("https://www.amazon.in");
		Thread.sleep(3000);
		System.out.println("Application executing parallely");
		driver.quit();
	}

}
