package com.metlife.frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Demo1Hdfc {
    public static void main(String[] args) {

        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://netbanking.hdfcbank.com/");


        //WebElement
        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='login_page']")));

        //index
//        driver.switchTo().frame(0);

//        name or id as string
//        driver.switchTo().frame("login_page");

        //enter customerid as john123
        driver.findElement(By.name("fldLoginUserId")).sendKeys("john123");
        //click on continue
        driver.findElement(By.linkText("CONTINUE")).click();

        //switch To main html
        driver.switchTo().defaultContent();




    }
}
