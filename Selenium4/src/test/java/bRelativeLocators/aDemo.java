package bRelativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class aDemo {

	public static void main(String[] args) {

		/*
		 * Practical Demonstration of Relative Locators
				below - Login page of TutorialsNinja.com/demo
				toRightOf - Search button beside Search Text Field
				below and toLeftOf - Submit button (Get Text)
				toRightOf and toLeftOf - Login button (Get Text)
				below - compendium dev link
				below and above - compendium and theautomationtester
				near - Search button (Click)
		 */
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		/*
		// Using "Below" Relative Locator
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.xpath("(//a[text()='Login'])[1]")).click();
		
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("amotooricap1@gmail.com");
		WebElement passfield = driver.findElement(By.xpath("//input[@id='input-password']"));
		passfield.sendKeys("12345");
		driver.findElement(RelativeLocator.with(By.tagName("input")).below(passfield)).click();
		*/
		
		/*
		// Using "toRightOf" Relative Locator
		driver.get("https://omayo.blogspot.com");
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("ab");
		driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(searchbox)).click();
		*/
		
		/*
		// Using "toLeftOf" Relative Locator
		driver.get("https://omayo.blogspot.com");
		WebElement searchbox = driver.findElement(By.xpath("//button[text()='Login']"));
		searchbox.click();
		String text = driver.findElement(RelativeLocator.with(By.tagName("button")).toLeftOf(searchbox).below(By.tagName("h2"))).getText();
		System.out.println(text);
		*/
		
		/*
		// Using "above" Relative Locator
		driver.get("https://omayo.blogspot.com");
		WebElement searchbox = driver.findElement(By.xpath("//button[text()='Login']"));
		searchbox.click();
		String text = driver.findElement(RelativeLocator.with(By.tagName("h2")).above(searchbox)).getText();
		System.out.println(text);
		*/
		
		/*
		// Using "near" Relative Locator, it will work near 50pixcel
		driver.get("https://omayo.blogspot.com");
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("ab"); 
		driver.findElement(RelativeLocator.with(By.className("gsc-search-button")).near(searchbox)).click();
		//driver.findElement(RelativeLocator.with(By.className("gsc-search-button")).near(searchbox, 100)).click();
		*/
	}
	

}
