package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.AssertJUnit.assertTrue;

public class ElectronicsCategory extends BasePage{

    public static final String ELECTRONIC_PAGE_URL = "https://www.list.am/category/4";

    private By electronic_category_button = By.cssSelector("a[href $= \"y/11\"]") ;
    private By hip_icon = By.xpath("//*[@id='tp']/div[1]/a");
    private By heart = By.xpath("//*[@id=\"sstar\"]/div");
    private By moto_sub = By.cssSelector("#ff > div.section.cat > div.cl > div:nth-child(3) > a:nth-child(1)");
    private By small_heart = By.xpath("//*[@id=\"star\"]/div");
    private By product = By.xpath("//*[@id=\"tp\"]/div[2]/a[1]/img");
    private By myPage = By.xpath("//*[@id=\"ma\"]");

    protected ElectronicsCategory(WebDriver driver) {
        super(driver);
    }

    public void hip_icon () {
        findElementBy(hip_icon).click();
        System.out.println(findElementBy(hip_icon).getClass());
    }

    public void heart() {
        findElementBy(heart).click();
        System.out.println(findElementBy(heart).getClass());
    }

    public void moto_sub(){
        findElementBy(moto_sub).click();
        System.out.println(findElementBy(moto_sub).getClass());
    }

    public void small_heart(){
        findElementBy(small_heart).click();
        System.out.println(findElementBy(small_heart).getClass());
    }

    public void product(){
        findElementBy(product).click();
        System.out.println(findElementBy(product).getClass());
    }

    public void myPage(){
        findElementBy(myPage).click();
        System.out.println(findElementBy(myPage).getClass());
    }
    }