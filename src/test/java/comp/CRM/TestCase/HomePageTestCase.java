package comp.CRM.TestCase;

import org.testng.annotations.Test;

import comp.CRM.Pages.HomePage;

public class HomePageTestCase {
  @Test(priority=1)
  public void verifyUrl() {
	  HomePage hp = new HomePage();
	  String actUrl = hp.getAppUrl();
	  Assert.assertTrue(actUrl.con)
  }
}
