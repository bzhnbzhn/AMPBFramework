package test;

import constants.User;
import desktop.pages.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class LoginPageTest extends BaseTest {

    LoginPage loginPage;

    @BeforeEach
    public void openLoginPage() {
        driver.get(LoginPage.LOGIN_PAGE_LINK);
        loginPage = new LoginPage(driver);
    }

    @Test
    void userShouldSingInWithValidCredentials() {
        loginPage.singIn(User.getUserWithValidCredentials());
        Assertions.assertEquals(LoginPage.LOGIN_SUCCESS_LINK, driver.getCurrentUrl(),
                "User was not sing in with valid credentials");
    }

    @Test
    void passwordIncorrectMassageShouldAppearsWhenUserSingInWithNotValidPassword() {
        loginPage.singIn(User.getUserWithUnValidPassword());
        Assertions.assertEquals(LoginPage.PASSWORD_INCORRECT_MASSAGE, loginPage.getPasswordIncorrectMassage(),
                "Error massage was not shown when incorrect password was entered");
    }
}