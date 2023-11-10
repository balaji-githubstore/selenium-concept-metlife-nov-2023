package com.metlife.advance;

import com.metlife.assignments.Demo2Citi;
import org.openqa.selenium.*;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;

public class Demo9CitiJS {
    public static void main(String[] args) {

        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.citibank.co.in/ssjsps/forgetuseridmidssi.jsp");

        driver.findElement(By.linkText("select your product type")).click();
        driver.findElement(By.linkText("Credit Card")).click();

        driver.findElement(By.id("citiCard1")).sendKeys("3344");
        driver.findElement(By.cssSelector("#citiCard2")).sendKeys("3332");
        driver.findElement(By.cssSelector("#citiCard3")).sendKeys("3332");
        driver.findElement(By.cssSelector("#citiCard4")).sendKeys("3332");

        driver.findElement(By.cssSelector("input[name='CCVNO']")).sendKeys("232");

        //approach 1 - not working on this page
        //driver.findElement(By.id("bill-date-long")).sendKeys("14/04/2022");

        //approach 2 - try automate the calendar
//        driver.findElement(By.id("bill-date-long")).click();
//        Select selectYear=new Select(driver.findElement(By.cssSelector("[data-handler='selectYear']")));
//        selectYear.selectByVisibleText("2022");
//        Select selectMonth=new Select(driver.findElement(By.xpath("//select[@data-handler='selectYear']")));
//        selectMonth.selectByVisibleText("Apr");
//        driver.findElement(By.linkText("15")).click();

        //approach 3 - js
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector('#bill-date-long').value='14/04/2022'");

        TakesScreenshot ts = (TakesScreenshot) driver;
        File file= ts.getScreenshotAs(OutputType.FILE);
        file.renameTo(new File("error.png"));


    }
}
