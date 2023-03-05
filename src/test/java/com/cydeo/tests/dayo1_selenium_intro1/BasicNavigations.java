package com.cydeo.tests.dayo1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {


    public static void main(String[] args) throws InterruptedException {

        //Setup browser driver
        WebDriverManager.chromedriver().setup();

        //Create instance of Chrome browser
        WebDriver driver = new ChromeDriver();


        //Go to tesla.com
        driver.get("https://www.tesla.com");

        //Get title of the page
        System.out.println("driver.getTitle() = " + driver.getTitle());

        //Use navigate back() to go back
        driver.navigate().back();

        //Stop execution for seconds
        Thread.sleep(3000);

        //User navigate forward() to go forward
        driver.navigate().forward();

        //Stop execution for seconds
        Thread.sleep(300);

        //User refreshes the page using navigate. refresh();
        driver.navigate().refresh();

        //Stop execution for seconds
        Thread.sleep(300);


        //navigate to google.com using navigate().to();
        driver.navigate().to("https://www.google.com");



        //Get title of the page
      //  System.out.println("driver.getTitle() = " + driver.getTitle());

        String currentTitle = driver.getTitle();
        System.out.println("currentTitle ="+ currentTitle);


    }
}