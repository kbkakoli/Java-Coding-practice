package seleniumCodind02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookToolKitClass {

	public static void main(String[] args) {
		   //Launch chrome browser
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //maximise browser
        driver.manage().window().maximize();

        //open url
        driver.get("https://www.facebook.com");

        //find sign up web element
        String actualtoolTip = driver.findElement(By.xpath("//a[@href='/reg/']")).getAttribute("title");
        String expectedToolTip = "Sign  for Facebook";

        if(actualtoolTip.equals(expectedToolTip))
        {
            System.out.println("test passed");
        }
        else
        {
            System.out.println("test failed");
        }

    }



	}


