package TestRunner;

import Config.Setup;
import Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends Setup{
    @Test
    public void doLoginWithValidCred() throws InterruptedException {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.login("Admin","admin123");
        Thread.sleep(4000);

        WebElement MatchText= driver.findElement(By.xpath("//span/h6"));
        String ActualText= MatchText.getText();
        String TextExpected="Dashboard";
        Assert.assertEquals(ActualText.trim(),TextExpected);
        Thread.sleep(4000);

    }
}
