package seleniumCodind02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImageLinkClass {

	public static void main(String[] args) {
		 //Launch chrome browser
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //maximise browser
        driver.manage().window().maximize();

        //open url
        driver.get("https://www.opencart.com/index.php?route=cms/demo");

        //find web element image link open cart
        driver.findElement(By.xpath("//img[@title='OpenCart - Demo']")).click();

        //verify title of the current page with expected home page title
        if(driver.getTitle().equals("OpenCart - Open Source Shopping Cart Solution"))
        {
            System.out.println("Test passed");
        }
        else
        {
            System.out.println("Test failed");
        }

        //browser close
        driver.close();

    }


	}


