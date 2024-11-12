package searchTest;

import baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class SearchTest extends BaseTest {
    HomePage homePage;
    //WebDriver driver;
    @Test
    public void  SearchWithBrandName(){

        homePage= new HomePage(BaseTest.driver);

        homePage.EnterSearchProduct("Samsung");
        homePage.ClickOnSearchButton();
        String ExpectedResults ="Samsung";


        String actualResults = homePage.GetActualResults();

        // Validate results
        Assert.assertTrue(actualResults.contains("Samsung"));
//        Assert.assertEquals(ExpectedResults, actualResults);
    }
    @Test
    public void SearchSuggestionsTest(){
        homePage= new HomePage(BaseTest.driver);

        homePage.EnterSearchProduct("Samsung");



        String actualResults = homePage.GetSuggestionResults();

        // Validate results
        Assert.assertTrue(actualResults.contains("Samsung"));

    }
}



