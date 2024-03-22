package SeleniumHomework10;

import org.openqa.selenium.By;

import utils.BaseClass;

public class AA extends BaseClass{

//	Open chrome browser
//	Go to https://www.aa.com/homePage.do
//	Enter From and To
//	Select departure as December 14 of 2024
//	Select arrival as December 22 of 2024
//	Click on search
//	Close browser
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		setUp("https://www.aa.com/homePage.do");
		
		driver.findElement(By.id("reservationFlightSearchForm.originAirport")).sendKeys("SEA");
		
		
		tearDown();
		
	}

}
