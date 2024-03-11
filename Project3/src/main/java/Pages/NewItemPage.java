package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewItemPage {

    WebDriver driver;

    public NewItemPage(WebDriver driver)
    {
        this.driver = driver;
    }


    public static By newitem(){
        return By.xpath("//h1[text()=\"Dynamic Table\"]");
    }
}
