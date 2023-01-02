
package seleniumCodind02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {
	//Launch chrome browser
	        WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();

			//Maximizes browser
			driver.manage().window().maximize();

			//open url
			driver.get("http://www.ebay.in/");
			
			WebElement element = driver.findElement(By.linkText("Shipping & Payments"));
			
			Actions act = new Actions(driver);
			
			act.moveToElement(element).perform();//moveToElement() for mouse over action
			
			

		
	}


}
