package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.Item ;

import static org.testng.AssertJUnit.assertTrue;
public class Category extends BasePage {
     public Category(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//*[@id=\"ma\"]")
    WebElement myPage;

    @FindBy(xpath = "//*[@id=\"ma\"]")
    WebElement userName;
   // @FindBy(css = "left: 380.019px; display: none;")
   // WebElement phone_category;
    public String getNavElementText () {
        return findElementBy(By.xpath("//*[@id=\"crumb\"]/ol/li[2]")).getText();
    }

    public boolean sidebarExists () {
        return !findElementBy(By.xpath("//*[@id=\"ff\"]")).isEnabled();
    }

    public void clickFilterOffer() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"ff\"]/div[1]/div[1]/div[2]/label"))));
        findElementBy(By.xpath("//*[@id=\"ff\"]/div[1]/div[1]/div[2]/label")).click();
    }

    public boolean priceFilterExists() {
        // WebDriverWait wait = new WebDriverWait(driver, 10);
        // wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loading)));
        // need to check the invisibility of the loading. The loading is too fast, I can't take its path. The test fails because of this
        return !driver.findElements(By.xpath("//*[@id=\"ff\"]/div[3]")).isEmpty();
    }

    public Item clickItem() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(item)));
        findElementBy(item).click();
        return new Item(driver);
    }


}