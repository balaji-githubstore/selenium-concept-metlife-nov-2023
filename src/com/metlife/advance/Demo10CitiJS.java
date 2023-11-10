package com.metlife.advance;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.time.Duration;

public class Demo10CitiJS {
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

        //approach 3 - js and WebElement
        WebElement ele1=driver.findElement(By.xpath("//input[@id='bill-date-long']"));
        js.executeScript("arguments[0].value='14/04/2022';",ele1);

//        WebElement ele2=driver.findElement(By.xpath("//input[@id='bill-date-long']"));
//        js.executeScript("arguments[0].value='14/04/2022';",ele2);

//        js.executeScript("arguments[0].click();arguments[1].click();",ele1,ele2);

//        WebElement ele1=driver.findElement(By.xpath("//input[@id='bill-date-long']"));
//        js.executeScript("arguments[0].click();",ele1);


    }
}
