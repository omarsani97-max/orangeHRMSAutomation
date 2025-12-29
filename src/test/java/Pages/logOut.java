package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class logOut {
    WebDriver driver;
    @FindBy(css=".oxd-userdropdown-name")
    List<WebElement> profileMenu;
    @FindBy(css = ".oxd-userdropdown-link")
    List<WebElement> logoutBtn;

    public logOut(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void doLogout() throws InterruptedException {
        profileMenu.get(0).click();
        Thread.sleep(1000);
        logoutBtn.get(3).click();
        Thread.sleep(1000);

    }
}
