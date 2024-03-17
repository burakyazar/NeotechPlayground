package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	public static WebDriver driver;

	public static void setUp() throws InterruptedException {
		ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);
		String browser = ConfigsReader.getProperty("browser");

		switch (browser.toLowerCase()) {
		case "chrome": 
			driver = new ChromeDriver();
			break;
		
		case "firefox": 
			driver = new FirefoxDriver();
			break;
		
		default:
			driver = new ChromeDriver();
			break;
		}

		Thread.sleep(2000);
		//driver.manage().window().setPosition(new Point(100, 100));
		driver.manage().window().maximize();
		String website = ConfigsReader.getProperty("url");
		driver.get(website);
	}

	
	public static void setUp(String url) throws InterruptedException 
	{
		ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);
		String browser = ConfigsReader.getProperty("browser");

		switch (browser.toLowerCase()) {
		case "chrome": 
			driver = new ChromeDriver();
			break;
		
		case "firefox": 
			driver = new FirefoxDriver();
			break;
		
		default:
			driver = new ChromeDriver();
			break;
		}

		Thread.sleep(2000);
		//driver.manage().window().setPosition(new Point(100, 100));
		driver.manage().window().maximize();
		
		driver.get(url);
	}
	public static void tearDown() {

		if (driver != null) {
			driver.quit();
		}
	}

}
