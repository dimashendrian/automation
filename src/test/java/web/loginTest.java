package web;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utility.base.WebBase;
import utility.pages.HomePage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class loginTest {

    WebDriver driver;
    private WebBase webBase;
    private HomePage homePage;


    @BeforeTest
    public void beforeTest () {
        webBase = new WebBase();
        driver = webBase.init();
        homePage = new HomePage(driver);
    }

    @Test
    public boolean loginTest() {
        // data
        ArrayList<String> userlogin = new ArrayList();
        ArrayList<String> passwordUser = new ArrayList();
        userlogin.add("standard_user");
        userlogin.add("locked_out_user");
        userlogin.add("abcde");
        passwordUser.add("secret_sauce");

        for (int i = 0; i < userlogin.size(); i++){
            homePage.login(userlogin.get(i), passwordUser.get(0));
        }
        homePage.validateLogin(loginTest());
        return false;
    }
}
