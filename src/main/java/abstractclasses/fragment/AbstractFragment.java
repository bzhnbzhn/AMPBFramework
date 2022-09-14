package abstractclasses.fragment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractFragment {

    static WebDriver driver;

    public AbstractFragment(WebDriver driver) {
        AbstractFragment.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
