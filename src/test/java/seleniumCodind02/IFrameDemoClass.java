package seleniumCodind02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IFrameDemoClass {

	public static void main(String[] args) {

        //Launch chrome browser
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //maximise browser
        driver.manage().window().maximize();
        //open url
        driver.get("https://www.rediff.com");

        //switch to iframe moneyiframe
        driver.switchTo().frame("moneyiframe");

        //find web element & print value
        String nseindex = driver.findElement(By.id("nseindex")).getText();

        System.out.println(nseindex);

    }



	}


