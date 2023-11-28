package com.metlife.advance2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Demo2ShadowSelenium4 {
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


    //    js.executeScript("document.querySelector(\"body > app-root > div > app-login-hybris > div > global-login\").shadowRoot.querySelector(\"create-account\").shadowRoot.querySelector(\"section > form > input-text:nth-child(2)\").shadowRoot.querySelector(\"#input-text-name\").value='bala'");

        //enhanced css selector
       // js.executeScript("document.querySelector(\"global-login\").shadowRoot.querySelector(\"create-account\").shadowRoot.querySelector(\"form > input-text:nth-child(2)\").shadowRoot.querySelector(\"#input-text-name\").value='balaji'");

        // driver.findElement(By.name("firstname")).sendKeys("jack");

        SearchContext shadowRoot1= driver.findElement(By.cssSelector("global-login")).getShadowRoot();
        SearchContext shadowRoot2= shadowRoot1.findElement(By.cssSelector("create-account")).getShadowRoot();


        //firstname
        SearchContext shadowRoot3=shadowRoot2.findElement(By.cssSelector("form > input-text:nth-child(2)")).getShadowRoot();
        shadowRoot3.findElement(By.cssSelector("#input-text-name")).sendKeys("jack");

        //lastname
        shadowRoot3=shadowRoot2.findElement(By.cssSelector("form > input-text:nth-child(3)")).getShadowRoot();
        shadowRoot3.findElement(By.cssSelector("#input-text-lastName")).sendKeys("wick");

        //date
        shadowRoot3=shadowRoot2.findElement(By.cssSelector("form > input-date:nth-child(4)")).getShadowRoot();

        Select selectMonth=new Select(shadowRoot3.findElement(By.cssSelector("#input-select-month")));
        selectMonth.selectByVisibleText("June");

        Select selectDay=new Select(shadowRoot3.findElement(By.cssSelector("#input-select-day")));
        selectDay.selectByVisibleText("20");

        shadowRoot3.findElement(By.cssSelector("#input-text-year")).sendKeys("2000");


        //country
        shadowRoot3=shadowRoot2.findElement(By.cssSelector("form > input-select:nth-child(5)")).getShadowRoot();
        Select selectCounty=new Select(shadowRoot3.findElement(By.cssSelector("#input-select-country")));
        selectCounty.selectByVisibleText("United States of America");


    }
}
