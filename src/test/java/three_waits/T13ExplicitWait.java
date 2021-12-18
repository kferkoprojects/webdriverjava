package three_waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class T13ExplicitWait {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "C:\\IntelljProjects\\webdriverjava\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/autocomplete");
        driver.manage().window().maximize();

        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement automcomplete = driver.findElement(By.id("autocomplete"));
        automcomplete.sendKeys("155 Park Blvd, Palo Alto, CA");

        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement autocompleteResult = wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.className("pac-item")));
        autocompleteResult.click();

        WebElement okButton = driver.findElement(By.xpath("//button[@class='dismissButton']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(okButton).build().perform();

    }
}

