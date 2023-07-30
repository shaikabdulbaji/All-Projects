package jScrrenshotForFullPage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.HasFullPageScreenshot;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class aDemo {

	public static void main(String[] args) throws IOException {

		/*
		 * We can take the full page screenshot in Firefox Browser using getFullPageScreenshotAs() 
		   command.
		  
		 * FileUtils and FileHandler both are same both do same functionality.
		 * FileUtils - It is from "Commons.io"
		 * FileHandler - It is from "sSelenium"
		 */
		
		/*
		// It works for FirefoxDriver but it shows exception for ChromeDriver
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		
		File sourceScreenShot = ((FirefoxDriver)driver).getFullPageScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(sourceScreenShot, new File("./target/getfullscreenshot.png"));
		*/
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		
		File sourceScreenShot = ((HasFullPageScreenshot)driver).getFullPageScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(sourceScreenShot, new File("./target/getfullscreenshot.png"));
		
		/*
		// While we are using "getFullPageScreenshotAs" with ChromeDriver it shows "ClassCastexception"
		class org.openqa.selenium.chrome.ChromeDriver cannot be cast to class 
		org.openqa.selenium.firefox.HasFullPageScreenshot (org.openqa.selenium.chrome.ChromeDriver and 
		org.openqa.selenium.firefox.HasFullPageScreenshot are in unnamed module of loader 'app')
		*/
	}

}
