package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.AssertJUnit.assertTrue;

public class ElectronicsCategory extends BasePage{

    public static final String ELECTRONIC_PAGE_URL = "https://www.list.am/category/4";

    private By phone_category_button = By.cssSelector("a[href $= \"y/11\"]") ;




    public ElectronicsCategory(WebDriver driver) {
        super(driver);
    }


}