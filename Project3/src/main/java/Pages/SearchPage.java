package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
    WebDriver driver;
    public SearchPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public static By examples(){
        return By.xpath("//h1[@id=\"main-title\"]");
    }
    By item = By.xpath("//input[@placeholder=\"Search an example...\"]");

    By itembutton = By.xpath("//a[text()=\"Dynamic Table\"]");
    By Searchbutton = By.xpath("(//button)[2]");
    public void search(){
        driver.findElement(item).sendKeys("Dynamic Table");
        driver.findElement(Searchbutton).click();
    }
    public static By itemfound()
    {
    return By.xpath("(//p[text()])[5]");
    }
    public NewItemPage clicksearch(){
        driver.findElement(itembutton).click();
        return new NewItemPage(driver);
    }
    public void search1(){
        driver.findElement(item).sendKeys("Dynmic Tble");
        driver.findElement(Searchbutton).click();
    }
    public static By noitemfound()
    {
        return By.xpath("//b[text()=\"No examples found.\"]");
    }
}
