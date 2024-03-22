package SelfPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class AmazonWithMethods extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		setUp("https://amazon.com");
		
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
		By resultPath = By.xpath("//span[contains(text(),'results for')]");
		By amazonTitles = By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']");
		
		
		sendText(searchBox, "Iphone 13Pro Case");
		click(searchButton);
		waitForElementVisibility((resultPath));
		wait(3);
		getTexts(amazonTitles);
		wait(3);
		tearDown();

	}

}
