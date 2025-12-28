package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class directoryPage {
    @FindBy(css = ".oxd-main-menu-item")
    List<WebElement>clickOnDicrectory;
    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement clickOnSearch;



    public directoryPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void directoryInfo(String userName) throws InterruptedException {
        clickOnDicrectory.get(8).click();
        Thread.sleep(2000);
        clickOnSearch.sendKeys(userName);
        Thread.sleep(1000);
    }

}
