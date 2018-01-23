package com.dean.sample;

import org.openqa.selenium.chrome.ChromeDriver;

public class CommonUsage {

    public void SwitchFrame() {

        // 不管 frame or frameset
        ChromeDriver driver = new ChromeDriver();

        driver.switchTo().frame("");


    }

}
