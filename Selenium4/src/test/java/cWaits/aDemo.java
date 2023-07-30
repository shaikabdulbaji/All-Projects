package cWaits;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

import io.github.bonigarcia.wdm.WebDriverManager;

public class aDemo {

	public static void main(String[] args) {

		/*
		 * In Selenium 4, the way we represent the time for Implicit Wait, WebDriverWait and 
		   FluentWait got changed.
		 * We have to use Duration.ofSeconds(x) going a head.
		 */
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Selenium 3 "It work in selenium3 but it was depricated in selenium4"
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//WebDriverWait wait = new WebDriverWait(driver, 5);
		/*
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				  .withTimeout(30, SECONDS)
				  .pollingEvery(5, SECONDS)
				  .ignoring(NoSuchElementException.class);

				WebElement foo = wait.until(new Function<WedDriver, WebElement>(){
				  public WebElement apply(WebDriver driver) {	
				  return driver.findElement(By.id("foo"));
				  }
				});
		*/		
				
		
		//Selenium 4
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		Wait<WebDriver> wa = new FluentWait<WebDriver>(driver)
				  .withTimeout(Duration.ofSeconds(30))
				  .pollingEvery(Duration.ofSeconds(5))
				  .ignoring(NoSuchElementException.class);

		WebElement foo = wa.until(new Function<WebDriver, WebElement>(){
			  public WebElement apply(WebDriver driver) {	
			  return driver.findElement(By.id("foo"));
			  }
			});
		
		driver.get("https://www.google.com");
		
		
	}

}
