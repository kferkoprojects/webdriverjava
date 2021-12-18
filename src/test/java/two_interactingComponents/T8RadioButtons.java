package two_interactingComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class T8RadioButtons {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "C:\\IntelljProjects\\webdriverjava\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/radiobutton");
        driver.manage().window().maximize();
        WebElement radioButton1 = driver.findElement(By.id("radio-button-1"));
        radioButton1.click();

       WebElement radioButton2 = driver.findElement(By.cssSelector("input[value='option2']"));
       radioButton2.click();

        WebElement radioButton3 = driver.findElement(By.xpath("html/body/div/div[3]/input"));
        radioButton3.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.quit();
    }
}

