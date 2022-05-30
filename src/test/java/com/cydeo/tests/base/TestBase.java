package com.cydeo.tests.base;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public abstract class TestBase {    // class create edip abstract yaptik. it is not mandatory
    // day 7 T3_CRM_Login class tan WebDriver variable i ve @BeforeMethod methodu cut/paste yaptik buraya
    // sonra day7 daki o class a giderek extends TestBase yaptik. Hata silindi.
    public WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
// After method dahil ettik
    @AfterMethod
    public void tearDown(){
        driver.close();
    }


}
