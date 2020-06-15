package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageUtilities {
public static WebDriver driver;
public	static JavascriptExecutor js=(JavascriptExecutor)driver;
	
	public static WebElement isElementLoaded(WebDriver driver,WebElement elementToBeLoaded, int time) {
	    WebDriverWait wait = new WebDriverWait(driver, time);
	    WebElement element = wait.until(ExpectedConditions.visibilityOf(elementToBeLoaded));
	    return element;
	}

	public static  WebElement waitforelementtobeclickable(WebDriver driver,WebElement elementToBeLoaded, int time) {
	    WebDriverWait wait = new WebDriverWait(driver, time);
	    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elementToBeLoaded));
	    return element;
	}
	public static  void alertisPresent(WebDriver driver, int time) {
	    WebDriverWait wait = new WebDriverWait(driver, time);
	    wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public static  void waitForFrame(WebDriver driver,WebElement frametoswitch, int time) {
	    WebDriverWait wait = new WebDriverWait(driver, time);
	    wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frametoswitch));
	}
	
	public static  WebElement isElementVisible(WebDriver driver,WebElement elementtobeloaded, int time) {
	    WebDriverWait wait = new WebDriverWait(driver, time);
	    WebElement element=wait.until(ExpectedConditions.visibilityOf(elementtobeloaded));
	    return element;
	}
	
	public static  Boolean ElementValuePresent(WebDriver driver,WebElement elementtobeloaded, String txt,int time) {
	    WebDriverWait wait = new WebDriverWait(driver, time);
	    Boolean element=wait.until(ExpectedConditions.textToBePresentInElementValue(elementtobeloaded, txt));
	    return element;
	}
}