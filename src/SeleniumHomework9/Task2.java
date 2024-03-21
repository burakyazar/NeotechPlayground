package SeleniumHomework9;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.BaseClass;

public class Task2 extends BaseClass{
public static void main(String[] args) throws InterruptedException {
	
	
	
	setUp("https://amazon.com");
	
	
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 14 Case");
	
	driver.findElement(By.id("nav-search-submit-button")).click();
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	wait.until(ExpectedConditions.visibilityOfElementLocated
	(By.xpath("//span[contains(text(),'results for')]")));
	
	Thread.sleep(5000);
	 List<WebElement> elements = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
        
        // CSS Selector kullanarak:
        // List<WebElement> elements = driver.findElements(By.cssSelector("span.a-size-medium.a-color-base.a-text-normal"));

        // Span öğelerinin metin içeriğini alın ve yazdırın
        for (WebElement element : elements) {
            System.out.println(element.getText());
        }
        
        Thread.sleep(6000);
	
	////span[contains(@class, 'a-size-medium a-color-base a-text-normal')]
////span[contains(@class, 'a-size-medium a-color-base a-text-normal')]
	
	tearDown();
}
}
