package com.metlife.tabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.ArrayList;

public class Demo2 {
    public static void main(String[] args) {

        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.db4free.net/");

        //click on phpMyAdmin »
        ////b[contains(text(),'phpMyAdm')]
        driver.findElement(By.partialLinkText("phpMyAdmin")).click();

        //switch to 2nd tab
        ArrayList<String> windows=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(1));

        driver.findElement(By.id("input_username")).sendKeys("admin");
        //enter password as admin123
        driver.findElement(By.id("input_password")).sendKeys("admin12");
        //click on login
        driver.findElement(By.id("input_go")).click();

        driver.close(); //see which tab is closed

        //switch to 1st tab
        driver.switchTo().window(windows.get(0));
        System.out.println(driver.getTitle()); //check this

        driver.quit();

    }
}
