package com.metlife.advance2;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class Demo4FluentWait {
    public static void main(String[] args) {

        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://netbanking.hdfcbank.com/netbanking/IpinResetUsingOTP.htm");
//
//        //click on Go
//        driver.findElement(By.xpath("//img[@alt='Go']")).click();
//
//        //wait for alert present - explicit wait
//        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
//        wait.until(ExpectedConditions.alertIsPresent());
//
//        String actualAlertText= driver.switchTo().alert().getText();
//        System.out.println(actualAlertText);
        FluentWait<WebDriver> wait=new FluentWait<>(driver);
//        wait.pollingEvery(Duration.ofSeconds(1));
        wait.withTimeout(Duration.ofSeconds(20));
        wait.ignoring(Exception.class);

        String title=wait.until(x->x.getTitle());

        wait.until(x->x.findElement(By.xpath("//img[@alt='Go']"))).click();

        String actualAlertText= wait.until(x->x.switchTo().alert()).getText();
        System.out.println(actualAlertText);

        wait.until(t->t.switchTo().alert()).accept();
    }
}
