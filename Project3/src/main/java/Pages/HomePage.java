package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver)
    {
        this.driver = driver;
    }
    public  static By show(){
        return By.xpath("//h1[text()=\"Secure Area\"]");
    }

    By demo = By.xpath("//a[@id=\"examples-dropdown\"]");
    By example = By.xpath("//a[text()=\"Examples\"]");

    public SearchPage Example(){
        driver.findElement(demo).click();
        driver.findElement(example).click();
        return new SearchPage(driver);
    }
}
