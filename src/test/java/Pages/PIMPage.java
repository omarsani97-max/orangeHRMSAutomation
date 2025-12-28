package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static org.openqa.selenium.support.PageFactory.initElements;

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
    WebDriver driver;

    public PIMPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public String inputPIMInfo(String firstName, String middleName, String lastName, String userName, String password, String confirmPassword) throws InterruptedException {
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

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement empId = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//label[contains(text(),'Employee Id')]/following::input[1]")
                )
        );

        String userId = empId.getAttribute("value");
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
        return userId;

    }
}
