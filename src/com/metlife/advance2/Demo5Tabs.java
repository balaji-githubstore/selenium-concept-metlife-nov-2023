package com.metlife.advance2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class Demo5Tabs {
    public static void main(String[] args) {

        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://netbanking.hdfcbank.com/netbanking/IpinResetUsingOTP.htm");
//
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("http://gmail.com");


        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("http://google.com");
    }
}
