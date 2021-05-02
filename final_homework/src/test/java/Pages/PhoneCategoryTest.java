package Pages;

import base.BaseTests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PhoneCategoryTest extends BaseTests {
@Test
//wrong test for the screenshot
    public void test_checkbox(){
    PhoneCategory the_category_page = home.choose_phone_category();
    the_category_page.checkbox_withPhotos();
    boolean isChecked = the_category_page.findElementBy(By.id("idpo")).isSelected();
    assertTrue(isChecked);
    org.testng.Assert.fail("wrong path");
}

@Test
    public void radioButton_forSale() {
    PhoneCategory choose_category_page = home.choose_phone_category();
    choose_category_page.radioButton_forSale();
    boolean isChecked = choose_category_page.findElementBy(By.id("idtype0")).isSelected();
    assertTrue(isChecked);
}
@Test
    public void radio_button(){
        PhoneCategory choose_category_page = home.choose_phone_category();
        choose_category_page.radio_button();
        boolean isChecked = choose_category_page.findElementBy(By.id("idcmtype0")).isSelected();
        assertTrue(isChecked);
    }


}


