package com.metlife.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2LaunchBrowser {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        WebDriver driver1=new ChromeDriver();

        driver1.get("http://google.com");

        driver.get("http://gmail.com");
        driver.quit();
    }
}
