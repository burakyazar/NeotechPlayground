package SeleniumHomework15;

import java.awt.Desktop.Action;

import org.checkerframework.common.reflection.qual.NewInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.BaseClass;
import utils.CommonMethods;

public class AdvancedXpath extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		setUp("https://www.neotechacademy.com/about");
		
		
		
		AdvancedXpathLocators aboutSection = new AdvancedXpathLocators();
		wait(5);
	

	
	 
		

		JavascriptExecutor js = (JavascriptExecutor) driver;
		  for (int i = 0; i < 35; i++) {
	            js.executeScript("window.scrollBy(0, 250)");
	            try {
	                Thread.sleep(500); // Her kaydırma arasında 0.5 saniye bekleyin
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
				
		wait(3);		
		
;	By locator = By.xpath("//div[@id='w-node-_57a141b9-5456-ba95-9b0b-6c61a4bbe431-7535a5a6']/p");		

	getTexts(locator);

		
		tearDown();
		
		
		
	}
	
	
	
	
}
