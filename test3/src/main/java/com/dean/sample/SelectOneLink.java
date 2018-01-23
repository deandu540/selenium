package com.dean.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectOneLink {

    public void selectOneLink() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/dean/Downloads/chromedriver");

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://github.com/deandu540/selenium");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@href='/deandu540/selenium/tree/master/test2']")).click();
        Thread.sleep(1000);

//        driver.getPageSource();
        driver.switchTo().defaultContent();
        System.out.println(driver.getPageSource());
        Thread.sleep(5000);

        driver.quit();
    }


}
