package one_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class T2AutoComplete {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\IntelljProjects\\webdriverjava\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/autocomplete");
        driver.manage().window().maximize();
        WebElement automcomplete = driver.findElement(By.id("autocomplete"));
        automcomplete.sendKeys("155 Park Blvd, Palo Alto, CA");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement autocompleteResult =driver.findElement(By.className("pac-item"));
        autocompleteResult.click();

        WebElement okButton = driver.findElement(By.xpath("//button[@class='dismissButton']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(okButton).build().perform();




        driver.quit();
    }
}