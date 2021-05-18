package Pages;

import base.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ElectronicsCategoryTest  extends BaseTests {


    @Test

    public void hip_icon() throws InterruptedException {
        ElectronicsCategory category_page = home.choose_el_category();
        category_page.hip_icon();
        category_page.findElementBy(By.xpath("//*[@id='tp']/div[1]/a")).click();
        }

    @Test
    public void heart(){
        ElectronicsCategory category_page = home.choose_el_category();
        category_page.heart();
        var a = category_page.findElementBy(By.xpath("//*[@id=\"ui-id-2\"]")).getText();
        if(a != null){
        System.out.println("Element is Present"); }
        else{
            System.out.println("Element is Absent");

        }

    }
    @Test
    public void moto_sub() {
        ElectronicsCategory category_page = home.choose_el_category();
        category_page.moto_sub();
        boolean vizibility = category_page.findElementBy(By.cssSelector("#ff > div.section.cat > div.cl > div:nth-child(3) > a:nth-child(1)")).isDisplayed();
        assertTrue(vizibility);

    }
    @Test
    public void small_heart(){
        ElectronicsCategory category_page = home.choose_el_category();
        category_page.small_heart();
        var b = category_page.findElementBy(By.xpath("//*[@id=\"star\"]/div")).getText();
        if(b != null){
            System.out.println("Element is Present"); }
        else{
            System.out.println("Element is Absent");

        }
    }
    @Test
    public void product() {
        ElectronicsCategory category_page = home.choose_el_category();
        category_page.product();
        category_page.findElementBy(By.xpath("//*[@id=\"tp\"]/div[2]/a[1]/img")).click();


    }

    @Test
    public void myPage(){
        ElectronicsCategory category_page = home.choose_el_category();
        category_page.myPage();
        category_page.findElementBy(By.xpath("//*[@id=\"ma\"]")).click();
    }

    }