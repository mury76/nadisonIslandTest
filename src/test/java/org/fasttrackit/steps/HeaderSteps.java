package org.fasttrackit.steps;

import org.fasttrackit.DriverFactory;
import org.fasttrackit.webviews.Header;
import org.openqa.selenium.support.PageFactory;

import java.sql.Driver;

public class HeaderSteps {

    public void search (String keyword) {
        Header header = PageFactory.initElements(DriverFactory.getDriver(), Header.class); //Obiectul header cu initializari...
        header.search(keyword);
    }
}
