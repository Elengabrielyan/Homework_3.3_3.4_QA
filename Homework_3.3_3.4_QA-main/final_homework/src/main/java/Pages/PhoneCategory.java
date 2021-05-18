package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.AssertJUnit.assertTrue;

public class PhoneCategory extends BasePage{

    public static final String ELECTRONIC_PAGE_URL = "https://www.list.am/category/11";

    private By phone_category_button = By.cssSelector("a[href $= \"y/11\"]") ;
    private By radio_button = By.id("idcmtype0");
    private By checkbox_withphotos =  By.id("idpo");
    private By radioButton_Want = By.id("idtype2");
    private By radioButton_forSale = By.id("idtype0");


    public void checkbox_withPhotos () {
        findElementBy(checkbox_withphotos).click();
        System.out.println(findElementBy(checkbox_withphotos).getText());
    }
    public void radioButton_forSale(){
        findElementBy(radioButton_forSale).click();
        System.out.println(findElementBy(radioButton_forSale).getText());

    }
    public void radio_button(){
        findElementBy(radio_button).click();
        System.out.println(findElementBy(radio_button).getText());
    }

    public void radioButton_Want(){
        findElementBy(radioButton_Want).click();
        System.out.println(findElementBy(radioButton_Want).getText());

    }
    public PhoneCategory(WebDriver driver) {
        super(driver);
    }


}