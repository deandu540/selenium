package com.dean.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectAnotherBranchFile {

    public void selectAnotherBranchFile() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/dean/Downloads/chromedriver");

        ChromeDriver driver = new ChromeDriver();

        // 連到 github
        driver.get("https://github.com/deandu540/selenium");
        Thread.sleep(1000);

        // 點選 test2 folder
        driver.findElement(By.xpath("//a[@href='/deandu540/selenium/tree/master/test2']")).click();
        Thread.sleep(1000);

        // 點開 README 檔案
        driver.findElement(By.xpath("//a[@href='/deandu540/selenium/blob/master/test2/README.md']")).click();
        Thread.sleep(1000);

        // 輸入鍵盤動作
        String sendHotKey = Keys.chord("w");
        driver.findElement(By.tagName("html")).sendKeys(sendHotKey);
        Thread.sleep(1000);

        // click branch test3_demo
        driver.findElement(By.xpath("//a[@href='/deandu540/selenium/blob/test3_demo/test2/README.md']")).click();
        Thread.sleep(1000);

        Thread.sleep(5000);

        driver.quit();
    }


}
