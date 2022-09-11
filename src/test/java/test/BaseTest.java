package test;

import driver.WebDriverSingleton;
import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.WebDriver;

public class BaseTest {

    WebDriver driver = WebDriverSingleton.getInstance();

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}