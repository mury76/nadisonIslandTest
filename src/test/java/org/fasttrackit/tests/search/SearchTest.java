package org.fasttrackit.tests.search;

import org.fasttrackit.DriverFactory;
import org.fasttrackit.steps.HeaderSteps;
import org.fasttrackit.steps.ProductGridSteps;
import org.fasttrackit.tests.TestBase;
import org.fasttrackit.tests.TestUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import static org.fasttrackit.DriverFactory.getDriver;

public class SearchTest extends TestBase {


    @Test
    public void searchWithOneKeywordTest (){
        String keyword = "SET";

        HeaderSteps headerSteps = new HeaderSteps();
        headerSteps.search(keyword);

        ProductGridSteps productGridSteps = new ProductGridSteps();
        productGridSteps.assertThatAllProductNamesContain(keyword);

    }

    @Test
    public void mouseOverDemo() {
        TestUtils.mouseRun(By.linkText("WOMEN"), By.linkText("New Arrivals"));

//        Actions actions = new Actions(getDriver());
//        actions.moveToElement(getDriver().findElement(By.linkText("WOMEN"))).perform();
//        actions.click(getDriver().findElement(By.linkText("New Arrivals"))).perform();
    }

}
