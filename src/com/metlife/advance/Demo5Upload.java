package com.metlife.advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.time.Duration;

public class Demo5Upload {

    public static void main(String[] args) {

////        System.out.println("hel\tlo \n\"balaji\"");
//        System.out.println("C:\\Automation Session\\SeleniumSample.pdf");
        File file =new File("files/seleniumsample.pdf");
        String absPath=file.getAbsolutePath();
        System.out.println(absPath);

        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://smallpdf.com/pdf-to-word");

        driver.findElement(By.xpath("//input[@type='file']"))
                .sendKeys(absPath);
    }
}
