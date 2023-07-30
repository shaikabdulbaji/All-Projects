package mInsureSites;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.security.Security;

import io.github.bonigarcia.wdm.WebDriverManager;

public class aDemo {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        DevTools devtools = driver.getDevTools();
        devtools.createSession();
        devtools.send(Security.enable());
        devtools.send(Security.setIgnoreCertificateErrors(true));
        
        driver.get("https://expired.badssl.com/");
		
		
	}

}
