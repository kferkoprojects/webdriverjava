package one_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Test1KeyboardMouseInput {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "C:\\IntelljProjects\\webdriverjava\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/keypress");
        driver.manage().window().maximize();

        WebElement name = driver.findElement(By.id("name"));
        name.click();
        name.sendKeys("Kim Ferko");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement button = driver.findElement(By.id("button"));
        button.click();
        System.out.println();


    }
}
