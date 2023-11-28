package com.metlife.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1LaunchBrowser {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

//        driver=new ChromeDriver();
//        driver=new FirefoxDriver();


        driver.get("https://facebook.com/");

        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);

        //get the url and print
        //get the pageSource and print
        String actualUrl = driver.getCurrentUrl();
        System.out.println(actualUrl);

        String pageSource = driver.getPageSource();
        System.out.println(pageSource);

        driver.quit();
    }
}
