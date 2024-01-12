package test;
import org.apache.poi.ss.usermodel.*;
import org.junit.AfterClass;
import utilities.ReusableMethods;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import pages.BeymenPage;
import com.github.javafaker.Faker;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ReusableMethods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static utilities.ReusableMethods.bekle;


public class step_6 {
    BeymenPage beymenPage;
    WebDriver driver;
    Sheet sayfa1;


    @Test
    public void TestCase01() throws InterruptedException, IOException {
        beymenPage = new BeymenPage();

/*

        emsLayermarkPage.maximoPageAfterDetailsButtonContinueLink.click();
        emsLayermarkPage.maximoLoginPageUsernameInput.sendKeys("athompson");
        emsLayermarkPage.maximoLoginPagePasswordInput.sendKeys("Test123!");
        emsLayermarkPage.maximoLoginPageLoginButton.click();

*/


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
*/

    }
}
