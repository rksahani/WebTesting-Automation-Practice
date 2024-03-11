import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class baseTest {
    WebDriver driver;
    @BeforeMethod
    public void init()
    {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://practice.expandtesting.com/login");
    }

    @AfterMethod
    public void flush()
    {
        driver.quit();
    }

}




//Automate below funtionality
//1.Automate Login funtionality
//2.Search any example using search fucntionality.
//3.click on searched result