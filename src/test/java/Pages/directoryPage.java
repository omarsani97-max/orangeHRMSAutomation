package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Objects;

import static org.openqa.selenium.support.PageFactory.initElements;

public class directoryPage {
    @FindBy(css = ".oxd-main-menu-item")
    List<WebElement>clickOnDicrectory;
    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement clickOnSearch;
    @FindBy(className = "oxd-button")
    List<WebElement>clickOnSearchButton;
    WebDriver dirver;

    public directoryPage(WebDriver driver){
        this.dirver=driver;
        initElements(driver,this);
    }
    public void directoryInfo(String firstName) throws InterruptedException {
        clickOnDicrectory.get(8).click();
        Thread.sleep(2000);
        clickOnSearch.sendKeys(firstName, Keys.ENTER);
        Thread.sleep(5000);
        clickOnSearch.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(1000);
        clickOnSearch.sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        clickOnSearchButton.get(1).click();
        Thread.sleep(5000);

    }

}
