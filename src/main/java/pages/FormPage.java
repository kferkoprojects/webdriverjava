package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.testng.Assert.assertEquals;

public class FormPage {

    public static void submitForm(WebDriver driver){
        driver.findElement(By.id("first-name")).sendKeys("John");
        driver.findElement(By.id("first-name")).sendKeys("Doe");
        driver.findElement(By.id("first-name")).sendKeys("QA");
        driver.findElement(By.id("radio-button-2")).click();
        driver.findElement(By.id("checkbox-2")).click();
        driver.findElement(By.cssSelector("option[value='1']"));
        driver.findElement(By.id("datepicker")).sendKeys("15/12/2021");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
    }
}
