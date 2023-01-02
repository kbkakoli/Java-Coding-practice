package seleniumCoding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertClass {

	public static void main(String[] args) throws InterruptedException {
		  //launch chrome browser
		WebDriverManager.chromedriver().setup();
      //  System.setProperty("webdriver.chrome.driver", ".exe");

        WebDriver driver = new ChromeDriver();

        //maximize browser
        driver.manage().window().maximize();

        //open url
        driver.get("http://uitestpractice.com/Students/Switchto");
        Thread.sleep(3000);
        //find alert button and perform click action
        driver.findElement(By.xpath("//button[@id='alert']")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
      //driver.findElement(By.xpath("//button[@id='confirm']")).click();

        Thread.sleep(3000);
        //find prompt button and perform click action//need to review prompt Functionality.
        //driver.findElement(By.xpath("//button[@id='prompt']")).click();
        Thread.sleep(3000);
        //switch to alert window, enter name
        driver.switchTo().alert().sendKeys("Arvin");
        Thread.sleep(3000);
        //accept alert
        driver.switchTo().alert().accept();//to ok alert




    }

	}


