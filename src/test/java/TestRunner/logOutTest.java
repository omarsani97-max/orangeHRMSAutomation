package TestRunner;

import Config.Setup;
import Pages.logOut;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class logOutTest extends Setup {
    @Test()
    public void logOutFromDirctoryPage() throws InterruptedException {
        logOut logout=new logOut(driver);
        logout.doLogout();
    }
}
