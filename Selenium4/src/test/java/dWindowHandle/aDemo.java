package dWindowHandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class aDemo {

	public static void main(String[] args) throws InterruptedException {

		/*
		 * From Selenium 4, apart from just switching to new window or tab, we can also create a 
		   new window or new tab and then switch to them.
		   
		 * driver.switchTo().newWindow(WindowType.WINDOW)
		 * driver.switchTo().newWindow(WindowType.TAB)
		  
		 * We can open multiple applications at the same time, because of this feature. 
		 
		 */
		
		/*
		// Selenium - 3
		WebDriverManager.chromedriver().setup();
        
        WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("http://omayo.blogspot.com/");
        
         //Write code here
        String firstWindow = driver.getWindowHandle();
        
         driver.findElement(By.linkText("Open a popup window")).click();
        
        Thread.sleep(3000);
        
        Set<String> windows = driver.getWindowHandles();
        
        Iterator<String> itr = windows.iterator();
        
         while(itr.hasNext()) {
               
               String window = itr.next();
               
                driver.switchTo().window(window);
               
                if(driver.getTitle().equals("Basic Web Page Title")) {
                      driver.close();
               }
               
        }
        
        
        Thread.sleep(3000);
        
         driver.switchTo().window(firstWindow);
        
         driver.findElement(By.name("q")).sendKeys("Arun");
		*/
		
		
		// Selenium-4
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialsninja.com/demo");
		
		// Created a new "TAB" and directly switch to that "TAB"
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://omayo.blogspot.com/");
		
		// Created a new "WINDOW" and directly switch to that "WINDOW"
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.google.com");
		
		
	}

}
