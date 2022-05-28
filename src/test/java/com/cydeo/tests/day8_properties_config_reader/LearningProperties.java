package com.cydeo.tests.day8_properties_config_reader;

import org.testng.annotations.Test;

public class LearningProperties {

    @Test
    public void java_properties_reading_test(){
        //key = value
        //os.name = Mac OS X
        //user.name = cybertekchicago-1
        System.out.println("System.getProperty(\"os.name\") = " + System.getProperty("os.name"));
        // it shows us whatever our current operating system.
        // System.getProperty("os.name") = Windows 10
        System.out.println("System.getProperty(\"user.name\") = " + System.getProperty("user.name"));
        // it shows us whatever our current username.
        // System.getProperty("user.name") = rabia

    }

}