package Main;
import org.openqa.selenium.*;

public class Subscription_Page {

    // Constructor
    private WebDriver driver;
    public Subscription_Page(WebDriver driver){
        this.driver = driver ;
    }

    // Locators

    private By countryButton = By.id("country-btn");
    private By kuwait = By.id("kw");
    private By bahrain = By.id("bh");
    private By saudi = By.id("sa");

    //Actions

    public void changeCountryToKuwait(){
        driver.findElement(countryButton).click();
        driver.findElement(kuwait).click();
    }

    public void changeCountryToBaharin()
    {
        driver.findElement(countryButton).click();
        driver.findElement(bahrain).click();
    }

    public void changeCountryToSA()
    {
        driver.findElement(countryButton).click();
        driver.findElement(saudi).click();
    }

}
