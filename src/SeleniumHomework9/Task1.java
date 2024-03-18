package SeleniumHomework9;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v120.audits.model.HeavyAdIssueDetails;

import utils.BaseClass;

public class Task1 extends BaseClass{
	
	
//	1) Open chrome browser
//	2) Go to "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
//	3) Login to the application
//	4) Verify customer "Susan McLaren" is present in the table
//	5) Click on customer details
//	6) Update customers last name and credit card info
//	7) Verify updated customers name and credit card number is displayed in table
//	8) Close browser

	public static void main(String[] args) throws InterruptedException {
		
		
		setUp("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		Thread.sleep(3900);
		
		String pathTableString= "//table[@class='SampleTable']";
		String columnPathString="//table[@class='SampleTable']/tbody/tr";
		String rowPathString="//table[@class='SampleTable']/tbody/tr/th";
		
		List<WebElement> elements=driver.findElements(By.xpath(pathTableString));
		List<WebElement> column=driver.findElements(By.xpath(columnPathString));
		List<WebElement> row=driver.findElements(By.xpath(rowPathString));
		System.out.println(column.size());
		System.out.println(row.size());
		int count =0;
		//Verify customer
		for(int i =2; i<=column.size(); i++) {
		String namePathString="//table[@class='SampleTable']/tbody/tr["+i+"]/td[2]";
		if (driver.findElement(By.xpath(namePathString)).getText().contains("Susan McLaren")) 
		{
			System.out.println("The name is on the list.");
			
			String editPathString="//table[@class='SampleTable']/tbody/tr["+i+"]/td[13]";
			String creditCardNumberPathString ="//table[@class='SampleTable']/tbody/tr["+i+"]/td[13]";
			driver.findElement(By.xpath(editPathString)).click();
			driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).clear();
			driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).sendKeys("Susan Yazar");
			driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")).clear();
			driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")).sendKeys("1234567865434");
			driver.findElement(By.id("ctl00_MainContent_fmwOrder_UpdateButton")).click();
			
			String updatedNameString=driver.findElement(By.xpath(namePathString)).getText();
			System.out.println("Updated Name : " + updatedNameString);
			Thread.sleep(5000);
			String updatedCreditCardNumberString = driver.findElement(By.xpath(creditCardNumberPathString)).getText();
			
			System.out.println(driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr["+i+"]/td[11]")).getText());

			
			
		}else{
			count++;
		}	
		
		}
			if(count==column.size()-1){
			
			System.out.println("The name is not on the list.");
		}
		
		tearDown();

	}

}
