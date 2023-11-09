package com.metlife.advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Demo2Actions {
    public static void main(String[] args) {


        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://nasscom.in/about-us/contact-us");

        Actions actions=new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//a[text()='Membership']"))).perform();

        //mousehover on Become a Member //complete this
        actions.moveToElement(driver.findElement(By.xpath("//a[text()='Become a Member']"))).perform();

        driver.findElement(By.xpath("//a[text()='Membership Benefits']")).click();

        //click on CLICK to apply online
        //linktext-->should follow font based on UI
        //xpath -- follow font based on page source
        driver.findElement(By.xpath("//a[text()='Click to Apply Online']")).click();

        //later complete the form fill

    }
}
