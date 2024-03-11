package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }

    private By username= By.xpath("//input[@name=\"username\"]");
    private By password= By.xpath("//input[@name=\"password\"]");
    private By loginButton = By.xpath("//button[text()=\"Login\"]");

    public HomePage performLogin(String Username,String Password)
    {
        // driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(username).sendKeys(Username);
        driver.findElement(password).sendKeys(Password);
        driver.findElement(loginButton).click();
        return new HomePage(driver);
    }
    public static By error() {
        By errorMsg = By.xpath("//b[text()=\"Your password is invalid!\"]");
        return errorMsg;
    }
}
