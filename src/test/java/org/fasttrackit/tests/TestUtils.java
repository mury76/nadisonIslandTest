package org.fasttrackit.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import static org.fasttrackit.DriverFactory.getDriver;

public class TestUtils {

    public static void mouseRun (By hooverOn, By clickOn) {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(getDriver().findElement(hooverOn)).perform();
        System.out.println("Exeuted mouse over.");
        actions.click(getDriver().findElement(clickOn)).perform();
        System.out.println("Clicked");
    }



}
