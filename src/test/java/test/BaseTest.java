package test;

import driver.WebDriverSingleton;
import org.junit.jupiter.api.AfterAll;
import org.openqa.selenium.WebDriver;

public class BaseTest {

    static WebDriver driver = WebDriverSingleton.getInstance();

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }
}