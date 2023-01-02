package seleniumCoding;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotClass {

	public static void main(String[] args) throws IOException {
		 //Launch chrome browser

		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //maximise browser
        driver.manage().window().maximize();

        //open url
        driver.get("http://uitestpractice.com");

        //capture full page screenshot 
        //        //step1: convert webdriver object to TakesScreenshot interface
        //        TakesScreenshot screenshot = ((TakesScreenshot)driver);
        //
        //        //step2: call getScreenshotAs method to create image file
        //
        //        File src = screenshot.getScreenshotAs(OutputType.FILE);
        //
        //        File dest = new File("C:\Users\prach\Desktop\DemoTestMavenProject\Test1\Screenshots\fullsPage.png");
        //
        //
        //        //step3: copy image file to destination
        //        FileUtils.copyFile(src, dest);

        //capture section of a web page
        //step1: convert webdriver object to TakesScreenshot interface
        //TakesScreenshot screenshot = ((TakesScreenshot)driver);
        WebElement section = driver.findElement(By.id("droppable"));

        //step2: call getScreenshotAs method to create image file
        File src = section.getScreenshotAs(OutputType.FILE);

        File dest = new File("C:/Users/total/eclipse-workspace/CodingPracticeFinal/Screenshots/doubleclickme.png");


        //step3: copy image file to destination
        FileUtils.copyFile(src, dest);


	}

}
