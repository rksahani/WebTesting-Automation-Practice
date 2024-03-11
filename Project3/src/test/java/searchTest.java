import Pages.HomePage;
import Pages.LoginPage;
import Pages.SearchPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class searchTest extends baseTest {

    //positive scenario

    @Test
    public void Search() {
        new LoginPage(driver).performLogin("practice", "SuperSecretPassword!");
        Assert.assertTrue(driver.findElement(HomePage.show()).isDisplayed());
        new HomePage(driver).Example();
        Assert.assertTrue(driver.findElement(SearchPage.examples()).isDisplayed());
        new SearchPage(driver).search();
        Assert.assertTrue(driver.findElement(SearchPage.itemfound()).isDisplayed());
    }


    //Nagative scenario
    @Test
    public void Search1() {
        new LoginPage(driver).performLogin("practice", "SuperSecretPassword!");
        Assert.assertTrue(driver.findElement(HomePage.show()).isDisplayed());
        new HomePage(driver).Example();
        Assert.assertTrue(driver.findElement(SearchPage.examples()).isDisplayed());
        new SearchPage(driver).search1();
        Assert.assertTrue(driver.findElement(SearchPage.noitemfound()).isDisplayed());
    }



   // Note :-  Sometimes 'Search' button is not clickable! It's a Bug.

}
