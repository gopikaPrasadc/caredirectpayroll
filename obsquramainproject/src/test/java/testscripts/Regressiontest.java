package testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Homepage;
import pages.Login;

public class Regressiontest extends TestHelper {

	  @Test
	  public void verifyWrongLoginDetails()   { 
		  	Login login= new Login(driver);
	       	login.login("carol", "1q2w3e4");
		    Homepage homepage=new Homepage(driver);
		    Assert.assertEquals(login.getWrongLoginError(), "Incorrect username or password.");
		    }
	  
	  
		@Test
	   public void verifyNoLoginForIncorrectUsernameandCorrectPassword() {
		   Login login= new Login(driver);
	      	login.login("caro","1q2w3e4r");
		    Homepage homepage=new Homepage(driver);
		    Assert.assertEquals(login.getWrongLoginError(), "Incorrect username or password.");
	   }
		
		@Test
		public void verifyNoLoginForCorrectUsernameandInCorrectPassword() {
			   Login login= new Login(driver);
		      	login.login("carol","1q2w3e4");
			    Homepage homepage=new Homepage(driver);
			    Assert.assertEquals(login.getWrongLoginError(), "Incorrect username or password.");
		   }
		
	  @Test 
	  public void verifyNullLoginErrorisDisplayed()  {
		  	Login login= new Login(driver);
	       	login.login("","");
	       	Assert.assertEquals(login.getLabelEmptyUserField(), "Username cannot be blank.");
	       	login.clickPasswordTxtBox();
	  	    Assert.assertEquals(login.getLabelEmptyPwdField(),"Password cannot be blank.");    
	  }

	  @Test
	   public void correctLogin()   {   
		  
		  	Login login= new Login(driver);
	       	login.login("carol","1q2w3e4r");
		    Homepage homepage=new Homepage(driver);
		    Assert.assertEquals(homepage.getHomePageWelcomeMsg(), "logged in");
		    }
}
