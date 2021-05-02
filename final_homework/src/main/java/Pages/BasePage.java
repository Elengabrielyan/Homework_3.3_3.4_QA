package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    protected final WebDriver driver;

    protected BasePage(WebDriver driver) {
        this.driver = driver;
    }

    protected WebElement findElementBy(By by ){
        if(by == null){
            throw new IllegalArgumentException("'By' cannot be null!");
        }
        return driver.findElement(by);
    }
}