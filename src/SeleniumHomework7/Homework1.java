package SeleniumHomework7;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.BaseClass;

public class Homework1 extends BaseClass{

	
	static void click_on_click_here_link_text()
		{
		WebElement click_On_Click = driver.findElement(By.xpath("//a[contains(text(), 'Click Here')]"));
			if(click_On_Click != null)

					{
						click_On_Click.click();
						System.out.println("Step 1 is passed. (We are able to click on Click here text link)");
					}else {
						System.out.println("Step 1 is failed.");
					}
		}		
	
	static void check_how_many_browser_opened()
	{
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowList = new ArrayList<>(windowHandles);
		
		int size = windowHandles.size();
		System.out.println("Step 2 is passed. There is " + size +" browser opened.");
		
	}
	
	static void switch_to_second_window()
		{
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowList = new ArrayList<>(windowHandles);
		driver.switchTo().window(windowList.get(1));
		System.out.println("Step 3 is passed. Switched to the other window");
			}
	static void enter_your_id() 
		{
			driver.findElement(By.name("emailid")).sendKeys("burak@atlasdigitalpro.com");
			System.out.println("Step 4 is passed. Send the keys in to the email section.");
		}
	
	static void click_on_submit_button() 
		{
			WebElement submitButton = driver.findElement(By.name("btnLogin"));
			submitButton.click();
			System.out.println("Step 5. Clicked on submit button.");
		}
	
	static void print_credentials()
		{
		WebElement userIdElement = driver.findElement(By.xpath("//td[@class='accpage'][contains(text(),'User ID')]/following-sibling::td"));
		String userIdText = userIdElement.getText();
		System.out.println("User ID: " + userIdText);
		WebElement userPasswordElement = driver.findElement(By.xpath("//td[@class='accpage'][contains(text(),'Password')]/following-sibling::td"));
		String userPasswordText = userPasswordElement.getText();
		System.out.println("Password: " + userPasswordText);
		System.out.println("Step 6. Credentials are printed.");
		}
	
	static void close_the_child_window_and_switch_the_main_browser()
		{
		System.out.println("We are on the second browser and we close it now");
		System.out.println("Second browser ID : " + driver.getWindowHandle());
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowList = new ArrayList<>(windowHandles);
			driver.close();
			driver.switchTo().window(windowList.get(0));
			System.out.println("We switched to first browser." );
			System.out.println("First browser ID: " + driver.getWindowHandle());
		}

	public static void main(String[] args) throws InterruptedException {
//	1) Launch the browser and open the site "http://demo.guru99.com/popup.php"
//	2) Click on link "Click Here". When the user clicks on the "Click Here" link, new child window opens.
//	3) On the Child Window, Enter your email ID and submit.
//	4) Then Access Credentials will be Displayed on submitted page. You will see the child window is open in new tab.
//	5) Close the Child window on which credentials are displayed.Switch to the parent window.
//	6) Quit all browsers
		
		
		
		
		
		setUp();
		
		Thread.sleep(2000);
		System.out.println("First Driver code = " + driver.getWindowHandle());
		
		click_on_click_here_link_text();
		check_how_many_browser_opened();
		switch_to_second_window();
		System.out.println("Second Driver code = " + driver.getWindowHandle());
		
		enter_your_id();
		click_on_submit_button();
		print_credentials();
		close_the_child_window_and_switch_the_main_browser();
		Thread.sleep(5000);
		tearDown();
		
		
	}

}
