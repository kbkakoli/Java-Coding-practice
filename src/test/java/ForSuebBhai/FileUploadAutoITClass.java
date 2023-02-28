package ForSuebBhai;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadAutoITClass {
// please watch video of (https://www.youtube.com/watch?v=WKPFqSlpLBw&t=911s)
	public static void main(String[] args) {
		// An autoIT automation script can be converted into a compressed standalone executable file
		//
		//Launch chrome  browser
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //maximise browser
        driver.manage().window().maximize();

        //open url
        driver.get("https://the-internet.herokuapp.com/upload");

        //find choose file web element
        WebElement button= driver.findElement(By.id("file-upload"));

        Actions act = new Actions(driver);
        act.moveToElement(button).click().perform();
        // copy the path of the exe file  and inject to the selenium code.
        //and copy of  path of file upload .
        try {
            Runtime.getRuntime().exec("C://Users//prach//Desktop//Autoit//FileUpload.exe" + " " + "C:\\Users\\prach\\Desktop\\Resume.txt");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }



	}


