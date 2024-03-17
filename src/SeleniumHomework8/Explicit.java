package SeleniumHomework8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.BaseClass;

public class Explicit extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		setUp("http://webdriveruniversity.com/Ajax-Loader/index.html");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("button1"))));
		
		
		WebElement span = driver.findElement(By.id("button1"));
		
		
		System.out.println("Span is visible : " + span.isDisplayed());
		
		System.out.println("The text on the button that we clicked on is :  " + span.getText());
		
		
		
		tearDown();
		
	}

}
