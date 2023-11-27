package com.metlife.advance2;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Demo1Shadowjs {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(20));

        driver.get(" https://www.royalcaribbean.com/account/signin");

//        driver.findElement(By.linkText("Create an account")).click();

        //shadow root handled using js
        Thread.sleep(5000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector(\"body > app-root > div > app-login-hybris > div > global-login\").shadowRoot.querySelector(\"sign-in-form\").shadowRoot.querySelector(\"section > a\").click()");


        js.executeScript("document.querySelector(\"body > app-root > div > app-login-hybris > div > global-login\").shadowRoot.querySelector(\"create-account\").shadowRoot.querySelector(\"section > form > input-text:nth-child(2)\").shadowRoot.querySelector(\"#input-text-name\").value='bala'");

        //enhanced css selector
        js.executeScript("document.querySelector(\"global-login\").shadowRoot.querySelector(\"create-account\").shadowRoot.querySelector(\"form > input-text:nth-child(2)\").shadowRoot.querySelector(\"#input-text-name\").value='balaji'");

        // driver.findElement(By.name("firstname")).sendKeys("jack");
    }
}
