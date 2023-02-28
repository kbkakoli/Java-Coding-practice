package ForSuebBhai;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePickerDemoClass3 {

	public static void main(String[] args) {
		 //28-February-2023;

        String expectedDay = "28";
        String expectedMonthYear = "Febryary 2023";
        //String expectedYear = "2023";

        //launch chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //maximise browser
        driver.manage().window().maximize();

        //open url
        driver.get("https://www.goibibo.com/");


        //find date picker webelement to perform click action
        WebElement datepicker = driver.findElement(By.xpath("[@id=\"root\"]/div[4]/div/div/div[1]/div[3]/div/p[1]"));
        //WebElement datepicker = driver.findElement(By.xpath("//span[@class='sc-ieecCq gToiRQ fswDownArrow']"));
        datepicker.click();

        while(true)
        {
            String calenderMonthYear = driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/div[3]/div")).getText();

            if(calenderMonthYear.equals(expectedMonthYear))
            {
                List <WebElement> daysList = driver.findElements(By.xpath("//p[@class='fswdate']"));

                for(WebElement e:daysList)
                {
                    String calenderDay = e.getText();
                    if(calenderDay.equals(expectedDay))
                    {
                        e.click();
                        driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/div[3]/div/p[1]/span")).click();
                        break;

                    }
                }

                break;
            }
            else
            {
                driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
            }
        }

    }


	}


