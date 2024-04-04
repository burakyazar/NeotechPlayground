package SeleniumHomework15;

import java.security.PublicKey;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.BaseClass;

public class AdvancedXpathLocators extends BaseClass{
	
	public AdvancedXpathLocators(){
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy (xpath="//main//descendant::nav//child::a[3]")
	public WebElement about;
	
	
	@FindBy (xpath = "//a[text()='Contact us']//preceding-sibling::div[1]/parent::div//descendant::div/../child::a")
	public WebElement contact;
	
	
	By contact1 = By.xpath("//a[text()='Contact us']//preceding-sibling::div[1]/parent::div//descendant::div/../child::a");
	
	
	By instrucatorName = By.xpath("//h4");
	
	By insturactorTitle = By.xpath("//div[@class='text-style-mono text-size-small margin-bottom']");
	
	
	

}
