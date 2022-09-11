package test;

import abstractclasses.page.LoginPage;
import constants.User;
import driver.WebDriverSingleton;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;


public class LoginPageTest extends BaseTest {

    LoginPage loginPage;


    @Test
    void userShouldSingInWithValidCredentials() {
        WebDriver driver = WebDriverSingleton.getInstance();
        driver.get(LoginPage.LOGIN_PAGE_LINK);
        loginPage = new LoginPage(driver);
        loginPage.singIn(User.getUserWithValidCredentials());
        Assertions.assertEquals(LoginPage.LOGIN_SUCCESS_LINK, driver.getCurrentUrl());
    }

    @Test
    void passwordIncorrectMassageShouldAppearsWhenUserSingInWithNotValidPassword() {
        WebDriver driver = WebDriverSingleton.getInstance();
        driver.get(LoginPage.LOGIN_PAGE_LINK);
        loginPage = new LoginPage(driver);
        loginPage.singIn(User.getUserWithUnValidPassword());
        Assertions.assertEquals(LoginPage.PASSWORD_INCORRECT_MASSAGE, loginPage.getPasswordIncorrectMassage());
    }
}