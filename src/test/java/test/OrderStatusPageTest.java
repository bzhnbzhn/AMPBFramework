package test;

import constants.User;
import desktop.fragments.NavigationBar;
import desktop.pages.HomePage;
import desktop.pages.OrderStatusPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderStatusPageTest extends BaseTest {

    NavigationBar navigationBar;
    OrderStatusPage orderStatusPage;

    @Test
    public void userShouldBeAbleToCheckHisOrderStatusAsGuestUser() {
        driver.get(HomePage.HOME_PAGE_LINK);
        navigationBar = new NavigationBar(driver);
        orderStatusPage = new OrderStatusPage(driver);
        navigationBar.openOrderStatusPage();
        orderStatusPage.getStatusOfUserOrder(User.COMPETED_ORDER_NUMBER, User.USER_HOW_MADE_ORDER_EMAIL);
        Assertions.assertTrue(orderStatusPage.getOrderNumber().contains(User.COMPETED_ORDER_NUMBER),
                "Order status was not verified");
    }
}
