package comp.CRM.TestCase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

import org.testng.annotations.Test;

public class LoginPageTestCase extends BaseClass{
	
	@BeforeClass
	public void pageSetup()
	{
		hp.getStatusOfLink();
	}
  @Test
  public void validateLogin() {
	  String url = lp.doLogin("test@gmail.com","test123");
	  Assert.assertTrue(url.contains("customers"),"Test fail: login fail");
	  System.out.println("Test pass : Login pass");
  }
}
