package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PIMPage {
    @FindBy(className = "oxd-main-menu-item-wrapper")
    List<WebElement> clickonPIM;
    @FindBy(css = ".oxd-button")
    List<WebElement> clickOnAdd;
    @FindBy(name = "firstName")
    WebElement textFirstName;
    @FindBy(name = "middleName")
    WebElement testMiddleName;
    @FindBy(name = "lastName")
    WebElement testLastName;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    WebElement txtUserId;


    @FindBy(className = "oxd-input")
    List<WebElement> getEmployeeId;
    @FindBy(css = ".oxd-switch-input")
    List<WebElement> clickOnLonginDetails;

    @FindBy(css = ".oxd-input")
    List<WebElement> textuserName;
    @FindBy(css = ".oxd-input")
    List<WebElement> textpassword;
    @FindBy(css = ".oxd-input")
    List<WebElement> textconformPassword;
    @FindBy(css = ".oxd-button")
    List<WebElement> clickOnSave;


    public PIMPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void inputPIMInfo(String firstName, String middleName, String lastName, String userName, String password, String confirmPassword) throws InterruptedException {
        Thread.sleep(1000);
        clickonPIM.get(1).click();
        Thread.sleep(1000);
        clickOnAdd.get(2).click();
        Thread.sleep(1000);
        textFirstName.sendKeys(firstName);
        Thread.sleep(1000);
        testMiddleName.sendKeys(middleName);
        Thread.sleep(1000);
        testLastName.sendKeys(lastName);
        Thread.sleep(1000);
        txtUserId.getText();

        Thread.sleep(1000);
        clickOnLonginDetails.get(0).click();
        Thread.sleep(1000);
        textuserName.get(5).sendKeys(userName);
        Thread.sleep(2000);
        textpassword.get(6).sendKeys(password);
        Thread.sleep(1000);
        textconformPassword.get(7).sendKeys(confirmPassword);
        Thread.sleep(1000);
        clickOnSave.get(1).click();


    }
}