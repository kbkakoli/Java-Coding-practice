package seleniumCodind02;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitDemoClass {

	public static void main(String[] args) {
		  //Launch chrome browser
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //maximise browser
        driver.manage().window().maximize();

        //open url
        driver.get("http://www.ebay.in");

        //fluent wait of 10 seconds

    //    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));

        Wait <WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .withMessage("This is custom message.")
                .ignoring(NoSuchElementException.class);

        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("START SELLING")));
        element.click();

//        Stopwatch watch = null;
//
//        try {
//            watch = Stopwatch.createStarted();
//            //find webelement "START SELLING"
//            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("xyz")));
//            element.click();
//            //driver.findElement(By.linkText("START SELLING")).click();
//        }
//        catch(Exception e)
//        {
//            watch.stop();
//            System.out.println(e);
//            System.out.println(watch.elapsed(TimeUnit.SECONDS) + " seconds");
//        }
    }


	}


