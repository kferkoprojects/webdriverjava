package five_SauceLabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class SauceLabs {
    public static final String USERNAME = "YOUR_USERNAME";
    public static final String ACCESS_KEY = "YOUR_ACCESS_KEY";
    public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY +
            "ondemand.saucelabs.com80//wd/hub";

    public static void main(String[] args) throws Exception {
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform", "win 10");
        caps.setCapability("version", "70.00");

        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
        driver.get("https://formy-project.herokuapp.com/");
    }
}
