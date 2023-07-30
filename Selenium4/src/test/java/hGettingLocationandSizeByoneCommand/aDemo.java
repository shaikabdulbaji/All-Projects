package hGettingLocationandSizeByoneCommand;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class aDemo {
	
	public static void main(String[] args) {
		
		/*
		 * getRect() = getLocation() + getSize()
			In Selenium 4, we have all the getRect(), getLocation() and getSize() commands
			r = element.getRect()
			r.getX()
			r.getY()
			r.getWidth()
			r.getHeight()
		 */
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		WebElement emailid = driver.findElement(By.id("input-email"));
		
		Rectangle rectangle = emailid.getRect();
		System.out.println(rectangle.getX());
		System.out.println(rectangle.getY());
		System.out.println(rectangle.getHeight());
		System.out.println(rectangle.getWidth());
		
		
		
	}

}
