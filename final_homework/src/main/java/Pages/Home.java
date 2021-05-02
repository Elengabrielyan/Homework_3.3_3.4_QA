package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.AssertJUnit.assertTrue;
public class Home extends BasePage {
     public Home(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//*[@id=\"ma\"]")
    WebElement myPage;

    @FindBy(xpath = "//*[@id=\"ma\"]")
    WebElement userName;
   // @FindBy(css = "left: 380.019px; display: none;")
   // WebElement phone_category;

    private By electronic_category_button = By.cssSelector("div[data-c = \"4\"]");
    private By phone_category = By.xpath("//a[@href='/category/4']");

    public ElectronicsCategory choose_el_category () {
        findElementBy(electronic_category_button).click();
        return new ElectronicsCategory(driver);
    }

    public PhoneCategory choose_phone_category () {
        findElementBy(phone_category).click();
        return new PhoneCategory(driver);
    }


    public void clickMyPage() {
        myPage.click();
    }


}