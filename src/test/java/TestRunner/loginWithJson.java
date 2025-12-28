package TestRunner;

import Config.Setup;
import Pages.LoginPage;
import UtilsFolder.UtilsPage;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

public class loginWithJson extends Setup {
    @Test(description ="login with Json")
    public void userLogin() throws IOException, ParseException, InterruptedException {
        LoginPage loginPage=new LoginPage(driver);
        String userName= UtilsPage.getUser().get("userName").toString();
        String password= UtilsPage.getUser().get("password").toString();
        System.out.println("password"+password);
        loginPage.login(userName,password);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(4000);

    }
}
