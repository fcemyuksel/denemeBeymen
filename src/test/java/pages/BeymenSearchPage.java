package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class BeymenSearchPage {
    private WebDriver driver;

    public BeymenSearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clearSearchBox() {
        driver.findElement(By.id("search-box")).clear();
    }

    public void selectRandomProduct() {
        List<WebElement> productList = driver.findElements(By.cssSelector(".product-list .product-item"));
        if (!productList.isEmpty()) {
            Random random = new Random();
            int randomIndex = random.nextInt(productList.size());
            productList.get(randomIndex).click();
        } else {
            throw new RuntimeException("No products found on the search page.");
        }
    }

    // Diğer sayfa işlemleri buraya eklenebilir
}
