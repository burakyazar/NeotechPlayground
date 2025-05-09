package SeleniumHomework12;

import org.openqa.selenium.By;

import utils.CommonMethods;

public class Task1 extends CommonMethods {
	
//	Homework 1:
//		Open chrome browser
//		Go to https://demo.guru99.com/test/drag_drop.html
//		Drag the following blocks in different ways
//		Drag BANK to DEBIT SIDE
//		Drag SALES to CREDIT SIDE
//		Drag 5000 to DEBIT SIDE
//		Drag 5000 to CREDIT SIDE
//		Close the browser
	
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp("https://demo.guru99.com/test/drag_drop.html");
		
		
		
		wait(2);
		
		
		String a = driver.findElement(By.id("fourth")).getText();		
		System.out.println(a);
		
		
		
		
		
		
		tearDown();
		
	}

}
