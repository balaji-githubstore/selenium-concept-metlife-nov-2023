package com.metlife.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Demo2FBSignUp {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.facebook.com/"); //wait for page load

        //click on create new account
        driver.findElement(By.linkText("Create new account")).click(); //findlement finds the presence of element in 0.5s

        //enter firstname as john
        driver.findElement(By.name("firstname")).sendKeys("john");
        driver.findElement(By.name("lastname")).sendKeys("wick");
        //enter password welcom
        driver.findElement(By.id("password_step_input")).sendKeys("john@gmail.com");

        //20 April 2000
        Select selectDay=new Select(driver.findElement(By.id("day")));
        selectDay.selectByVisibleText("20");

        Select selectMonth=new Select(driver.findElement(By.id("month")));
        //selectMonth.selectByVisibleText("Apr");
//        selectMonth.selectByValue("4");
        selectMonth.selectByIndex(3);
        //year-->2000
        Select selectYear=new Select(driver.findElement(By.id("year")));
        selectYear.selectByVisibleText("2000");

        //click on radio button "Custom"
        driver.findElement(By.xpath("//input[@value='-1']")).click();

        //click on signup


    }
}
