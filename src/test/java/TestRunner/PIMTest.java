package TestRunner;

import Config.Setup;
import Pages.LoginPage;
import Pages.PIMPage;
import UtilsFolder.UtilsPage;
import com.github.javafaker.Faker;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

import static java.lang.Thread.sleep;

public class PIMTest extends Setup{
    @Test(priority = 1)
    public void doLoginWithValidCred() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("Admin", "admin123");
        sleep(4000);
    }
    @Test(priority = 2)
    public void PIMInfo() throws InterruptedException, IOException, ParseException {
        PIMPage pimPage = new PIMPage(driver);

        Faker faker = new Faker();
        String firstName = faker.name().firstName();
        String middleName = faker.name().nameWithMiddle();
        String lastName = faker.name().lastName();
        String username = faker.name().username();
        Thread.sleep(1000);



//        getEmployeeId.get(4).getText();
        int random = ThreadLocalRandom.current().nextInt(100000, 999999);
        String password = "Pass@" + random;
        System.out.println(password);
        String confirmPassword = password;
        pimPage.inputPIMInfo(firstName, middleName, lastName, username, password, confirmPassword);
//        UtilsPage.saveUserInfo(firstName,lastName,username,password);
        UtilsPage.saveUserInfo(firstName,lastName,username,password);
        Thread.sleep(4000);
    }
}