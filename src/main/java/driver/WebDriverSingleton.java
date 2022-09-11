package driver;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSingleton {

    private static ChromeDriver driver;

    private WebDriverSingleton() {

    }

    public static ChromeDriver getInstance() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver 3");
            driver = new ChromeDriver();
        }
        return driver;
    }
}