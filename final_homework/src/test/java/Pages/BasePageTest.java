package Pages;

import static org.testng.Assert.*;
import com.google.common.io.Files;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BasePageTest {
    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/home/Desktop/final_homework/chromedriver");
    }

}