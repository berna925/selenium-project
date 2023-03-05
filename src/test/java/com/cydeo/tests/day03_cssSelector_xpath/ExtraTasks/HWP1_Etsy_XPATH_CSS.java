package com.cydeo.tests.day03_cssSelector_xpath.ExtraTasks;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HWP1 {
    public static void main(String[] args) {
        // HWP #1: Etsy Title Verification
        // 1. Open Chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        // 2. Go to https://www.etsy.com
        driver.get("https://www.etsy.com");
        // 3. Search for “wooden spoon”
        // tag[@attribute='value']
        // input[@type='text']
        WebElement searchBox = driver.findElement(By.xpath("//input[@type='text']"));

        searchBox.sendKeys("wooden spoon" + Keys.ENTER);

        // 4. Verify title:
        //Expected: “Wooden spoon - Etsy”

        String expectedTitle = "Wooden spoon - Etsy CA";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title verification passed!");
        } else {
            System.out.println("Title verification FAILED!!!");

            System.out.println("actualTitle = " + actualTitle);
            System.out.println("expectedTitle = " + expectedTitle);

        }
    }
}

