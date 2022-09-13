package driver;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverSingleton {

    private static ChromeDriver driver;

    private WebDriverSingleton() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    }


    public static ChromeDriver getInstance() {
        if (driver == null) {
            new WebDriverSingleton();
        }
        return driver;
    }
}