package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BeymenPage {
    WebDriver driver;


        public BeymenPage() {
            this.driver=driver;
            PageFactory.initElements(driver, this);
        }

        //Main page

        @FindBy(css = "input[id='password']")
        public WebElement authPagePasswordInput;
        @FindBy(css = "input[id='kc-login']")
        public WebElement authPageLoginButton;
        @FindBy(xpath = "//div[@class='esri-view-surface esri-view-surface--touch-none']/*")
        public WebElement appPageCanvasMapElement;


    }

