package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utlis.MethodHandles;

import java.time.Duration;

public class HomePage extends MethodHandles {
   //public WebDriver driver;
WebDriverWait wait;

   public HomePage(WebDriver driver) {
        super(driver);
       wait = new WebDriverWait(driver, Duration.ofSeconds(30));

   }
    //----------------------Locators-----------------------------------------
    //search Field
    private final By SearchField = By.id("twotabsearchtextbox");

    // Search Button
    private final By SearchButton = By.id("nav-search-submit-button");
    public  By ActualResults = By.cssSelector(".a-color-state.a-text-bold");
    private final By SearchSuggestion = By.cssSelector(".s-suggestion.s-suggestion-ellipsis-direction");
    //Click On Search Btn
    public void ClickOnSearchButton(){click(SearchButton,10);}

    public void EnterSearchProduct(String product){
        sendKeys(SearchField,10,product);
    }


    public String GetActualResults(){

        return getElementText(driver.findElement(ActualResults));
    }


    public String GetSuggestionResults(){

        return getElementText(driver.findElement(SearchSuggestion));
    }




}
