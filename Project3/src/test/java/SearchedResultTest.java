import Pages.HomePage;
import Pages.LoginPage;
import Pages.NewItemPage;
import Pages.SearchPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchedResultTest extends baseTest{
    @Test
    public void searchedResult(){
        new LoginPage(driver).performLogin("practice","SuperSecretPassword!");
        Assert.assertTrue(driver.findElement(HomePage.show()).isDisplayed());
        new HomePage(driver).Example();
        Assert.assertTrue(driver.findElement(SearchPage.examples()).isDisplayed());
        new SearchPage(driver).search();
        Assert.assertTrue(driver.findElement(SearchPage.itemfound()).isDisplayed());
        new SearchPage(driver).clicksearch();
        Assert.assertTrue(driver.findElement(NewItemPage.newitem()).isDisplayed());
    }
}
