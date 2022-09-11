package abstractclasses.page;

import constants.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public static final String LOGIN_PAGE_LINK = "https://www.bookdepository.com/account/login/to/account";
    public static final String LOGIN_SUCCESS_LINK = "https://www.bookdepository.com/?status=welcome";
    public static final String PASSWORD_INCORRECT_MASSAGE = "Your password is incorrect";


    WebDriver driver;

    @FindBy(xpath = "//input[@placeholder='Email']")
    WebElement emailFieldToSingIn;

    @FindBy(xpath = "//input[@placeholder='Book Depository password']")
    WebElement passWordFieldToSingIn;

    @FindBy(id = "signInSubmit")
    WebElement signInButton;

    @FindBy(xpath = "//*[@class='a-section a-spacing-none auth-pagelet-mobile-container']//*[@class='a-list-item']")
    WebElement passwordIncorrectMassage;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
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
        WebElement iframe = driver.findElement(By.xpath("//*[@class='signin-iframe']"));
        driver.switchTo().frame(iframe);
        this.setUserEmailToSingIn(user.getEmail());
        this.setPasswordToSingIn(user.getPassword());
        this.clickSingIn();
    }

    public String getPasswordIncorrectMassage() {
        return passwordIncorrectMassage.getText();
    }
}