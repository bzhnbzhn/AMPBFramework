package abstractclasses.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderStatusPage {

    WebDriver driver;

    @FindBy(id = "orderNumber")
    WebElement orderNumberField;

    @FindBy(id = "customerEmail")
    WebElement emailUsedOnOrder;

    @FindBy(xpath = "//*[@class='btn btn-primary'][text()='View']")
    WebElement viewOrderInfoButton;

    @FindBy(xpath = "//*[@class='order-header']")
    WebElement orderNumber;

    public OrderStatusPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void getStatusOfUserOrder(String orderNumber, String userEmail ) {
        this.orderNumberField.sendKeys(orderNumber);
        this.emailUsedOnOrder.sendKeys(userEmail);
        this.viewOrderInfoButton.click();
    }
    public String getOrderNumber(){
        return this.orderNumber.getText();
    }
}
