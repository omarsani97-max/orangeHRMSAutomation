package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    @FindBy(name = "username")
    WebElement testUsername;
    @FindBy(name = "password")
    WebElement testPassword;
    @FindBy(xpath = "//button[@type=\"submit\"]")
    WebElement loginButton;


    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
    public void login(String username,String password) throws InterruptedException {
        testUsername.sendKeys(username);
        testPassword.sendKeys(password);
        Thread.sleep(500);
        loginButton.click();
}
}
