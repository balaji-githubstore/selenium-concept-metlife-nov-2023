package com.metlife.advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Demo6Table {
    public static void main(String[] args) {

//        WebDriver driver=new EdgeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//        driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
//
//        String name1= driver.findElement(By.xpath("//table[@id='example']/tbody/tr[1]/td[2]")).getText();
//        System.out.println(name1);
//
//        driver.quit();
        for(int i=1;i<=10;i++)
        {
            System.out.println("hello "+i+" hello");
            System.out.println("//table[@id='example']/tbody/tr["+i+"]/td[2]");
        }

    }
}
