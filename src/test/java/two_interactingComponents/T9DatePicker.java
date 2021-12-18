package two_interactingComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class T9DatePicker {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "C:\\IntelljProjects\\webdriverjava\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/datepicker");
        driver.manage().window().maximize();

        WebElement dateField = driver.findElement(By.id("datepicker"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        dateField.sendKeys("17/12/2021");
        dateField.sendKeys(Keys.RETURN);


        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.quit();
    }
}



