package seleniumCodind02;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadAutoITClass {

	public static void main(String[] args) {
		
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

        try {
            Runtime.getRuntime().exec("C://Users//prach//Desktop//Autoit//FileUpload.exe" + " " + "C:\Users\prach\Desktop\Resume.txt");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }



	}


