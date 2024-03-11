import Pages.HomePage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class loginTest extends baseTest {
    @Test
    public  void validlogin() {
        new LoginPage(driver).performLogin("practice","SuperSecretPassword!");
        Assert.assertTrue(driver.findElement(HomePage.show()).isDisplayed());
    }
    @Test
    public void invalidLogin() {
        new LoginPage(driver).performLogin("practice", "SuperPassword");
        Assert.assertTrue((driver.findElement(LoginPage.error())).isDisplayed());
    }

}