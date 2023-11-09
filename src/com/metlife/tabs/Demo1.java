package com.metlife.tabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Demo1 {
    public static void main(String[] args) {

        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.db4free.net/");

        //click on phpMyAdmin »
        ////b[contains(text(),'phpMyAdm')]
        driver.findElement(By.partialLinkText("phpMyAdmin")).click();

        System.out.println(driver.getWindowHandles());

        Set<String> lists= driver.getWindowHandles();


        List<String> windows=new ArrayList<String>(driver.getWindowHandles());

        System.out.println(windows.get(0));
        System.out.println(windows.get(1));




    }
}
