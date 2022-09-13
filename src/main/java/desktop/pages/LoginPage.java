package desktop.pages;

import constants.User;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {

    public static final String LOGIN_PAGE_LINK = "https://www.bookdepository.com/account/login/to/account";
    public static final String LOGIN_SUCCESS_LINK = "https://www.bookdepository.com/?status=welcome";
    public static final String PASSWORD_INCORRECT_MASSAGE = "Your password is incorrect";

    @FindBy(xpath = "//input[@placeholder='Email']")
    WebElement emailFieldToSingIn;

    @FindBy(xpath = "//input[@placeholder='Book Depository password']")
    WebElement passWordFieldToSingIn;

    @FindBy(id = "signInSubmit")
    WebElement signInButton;

    @FindBy(xpath = "//*[@class='a-section a-spacing-none auth-pagelet-mobile-container']//*[@class='a-list-item']")
    WebElement passwordIncorrectMassage;

    @FindBy(xpath = "//*[@class='signin-iframe']")
    WebElement iframe;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private void setUserEmailToSingIn(String userName) {
        emailFieldToSingIn.sendKeys(userName);
    }

    private void setPasswordToSingIn(String password) {
        passWordFieldToSingIn.sendKeys(password);
    }

    private void clickSingIn() {
        signInButton.click();
    }

    public void singIn(User user) {
        driver.switchTo().frame(iframe);
        setUserEmailToSingIn(user.getEmail());
        setPasswordToSingIn(user.getPassword());
        clickSingIn();
    }

    public String getPasswordIncorrectMassage() {
        return passwordIncorrectMassage.getText();
    }
}