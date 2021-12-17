package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exePath = "./Driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://sales_qa.assistcard.com/ar");

	}

}
