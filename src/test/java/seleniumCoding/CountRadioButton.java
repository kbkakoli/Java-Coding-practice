package seleniumCoding;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CountRadioButton {

	public static void main(String[] args) {
		//launch chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //maximize browser
        driver.manage().window().maximize();

        //open url https://udyamregistration.gov.in/Udyam_Login.aspx
        //driver.get("https://udyamregistration.gov.in/Udyam_Login.aspx%22);
        driver.get("https://www.calculator.net");
        //find radio button web elements on web page
        List <WebElement> radioButtonList = driver.findElements(By.xpath("//input[@type='radio']"));

        //print total no. of radio button in radio button list
        System.out.println("Total no. of radio button on web page:" + radioButtonList.size());

        //close current browser
        driver.close();
    }


	}


