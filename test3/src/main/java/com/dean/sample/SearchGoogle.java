package com.dean.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchGoogle {

    public void typeWord() throws InterruptedException {

        //  Add configuration for chromedriver position in OS
        System.setProperty("webdriver.chrome.driver", "/Users/dean/Downloads/chromedriver");

        //  Create WebDriver
        ChromeDriver driver = new ChromeDriver();

        //  Open Google in browser
        driver.get("https://www.google.com.tw");
        Thread.sleep(1000);
        driver.findElement(By.id("lst-ib")).sendKeys("Hello world!!");
        Thread.sleep(1000);
        driver.findElement(By.name("btnK")).click();

        Thread.sleep(1000);

        driver.quit();
    }



}
