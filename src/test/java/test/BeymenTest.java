package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.BeymenHomePage;
import pages.BeymenSearchPage;
import utilities.ReusableMethods;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class BeymenTest extends ReusableMethods {
    public WebDriver driver;
    public BeymenHomePage homePage;
    public BeymenSearchPage searchPage;


        @BeforeClass
        public void setup() {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            homePage = new BeymenHomePage(driver);
            searchPage = new BeymenSearchPage(driver);
        }

        Sheet sayfa1;

        @Test
        public void testBeymenScenario() throws IOException {

            // Beymen sitesini aç
            driver.get("https://www.beymen.com/");
            bekle(2);
            //Cerezleri ve cinsiyet acilir panceresini kapat
            driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
            driver.findElement(By.xpath("//button[@id='genderManButton']")).click();

            // Ana sayfanın açıldığını kontrol et
            Assert.assertTrue(homePage.isHomePageOpened(), "Ana sayfa acildi.");
            Actions actions = new Actions(driver);
            // Arama kutucuğuna "şort" kelimesini gir

            String dosyaYolu = "src/test/java/tests/Beymen.xlsx";
            FileInputStream fileInputStream = new FileInputStream(dosyaYolu);
            Workbook workbook = WorkbookFactory.create(fileInputStream);
            // Excel dosyasındaki sayfa1'i al
            sayfa1 = workbook.getSheetAt(0);
            WebElement searchElementi = driver.findElement(By.xpath("//input[@placeholder='Ürün, Marka Arayın']"));
            Row row = sayfa1.getRow(0);
            Cell cell = row.getCell(0);

            searchElementi.sendKeys(cell.getStringCellValue());
            bekle(2);

            // Arama kutucuğundaki "şort" kelimesini sil
            searchElementi.clear();
            bekle(2);
            Row row1 = sayfa1.getRow(0);
            Cell cell1 = row.getCell(1);
            searchElementi.sendKeys(cell1.getStringCellValue());

            // Klavye üzerinden "enter" tuşuna bas
            searchElementi.sendKeys(Keys.ENTER);


            // Sonuca göre sergilenen ürünlerden rastgele bir ürünü seç
            // Sonuca göre sergilenen ürünleri al
            List<WebElement> productList = driver.findElements(By.xpath("//div[@class='m-productImageList']"));

            // Rastgele bir ürün seç
            Random random = new Random();
            int randomIndex = random.nextInt(productList.size());
            WebElement selectedProduct = productList.get(randomIndex);

            // Seçilen ürünü tıkla
            selectedProduct.click();

            //searchPage.selectRandomProduct();
/*
        // Seçilen ürünün ürün bilgisi ve tutar bilgisi txt dosyasına yaz
        // Bu işlemi gerçekleştirmek için WebDriver API'sini kullanabilirsiniz.

        // Seçilen ürünü sepete ekle
        // Bu işlemi gerçekleştirmek için WebDriver API'sini kullanabilirsiniz.

        // Ürün sayfasındaki fiyat ile sepette yer alan ürün fiyatının doğruluğunu karşılaştır
        // Bu işlemi gerçekleştirmek için WebDriver API'sini kullanabilirsiniz.

        // Adet arttırılarak ürün adedinin 2 olduğunu doğrula
        // Bu işlemi gerçekleştirmek için WebDriver API'sini kullanabilirsiniz.

        // Ürünü sepetten silerek sepetin boş olduğunu kontrol et
        // Bu işlemi gerçekleştirmek için WebDriver API'sini kullanabilirsiniz.
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
 */
        }
    }

