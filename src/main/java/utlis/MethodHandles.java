package utlis;

import org.openqa.selenium.*;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MethodHandles {
    protected WebDriver driver;
    WebDriverWait wait;


    public MethodHandles(WebDriver driver) {
        this.driver=driver;


    }

    protected WebElement webElement(By locator){
        return driver.findElement(locator);
    }

    public String getElementText(WebElement element){

        return element.getText();
    }



    protected void explicitWait(By locator, int time){
        wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.and(
                ExpectedConditions.visibilityOf(webElement(locator)),
                ExpectedConditions.presenceOfElementLocated(locator),
                ExpectedConditions.visibilityOfElementLocated(locator),
                ExpectedConditions.elementToBeClickable(locator)
        ));
    }
    // Click Function
    protected void click(By locator,int time){

        explicitWait(locator,time);

        webElement(locator).click();
    }

    // Send Keys Function
    protected void sendKeys(By locator,int time,String text){

        explicitWait(locator,time);
//        scrollIntoView(driver,webElement(locator));
        webElement(locator).sendKeys(text);
    }

    public void EnterTextToElement(WebElement element, String text){

        wait.until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(text,Keys.ENTER);


    }



}
