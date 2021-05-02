package Pages;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ElectronicsCategoryTest  extends BaseTests {

    @Test
    public void anun() {
        ElectronicsCategory page = home.choose_el_category();

    }
}