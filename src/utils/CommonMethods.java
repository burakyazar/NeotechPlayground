package utils;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods extends BaseClass{

	
	/**
	 * This method will find the field and will put the text that we put on the parameter.
	 * @param element
	 * @param text
	 */
	
	public static void sendText(WebElement element, String text) 
		{
			element.clear();
			element.sendKeys(text);
		}
	/**
	 * This method find the button or place and click on it. 
	 * @param element
	 */
	
	public static void click(WebElement element)
		{
			element.click();
		}
	
	
	
	public static WebElement waitForElementVisibility(By locator) 
		{
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.EXPLICIT_WAIT_TIME));
			return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		}

	public static void wait(int seconds)
		{
			try {
				Thread.sleep(seconds*1000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	
	public static void getTexts(By locator)
		{
			List<WebElement> elements = driver.findElements(locator);
			for(WebElement element:elements)
				{
					System.out.println("Text : " + element.getText());
					System.out.println();
				}
		}
}
