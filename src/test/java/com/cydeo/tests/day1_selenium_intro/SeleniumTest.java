package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) {

        // 1- Setting up the web driver manager
        // We create our "Browser Driver". This is web driver manager not selenium
        WebDriverManager.chromedriver().setup();

        // 2- Create instance of the chrome driver (open the browser)
        // our first selenium line comes from selenium library
        WebDriver driver = new ChromeDriver();

        // 3- Test if driver is working as expected (selenium method)
        driver.get("https://www.facebook.com");

    }
}
