package SeleniumHomework8;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.FluentWait;
import utils.BaseClass;

public class FluentWaitDemo extends BaseClass{

	

	public static void main(String[] args) throws InterruptedException {
		
		setUp("http://webdriveruniversity.com/Ajax-Loader/index.html");
		
		
		// its possible to combine both implicit and fluent waits.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		//WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
		 
	//	org.openqa.selenium.support.ui.FluentWait<WebDriver> wait = new org.openqa.selenium.support.ui.FluentWait<WebDriver>(driver);
	
	FluentWait wait = new FluentWait(driver);
	wait.withTimeout(Duration.ofSeconds(10));
	wait.pollingEvery(Duration.ofSeconds(1));
	wait.ignoring(NoSuchElementException.class);
	
		tearDown();
		
	}


}
