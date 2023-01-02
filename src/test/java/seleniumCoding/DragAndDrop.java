package seleniumCoding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) {
		 //Launch chrome browser
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //Maximizes browser
        driver.manage().window().maximize();

        //open url
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        //find source and target web element

        WebElement source = driver.findElement(By.id("box6"));//rome
        WebElement target = driver.findElement(By.id("box106"));//Itlay

        Actions act = new Actions(driver);

        //dragAndDrop(sourceElemement, targetElement)
        act.dragAndDrop(source, target).perform();


    }

	}


