package TestRunner;

import Config.Setup;
import Pages.LoginPage;
import Pages.directoryPage;
import UtilsFolder.UtilsPage;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

import static java.awt.SystemColor.text;
import static org.testng.Assert.assertEquals;

public class DirectoryPageTest extends Setup {
    @Test(priority = 1)
    public void doLoginWithValidCred() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("Admin", "admin123");
        Thread.sleep(4000);
    }
    @Test(priority = 2)
public void directorygoto() throws IOException, ParseException, InterruptedException {
        directoryPage directoryPage=new directoryPage(driver);
        String firstName= UtilsPage.getUser().get("firstName").toString();
        System.out.println("firstName  " +firstName);
        directoryPage.directoryInfo(firstName);
    }
    @Test(priority = 3)
    public void textMatchWithJson() throws IOException, ParseException {
        WebElement textElement = driver.findElement(
                By.xpath("//p[contains(@class,'orangehrm-directory-card-header')]")
        );
        String actualText = textElement.getText().trim();
        String expectedText =
                UtilsPage.getUser().get("firstName").toString() + " " +
                        UtilsPage.getUser().get("middleName").toString() + " " +
                        UtilsPage.getUser().get("lastName").toString();
        Assert.assertEquals(actualText,expectedText);
        Assert.assertTrue(actualText.contains(expectedText),
                "❌ JSON firstName not found in UI text");

    }

}

