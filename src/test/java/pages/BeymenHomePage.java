package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BeymenHomePage {

        public WebDriver driver;

        public BeymenHomePage(WebDriver driver) {
            this.driver = driver;
        }

        public boolean isHomePageOpened() {
            return driver.getTitle().contains("Beymen");
        }

        public void searchForProduct(String keyword) {
            driver.findElement(By.id("search-box")).sendKeys(keyword);
        }

        // Diğer sayfa işlemleri buraya eklenebilir
    }


