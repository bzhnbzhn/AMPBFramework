package test;

import abstractclasses.fragment.NavigationBar;
import abstractclasses.page.HomePage;
import constants.User;
import driver.WebDriverSingleton;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class OrderStatusPage {

    NavigationBar navigationBar;
    abstractclasses.page.OrderStatusPage orderStatusPage;

    @Test
    public void userShouldBeAbleToCheckHisOrderStatusAsGuestUser() {
        WebDriver driver = WebDriverSingleton.getInstance();
        driver.get(HomePage.HOME_PAGE_LINK);
        navigationBar = new NavigationBar(driver);
        orderStatusPage = new abstractclasses.page.OrderStatusPage(driver);
        navigationBar.openOrderStatusPage();
        orderStatusPage.getStatusOfUserOrder(User.COMPETED_ORDER_NUMBER, User.USER_HOW_MADE_ORDER_EMAIL);
        Assertions.assertTrue(orderStatusPage.getOrderNumber().contains(User.COMPETED_ORDER_NUMBER),
                "Order status was not verified");
    }
}
