package com.metlife.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.ArrayList;

public class Demo2Citi {
    public static void main(String[] args) {
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.online.citibank.co.in/");

        //presence of element
        if(driver.findElements(By.xpath("//a[@class='newclose']")).size()>0)
        {
            //visiblity of element
            if(driver.findElement(By.xpath("//a[@class='newclose']")).isDisplayed())
            {
                driver.findElement(By.xpath("//a[@class='newclose']")).click();
            }

        }


        driver.findElement(By.xpath("//a[@class='newclose2']")).click();

        driver.findElement(By.xpath("//span[text()='Login']")).click();

        //switch to 2nd tab
        ArrayList<String> windows=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(1));

        driver.findElement(By.xpath("//div[contains(text(),'Forgot User ID')]")).click();

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

        /* Important - Please complete it now
 1. Navigate onto https://www.online.citibank.co.in/
2. Close if any pop up comes
3. Click on Login
4. Click on Forgot User ID?
5. Choose Credit Card

6. Enter credit card number as 4545 5656 8887 9998
7. Enter cvv number
8. Enter date as “14/04/2022”
9. Click on Proceed
10. Get the text and print it “Please accept Terms and Conditions”
         */
    }
}
