package TestRunner;

import Config.Setup;
import Pages.LoginPage;
import Pages.directoryPage;
import UtilsFolder.UtilsPage;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;

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
        String userName= UtilsPage.getUser().get("userName").toString();
        System.out.println("userName  " +userName);
        directoryPage.directoryInfo(userName);


    }
}