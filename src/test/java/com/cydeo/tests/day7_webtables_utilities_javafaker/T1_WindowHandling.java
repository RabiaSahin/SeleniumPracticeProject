package com.cydeo.tests.day7_webtables_utilities_javafaker;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_WindowHandling {

    public WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void window_handling_test(){
        //2. Go to: https://www.amazon.com
        driver.get("https://www.amazon.com");

        //3. Copy-paste the lines from below into your class
        // they are opening the new browser and getting us these links(new pages)
        // down casting
        ((JavascriptExecutor) driver).executeScript("window.open('https://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://facebook.com','_blank');");

    /*    //4. Create a logic to switch to the tab where Etsy.com is open

      //  for (String each : driver.getWindowHandles()) {
     //   }

        Set<String> allWindowsHandles = driver.getWindowHandles(); // yukardaki for each ile ayni islev sadece daha clear

        for (String each : allWindowsHandles) {

            System.out.println("Current URL: " + driver.getCurrentUrl());
        }
        // yukardaki islemler ile butun acilan sayfalarin url adreslerini yazdi.

        if(driver.getCurrentUrl().contains("etsy")){
            break;
        } // etsy acildiginda orda dur diyerek break ile cikisi saglayip etsy url de kalabiliriz
        // boylece sayfalar acildiginda en son etsy de kaliyor current olarak
        // ama console etsy de durana kadar gezdigi tum sayfalari yine yazdi

        // 5. Assert:Title contains "Etsy"

        String actualTitle = driver.getTitle();
        String expectedInTitle = "Etsy";

        Assert.assertTrue(actualTitle.contains(expectedInTitle));

        BrowserUtils.switchWindowAndVerify(driver, "etsy", "Etsy"); */

        //4. Create a logic to switch to the tab where Etsy.com is open

        // yukarida yaptigimiz butun kodlari utility nin altinda browserUtils classina yapistirdik.
        // BrowserUtils classta olusturdugumuz methodu kullanarak tek satirda Etsy yi belirledik.

        BrowserUtils.switchWindowAndVerify(driver, "etsy", "Etsy");

    }
}