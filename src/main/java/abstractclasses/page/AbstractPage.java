package abstractclasses.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractPage {

    private String pageUrl;
    private String pageUrlPattern;
    public static WebDriver driver;

    public AbstractPage(WebDriver driver) {
        AbstractPage.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    public String getPageUrl() {
        return pageUrl;
    }

    public String setPageUrlPattern(String pageUrlPattern) {
        return this.pageUrlPattern = pageUrlPattern;
    }

    public String getPageUrlPattern() {
        return pageUrlPattern;
    }
}
