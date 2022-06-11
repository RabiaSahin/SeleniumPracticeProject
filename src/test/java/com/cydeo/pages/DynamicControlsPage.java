package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicControlsPage {

    public DynamicControlsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //@FindBy(xpath = "//button[.='Remove']
    @FindBy(css = "form#checkbox-example > button")
    public WebElement removeButton;

    @FindBy(css = "div#loading")
    public WebElement loadingBar;

    //@FindBy(css = "input[label='blah']")
    @FindBy(css = "input[type='checkbox']")
    public WebElement checkbox;

    //@FindBy(xpath = "//p[@id='message']")
    @FindBy(css = "p[id='message']") // message is same for 2 test on the ExplicitWaitPractice
    public WebElement message;

    @FindBy(xpath = "//button[.='Enable']") // enable is same for 2 test on the ExplicitWaitPractice
    public WebElement enableButton; // enable means interact with so etkilesim icinde olmak

    @FindBy(css = "input[type='text']")
    public WebElement inputBox;



}