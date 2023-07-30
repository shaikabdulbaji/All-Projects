package gMinimizingWindow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class aDemo {

	public static void main(String[] args) {

		/*
		 * We can minimize the Browser Window using minimize() in Selenium 4
		 */
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().minimize();
		driver.get("https://www.tutorialsninja.com/demo");
		
		
	}

}
