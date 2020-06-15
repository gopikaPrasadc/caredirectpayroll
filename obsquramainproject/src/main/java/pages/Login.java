package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtilities;

public class Login {

	public WebDriver driver;
	
	@FindBy(how=How.ID ,using="loginform-username")
	private static WebElement usertextbox;
	
	@FindBy(how=How.ID ,using="loginform-password")
	private static WebElement passwordtxtbox;
	
	@FindBy(xpath="//*[@id=\"login-form\"]/div[5]/button")
	private static WebElement loginbutton;
	
	@FindBy (xpath="//p[contains(text(),'Incorrect username or password.')]") 
	private static WebElement wrongloginlabel;
	
	@FindBy(xpath="//p[@class=contains(text(),'Password cannot be blank.')]")
	private static WebElement passwordlabel;
	
	
   	public  Login(WebDriver driver)
{
	this.driver=driver;
    PageFactory.initElements(driver, this);
}
   	
	

	public  void login(String username,String password){
		
		 usertextbox.sendKeys(username);
		 passwordtxtbox.sendKeys(password);
		 loginbutton.click();
		 	}

	public String getWrongLoginError() {
	PageUtilities.isElementLoaded(driver, wrongloginlabel, 2);
		return wrongloginlabel.getText();
	}

	public String getLabelEmptyUserField() {
		PageUtilities.isElementLoaded(driver, passwordlabel, 2);
		return passwordlabel.getText();
	}
	

	public void clickPasswordTxtBox() {
		passwordtxtbox.click();
	}

	public String getLabelEmptyPwdField() {
		PageUtilities.isElementLoaded(driver, passwordlabel, 2);
		return passwordlabel.getText();
		
	} 	
  	
}

