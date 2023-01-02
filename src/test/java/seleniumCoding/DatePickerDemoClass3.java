package seleniumCoding;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePickerDemoClass3 {

	public static void main(String[] args) {
		 //31-Mar-2022;

        String expectedDay = "31";
        String expectedMonthYear = "March 2022";
        //String expectedYear = "2022";

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
            String calenderMonthYear = driver.findElement(By.xpath("//*[@id="root"]/div/div[2]/div[2]/div/div[1]/div[3]/div[2]/div[2]/div/div/div[2]/div[1]/div[1]/div")).getText();

            if(calenderMonthYear.equals(expectedMonthYear))
            {
                List <WebElement> daysList = driver.findElements(By.xpath("//p[@class='fswdate']"));

                for(WebElement e:daysList)
                {
                    String calenderDay = e.getText();
                    if(calenderDay.equals(expectedDay))
                    {
                        e.click();
                        driver.findElement(By.xpath("//span[@class='fswTrvldone']")).click();
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


