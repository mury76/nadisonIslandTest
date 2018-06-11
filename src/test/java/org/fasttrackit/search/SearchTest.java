package org.fasttrackit.search;

import org.fasttrackit.webviews.Header;
import org.fasttrackit.webviews.ProductGrid;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class SearchTest {

    public static final String SEARCH_TEXT = "VASE";

    @Test
    public void searchWithOneKeywordTest(){
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\mury7\\FastTrackIt\\nadisonIslandTest\\src\\test\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");

        Header header = PageFactory.initElements(driver, Header.class); //Obiectul header cu initializari...

        header.search(SEARCH_TEXT);

//        driver.findElement(By.id("search")).sendKeys(SEARCH_TEXT + Keys.ENTER); //Old way

        ProductGrid productGrid = PageFactory.initElements(driver, ProductGrid.class);

        for (WebElement productNameContainer : productGrid.getProductNameContainers()) {
            String productName = productNameContainer.getText();

            assertThat("Some of the products do not contain the searched key",
                    productName, containsString(SEARCH_TEXT));
        }

      driver.quit();
    }
}
