package com.cydeo.tests.day02_locators_getText_getAttirbute.ExtraTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeCydeo_ClassLocatorPractice {
    public static void main(String[] args) {

        //TC #4: Practice Cydeo – Class locator practice
        //1- Open a chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

       // 2- Go to: https://practice.cydeo.com/inputs
        driver.get("https://practice.cydeo.com/inputs");
        //3- Click to “Home” link
        //Locating the "Home" link element
       // WebElement homeInput = driver.findElement(By.className("Home"));
        WebElement homeLink = driver.findElement(By.className("nav-link"));
       //click to link
        //Thread.sleep(2000);

        homeLink.click();

       // 4- Verify title is as expected:
       // Expected: Practice
       // PS: Locate “Home” link using “className” locator

        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        if (expectedTitle.equals(expectedTitle)) {
            System.out.println("Title verification PADDED!");
        }else{
            System.out.println("Title verification FAILED!");
        }

    }
}
