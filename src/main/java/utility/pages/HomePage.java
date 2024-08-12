package utility.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.base.WebBase;

import java.util.ArrayList;

public class HomePage {

    WebDriver driver;

    @FindBy(xpath = "//input[@id='user-name']")
    public WebElement txtInputUsername;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement txtInputPassword;

    @FindBy(xpath = "//input[@id='login-button']")
    public WebElement btnLogin;

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[1]/div[2]/div")
    public WebElement headerPage;

    @FindBy(xpath = "//*[@id=\"login_button_container\"]/div/form/div[3]/h3")
    public WebElement errorMessage;

    public HomePage (WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    public void login(String username, String password) {
//        ArrayList<String> userlogin = new ArrayList(Integer.parseInt(username));
//        userlogin.add("standard_user");
//        userlogin.add("locked_out_user");
//        userlogin.add("problem_user");
//        ArrayList<String> passwordUser = new ArrayList(Integer.parseInt(password));
//        passwordUser.add("secret_sauce");
//        txtInputUsername.sendKeys((CharSequence) userlogin);
//        txtInputPassword.sendKeys((CharSequence) passwordUser);

        txtInputUsername.sendKeys(username);
        txtInputPassword.sendKeys(password);
        btnLogin.click();
    }

    public void validateLoginSucessfully() {
        Assert.assertTrue(headerPage.isDisplayed());
    }

    public void validateLoginUnsucessfully() {
        Assert.assertTrue(errorMessage.isDisplayed());
    }

    public void validateLogin(boolean loginValue){
        if(loginValue){
            validateLoginSucessfully();
        } else {
            validateLoginUnsucessfully();
        }
    }
}
