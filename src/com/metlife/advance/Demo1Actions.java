package com.metlife.advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
//Mouse actions
public class Demo1Actions {
    public static void main(String[] args) {

        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://nasscom.in/about-us/contact-us");

        Actions actions=new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//a[text()='Membership']"))).perform();

        driver.findElement(By.xpath("//a[text()='Members Listing']")).click();


driver.navigate().back();
driver.navigate().forward();
driver.navigate().refresh();
    }
}
