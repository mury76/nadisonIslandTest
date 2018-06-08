package org.fasttrackit.search;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchTest {

    public static final String TEXT1 = "VASE";

    @Test
    public void searchWithOneKeywordTest(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mury7\\FastTrackIt\\nadisonIslandTest\\src\\test\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");

       driver.findElement(By.id("search")).sendKeys(TEXT1 + Keys.ENTER);
       driver.findElement(By.partialLinkText(TEXT1));
//
//      driver.quit();
    }
}
