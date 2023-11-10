package com.metlife.advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Demo4Upload {

    public static void main(String[] args) {
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://smallpdf.com/pdf-to-word");

        driver.findElement(By.xpath("//input[@type='file']"))
                .sendKeys("C:\\Automation Session\\SeleniumSample.pdf");
    }
}
