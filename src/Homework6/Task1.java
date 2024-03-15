package Homework6;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.BaseClass;

public class Task1 extends BaseClass{
	
	
	public static void main(String[] args)  throws InterruptedException {
		
		setUp();
		
		
		
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		
	WebElement element=	driver.findElement(By.cssSelector("div[aria-label='Which country are you planning to join the bootcamp from?']"));
	element.click();
	Thread.sleep(2999);
	driver.findElement(By.xpath("//button[contains(@id,'United States')]")).click();
	Thread.sleep(2999);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(4000);
		
	//String a = driver.findElement(By.xpath("//h2[contains(text(),'Select a Date & Time')]")).getText();
	String a = driver.findElement(By.xpath("//h2[text()='Select a Date & Time']")).getText();
		System.out.println(a);
		Thread.sleep(2000);
		
		//driver.findElement(By.cssSelector("div[class='u1xbh6v5 cuma89m']")).click();
		
		Thread.sleep(5000);
		
		tearDown();
	}

}
//burak
