package seleniumCoding;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CountHyperLinkClass {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

        //launch chrome browser
       
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        //launch web page https://www.calculator.net/
        driver.get("https://www.calculator.net");
        List <WebElement> linkElements = driver.findElements(By.tagName("a"));

        System.out.println("Total links on webpage:" + linkElements.size());

        for(WebElement el:linkElements)
        {
            System.out.println(el.getText());
        }
        driver.close();
	}

}
