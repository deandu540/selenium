package com.dean.sample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CommonUsage {

    /**
     * 切換 frame
     */
    public void SwitchFrame() {

        // 不管 frame or frameset
        ChromeDriver driver = new ChromeDriver();

        driver.switchTo().frame("");

    }

    /**
     * 選取 table 物件
     */
    public void selectTable() {
        ChromeDriver driver = new ChromeDriver();

        WebElement webTable = driver.findElement(By.id("table"));
        List<WebElement> tableRows = webTable.findElements(By.xpath("//*[@id='table']/tbody/tr"));
        for (int i = 0; i < tableRows.size(); i++) {
            List<WebElement> tableCols = tableRows.get(i).findElements(By.xpath("td"));
            for (WebElement col : tableCols) {
                System.out.println(col.getText());
            }
        }

    }

    /**
     * 選取下拉式選單
     */
    public void selectDropDownList() {

        ChromeDriver driver = new ChromeDriver();
        Select select = new Select(driver.findElement(By.id("select")));

        select.selectByIndex(1);
        select.selectByValue("hahaha");


    }

    /**
     * 通常是 button , type = upload
     */
    public void uploadFile() {
        ChromeDriver driver = new ChromeDriver();
        driver.findElement(By.id("btn")).sendKeys("/file/file1");
    }

    /**
     * 等待彈出的 alert or dialog 的操作方式
     */
    public void waitForAlertOrDialog() {
        ChromeDriver driver = new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(driver, 2);
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        alert.accept();

    }

    /**
     * 跳到開新分頁的網頁
     */
    public void changeWebPage() {
        ChromeDriver driver = new ChromeDriver();

        String originWebPage = driver.getWindowHandle();
        String subWebPage = "";

        // 一般來說 原始網頁在list的第一個, 越晚開的在越後面
        for (String sn : driver.getWindowHandles()) {
            System.out.println(sn);
            subWebPage = sn;
        }

        driver.switchTo().window(subWebPage);
        driver.switchTo().defaultContent();

        // new page

    }



}
