import Base.BaseTest;
import Main.Subscription_Page;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class Subscription_Page_Test extends BaseTest {

    Subscription_Page subscription_page;

    @Test
    public void SA_Subscription(){
        subscription_page = new Subscription_Page(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        subscription_page.changeCountryToSA();
        String countryName = "السعودية";
        System.out.println(countryName);
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("country-name"), countryName));
        // First Subscription
        String firstType = driver.findElement(By.id("name-لايت")).getText();
        String expectedFirstType = "لايت";
        Assert.assertEquals(firstType,expectedFirstType);
        System.out.println(" النوع الأول : " + firstType + " ");
        String firstCurrency = driver.findElement(By.id("currency-لايت")).getText();
        String expectedFirstCurrency = "15 ريال سعودي/شهر";
        Assert.assertEquals(firstCurrency,expectedFirstCurrency);
        System.out.println(firstCurrency);
        // 2nd Subscription
        String secType = driver.findElement(By.id("name-الأساسية")).getText();
        String expectedSecType = "الأساسية";
        Assert.assertEquals(secType,expectedSecType);
        System.out.println(" النوع الثاني : " + secType + " ");
        String secCurrency = driver.findElement(By.id("currency-الأساسية")).getText();
        String expectedSecCurrency = "25 ريال سعودي/شهر";
        Assert.assertEquals(secCurrency,expectedSecCurrency);
        System.out.println(secCurrency);
        // Third Subscription
        String thirdType = driver.findElement(By.id("name-بريميوم")).getText();
        String expectedThirdType = "بريميوم";
        Assert.assertEquals(thirdType,expectedThirdType);
        System.out.println(" النوع الثالث : " + thirdType + " ");
        String thirdCurrency = driver.findElement(By.id("currency-بريميوم")).getText();
        String expectedThirdCurrency = "60 ريال سعودي/شهر";
        Assert.assertEquals(thirdCurrency,expectedThirdCurrency);
        System.out.println(thirdCurrency);
    }

    @Test(priority = 1)
    public void Kuwait_Subscription(){
        subscription_page = new Subscription_Page(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        subscription_page.changeCountryToKuwait();
        String countryName = "الكويت";
        System.out.println(countryName);
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("country-name"), countryName));
        // First Subscription
        String firstType = driver.findElement(By.id("name-لايت")).getText();
        String expectedFirstType = "لايت";
        Assert.assertEquals(firstType,expectedFirstType);
        System.out.println(" النوع الأول : " + firstType + " ");
        String firstCurrency = driver.findElement(By.id("currency-لايت")).getText();
        String expectedFirstCurrency = "1.2 دينار كويتي/شهر";
        Assert.assertEquals(firstCurrency,expectedFirstCurrency);
        System.out.println(firstCurrency);
        // 2nd Subscription
        String secType = driver.findElement(By.id("name-الأساسية")).getText();
        String expectedSecType = "الأساسية";
        Assert.assertEquals(secType,expectedSecType);
        System.out.println(" النوع الثاني : " + secType + " ");
        String secCurrency = driver.findElement(By.id("currency-الأساسية")).getText();
        String expectedSecCurrency = "2.5 دينار كويتي/شهر";
        Assert.assertEquals(secCurrency,expectedSecCurrency);
        System.out.println(secCurrency);
        // Third Subscription
        String thirdType = driver.findElement(By.id("name-بريميوم")).getText();
        String expectedThirdType = "بريميوم";
        Assert.assertEquals(thirdType,expectedThirdType);
        System.out.println(" النوع الثالث : " + thirdType + " ");
        String thirdCurrency = driver.findElement(By.id("currency-بريميوم")).getText();
        String expectedThirdCurrency = "4.8 دينار كويتي/شهر";
        Assert.assertEquals(thirdCurrency,expectedThirdCurrency);
        System.out.println(thirdCurrency);
    }

    @Test(priority = 2)
    public void Bahrain_Subscription(){
        subscription_page = new Subscription_Page(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        subscription_page.changeCountryToBaharin();
        String countryName = "البحرين";
        System.out.println(countryName);
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("country-name"), countryName));
        // First Subscription
        String firstType = driver.findElement(By.id("name-لايت")).getText();
        String expectedFirstType = "لايت";
        Assert.assertEquals(firstType,expectedFirstType);
        System.out.println(" النوع الأول : " + firstType + " ");
        String firstCurrency = driver.findElement(By.id("currency-لايت")).getText();
        String expectedFirstCurrency = "2 دينار بحريني/شهر";
        Assert.assertEquals(firstCurrency,expectedFirstCurrency);
        System.out.println(firstCurrency);
        // 2nd Subscription
        String secType = driver.findElement(By.id("name-الأساسية")).getText();
        String expectedSecType = "الأساسية";
        Assert.assertEquals(secType,expectedSecType);
        System.out.println(" النوع الثاني : " + secType + " ");
        String secCurrency = driver.findElement(By.id("currency-الأساسية")).getText();
        String expectedSecCurrency = "3 دينار بحريني/شهر";
        Assert.assertEquals(secCurrency,expectedSecCurrency);
        System.out.println(secCurrency);
        // Third Subscription
        String thirdType = driver.findElement(By.id("name-بريميوم")).getText();
        String expectedThirdType = "بريميوم";
        Assert.assertEquals(thirdType,expectedThirdType);
        System.out.println(" النوع الثالث : " + thirdType + " ");
        String thirdCurrency = driver.findElement(By.id("currency-بريميوم")).getText();
        String expectedThirdCurrency = "6 دينار بحريني/شهر";
        Assert.assertEquals(thirdCurrency,expectedThirdCurrency);
        System.out.println(thirdCurrency);
    }

}
