package iScreenShotForWebElement;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class aDemo {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		/*
		 * We can take the screen-shot of a web element using getScreenshotAs() method
		 */
		
		/*
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get( "http://omayo.blogspot.com/");
        
        File srcScreenshot = driver.findElement(By.id("hbutton")).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(srcScreenshot, new File(System.getProperty("user.dir")+ "\\screenshots\\screenshot.png"));
        
        driver.quit();
		*/
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		Thread.sleep(2000);
		WebElement emailid = driver.findElement(By.id("input-email"));
		
		File sourceScreenShot = emailid.getScreenshotAs(OutputType.FILE);
		//For above line as shown in tooltip we give "OutputType.File" and it returns "File".
		
		File destinationScreenShotFile = new File("./target/emailAddressField.png");
		//For above line we give the path where we have to store the screenshot.
		// .-> dot refer's to project location and after that we give anyfolder where to store that pic.
		
		FileUtils.copyFile(sourceScreenShot, destinationScreenShotFile);
		//For above line we have to store the capture picture in one location
		
		driver.close();
	}

}
