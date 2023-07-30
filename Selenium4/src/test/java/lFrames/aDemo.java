package lFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class aDemo {

	public static void main(String[] args) throws InterruptedException {

		/*
		 * We can directly switch back to the parent frame from its child frame
		 * Nested Frame - https://letcode.in/frame
		 */
		
		/*
		// Selenium-3
		// Switching to Frame
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://omayo.blogspot.com");
        
        WebElement requiredFrame = driver.findElement(By.id("navbar-iframe"));
        
        driver.switchTo().frame(requiredFrame);
        
        driver.findElement(By.name("q")).sendKeys("Alert");
        
        driver.findElement(By.id("b-query-icon")).click();
		*/
		
		/*
		 // Switching from Child frame to Paret frame
		 WebDriverManager.chromedriver().setup();
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
         
         driver.switchTo().frame("iframeResult");
         WebElement innerframe = driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
         driver.switchTo().frame(innerframe);
         
         System.out.println(driver.findElement(By.xpath("//h1")).getText());
         
         driver.switchTo().parentFrame();
         
         System.out.println(driver.findElement(By.xpath("//p")).getText());
         
         driver.close();
		 */
		
		 /*
		 // Switching from Child frame to Default Content
		 WebDriverManager.chromedriver().setup();
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
         
         driver.switchTo().frame("iframeResult");
         WebElement innerframe = driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
         driver.switchTo().frame(innerframe);
         
         System.out.println(driver.findElement(By.xpath("//h1")).getText());
         
         driver.switchTo().defaultContent();
         		
		 driver.close();
		 */
		
		// Selenium-4
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/frame");
		
		driver.switchTo().frame("firstFr");
		
		WebElement innerframe = driver.findElement(By.xpath("//iframe[@class='has-background-white']"));
		
		driver.switchTo().frame(innerframe);
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sk@gmail.com");
		
		driver.switchTo().parentFrame();
		Thread.sleep(3000);
		driver.findElement(By.name("fname")).sendKeys("shaik");
		
		driver.close();
		
	}

}
