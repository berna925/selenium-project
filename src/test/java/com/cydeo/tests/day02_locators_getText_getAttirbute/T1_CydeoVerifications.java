package com.cydeo.tests.day02_locators_getText_getAttirbute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerifications {

    public static void main(String[] args) {

        //TC #1: Cydeo practice tool verifications
        //1. Open Chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        //2. Go to https://practice.cydeo.com

        driver.navigate().to("https://practice.cydeo.com");


        //3. Verify URL contains
        //Expected: cydeo
        String expectedInURL = "cydeo";
        String actualURL = driver.getCurrentUrl();

        if (actualURL.contains(expectedInURL)) {
            System.out.print("URL verification PASSED!!!");

        } else {
            System.out.println("URL verification FAILED!!!");
        }

        //4. Verify title:
        //Expected: Practice

        String expectedInTitle = "Practice";
        String actualTitle = driver.getTitle(); // --> driver return "Practice"

        if (actualTitle.equals(expectedInTitle)) {
            System.out.println("Title verification is PASSED!!!");

        } else {
            System.out.println("Title verification FAILED");

        }


        //close the browser
        driver.close();
    }
}
