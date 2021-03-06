
package org.fasttrackit.webviews;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductGrid {

    @FindBy(css = ".product-info .product-name a")
    private List<WebElement> productNameContainers;



    public List<WebElement> getProductNameContainers() {
        return productNameContainers;
    }
}

