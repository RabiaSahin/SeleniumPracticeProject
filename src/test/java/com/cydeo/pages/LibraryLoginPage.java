package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryLoginPage {

    //#1- initialize the driver instance and object of the class
    public LibraryLoginPage(){  // constructor // real work da belli bir loginPage olacagi icin library diye belirtmeye gerek olmaz
        // we are going to be adding another line, we are colling a method coming from the selenium,
        // it allows us the implement PageFactory
        /*initElements method will create connection in between the current
        driver session (instance) and the object of the current class.
         */
        PageFactory.initElements(Driver.getDriver(), this);
    } // if we use this keyword in this class this is referring to the object og this class itself

    /*now every time I create an object of this class in another package or class in the same project
         the first is that my constructor is coming here and calling this line.
         this line doing basically, initializes my driving object and the object of this class
         it just introduces them together,
         now the object of this class is aware of the current session id in my current driver's instance*/

    //#2- use @FindBy annotation to locate web elements

    @FindBy(xpath = "//input[@id='inputEmail']")
    public WebElement inputUsername;

    @FindBy(id = "inputPassword")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[.='Sign in']")
    public WebElement signInButton;

    @FindBy(xpath = "//div[.='This field is required.']/div")
    public WebElement fieldRequiredErrorMessage;

    @FindBy(xpath = "//div[.='Please enter a valid email address.']/div")
    public WebElement enterValidEmailErrorMessage;

    @FindBy(xpath = "//div[.='Sorry, Wrong Email or Password']")
    public WebElement wrongEmailOrPasswordErrorMessage;



}