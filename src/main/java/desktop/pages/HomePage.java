package desktop.pages;

import abstractclasses.page.AbstractPage;
import org.openqa.selenium.WebDriver;

public class HomePage extends AbstractPage {

    public static final String HOME_PAGE_LINK = "https://www.bookdepository.com";

    public HomePage(WebDriver driver) {
        super(driver);
    }
}
