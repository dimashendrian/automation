package utility.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebBase {

    WebDriver driver;

    public WebDriver init() {
        System.setProperty("webdriver.chrome.driver","/Users/samid/Downloads/chromedriver-win64/chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://www.saucedemo.com/");
        return driver;
    }
}
