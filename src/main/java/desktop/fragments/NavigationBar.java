package desktop.fragments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavigationBar {

    WebDriver driver;

    @FindBy(xpath = "//div[@class='user-nav-wrap ']//i[@class='icon-order-status']")
    WebElement orderStatusIcon;

    @FindBy(xpath = "//div[@class='user-nav-wrap ']//i[@class='icon-order-status']")
    WebElement wishListIcon;

    @FindBy(xpath = "//div[@class='user-nav-wrap ']//i[@class='icon-user']")
    WebElement loginIcon;

    public NavigationBar(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
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
