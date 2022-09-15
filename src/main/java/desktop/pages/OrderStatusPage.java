package desktop.pages;

import abstractclasses.page.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderStatusPage extends AbstractPage {

    @FindBy(id = "orderNumber")
    WebElement orderNumberField;

    @FindBy(id = "customerEmail")
    WebElement emailUsedOnOrder;

    @FindBy(xpath = "//*[@class='btn btn-primary'][text()='View']")
    WebElement viewOrderInfoButton;

    @FindBy(xpath = "//*[@class='order-header']")
    WebElement orderNumber;

    public OrderStatusPage(WebDriver driver) {
        super(driver);
    }

    public void getStatusOfUserOrder(String orderNumber, String userEmail ) {
        orderNumberField.sendKeys(orderNumber);
        emailUsedOnOrder.sendKeys(userEmail);
        viewOrderInfoButton.click();
    }
    public String getOrderNumber(){
        return orderNumber.getText();
    }
}
