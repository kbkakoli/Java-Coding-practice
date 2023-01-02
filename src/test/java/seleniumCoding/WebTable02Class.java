package seleniumCoding;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable02Class {

	public static void main(String[] args) {
		//Launch chrome browser
		        WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();

				//maximise browser
				driver.manage().window().maximize();

				//open url
				driver.get("https://testautomationpractice.blogspot.com/");

				//find total rows in webtable
				List <WebElement> rowList = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr"));

				System.out.println("rows:" + rowList.size());//total no. of rows


				//find total columns in webtable
				List <WebElement> columnList = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr[1]/th	"));

				System.out.println("column:" + columnList.size());

				for(int r =2;r<=rowList.size();r++)//row
				{
					for(int c=1;c<=columnList.size();c++)//column
					{
						String data = driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[" + r + "]/td[" + c + "]" )).getText();
						System.out.println(data);
					}
				}

			}

		

	}


