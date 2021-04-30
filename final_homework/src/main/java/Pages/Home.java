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



    private By electronic_category_button = By.cssSelector("div[data-c = \"4\"]");


    public ElectronicsCategory choose_el_category () {
        findElementBy(electronic_category_button).click();
        return new ElectronicsCategory(driver);
    }

}