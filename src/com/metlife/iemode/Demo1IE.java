package com.metlife.iemode;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

import java.time.Duration;

public class Demo1IE {
    public static void main(String[] args) {

        InternetExplorerOptions options=new InternetExplorerOptions();
        options.ignoreZoomSettings();
        options.attachToEdgeChrome();
        options.withInitialBrowserUrl("https://github.com/login");
        options.requireWindowFocus();

        //give below code only if edge path not detected
//        options.withEdgeExecutablePath("C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe");

        WebDriver driver=new InternetExplorerDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.name("login")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("admin123");

        //Javascript execution on ie mode
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("document.querySelector('#password').value='hello123';");

        System.out.println(driver.getTitle());

        String ps=driver.getPageSource();


        driver.quit();


    }
}
