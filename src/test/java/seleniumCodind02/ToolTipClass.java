package seleniumCodind02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolTipClass {

	public static void main(String[] args) {
		//Launch chrome browser
		        WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				
				//maximise browser
				driver.manage().window().maximize();
				
				//open url
				driver.get("https://testautomationpractice.blogspot.com/");
				
				
				//find web element age input box
				String actualTooltip = driver.findElement(By.xpath("//input[@id='age']")).getAttribute("title");
			
				String expectedTooltip = "We ask for your name only for statistical purposes.";
			
				if(actualTooltip.equals(expectedTooltip))
				{
					System.out.println("test passed");
				}
				else
				{
					System.out.println("test failed");
				}
			}

		

	}


