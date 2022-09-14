package desktop.fragments;

import abstractclasses.fragment.AbstractFragment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavigationBar extends AbstractFragment {

    WebDriver driver;

    @FindBy(xpath = "//div[@class='user-nav-wrap ']//i[@class='icon-order-status']")
    WebElement orderStatusIcon;

    @FindBy(xpath = "//div[@class='user-nav-wrap ']//i[@class='icon-order-status']")
    WebElement wishListIcon;

    @FindBy(xpath = "//div[@class='user-nav-wrap ']//i[@class='icon-user']")
    WebElement loginIcon;

    public NavigationBar(WebDriver driver) {
        super(driver);
    }


    public void openOrderStatusPage(){
        orderStatusIcon.click();
    }

    public void openWishListPage(){
        wishListIcon.click();
    }

    public void openLoginPage(){
        loginIcon.click();
    }

}
