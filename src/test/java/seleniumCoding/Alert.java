package seleniumCoding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    //launch chrome browser
        System.setProperty("webdriver.chrome.driver", ".exe");

        WebDriver driver = new ChromeDriver();

        //maximize browser
        driver.manage().window().maximize();

        //open url
        driver.get("http://uitestpractice.com/Students/Switchto%22");

        //find alert button and perform click action
        //driver.findElement(By.xpath("//button[@id='alert']")).click();

    //    driver.findElement(By.xpath("//button[@id='confirm']")).click();


        //find prompt button and perform click action
        driver.findElement(By.xpath("//button[@id='prompt']")).click();

        //switch to alert window, enter name
        driver.switchTo().alert().sendKeys("Sudha");

        //accept alert
        driver.switchTo().alert().accept();//to ok alert




    }

	}


