package seleniumCodind02;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Stopwatch;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {

	public static void main(String[] args) {
		//Launch chrome browser
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //maximise browser
        driver.manage().window().maximize();

        //open url
        driver.get("http://www.ebay.in");

        //explicit wait of 10 seconds

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));



        Stopwatch watch = null;

        try {
            watch = Stopwatch.createStarted();
            //find webelement "START SELLING"
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("xyz")));
            element.click();
            //driver.findElement(By.linkText("START SELLING")).click();
        }
        catch(Exception e)
        {
            watch.stop();
            System.out.println(e);
            System.out.println(watch.elapsed(TimeUnit.SECONDS) + " seconds");
        }
    }


	}


