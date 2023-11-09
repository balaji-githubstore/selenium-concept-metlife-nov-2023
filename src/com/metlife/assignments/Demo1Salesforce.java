package com.metlife.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Demo1Salesforce {

    public static void main(String[] args) {
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");

        //firstname
        driver.findElement(By.name("UserFirstName")).sendKeys("henry");
        //lastname
        //input[contains(@id,'UserLast')]
        driver.findElement(By.xpath("//input[contains(@id,'UserLast')]")).sendKeys("ken");

        //jobtitle as IT Manager
        Select selectJobTitle=new Select(driver.findElement(By.name("UserTitle")));
        selectJobTitle.selectByVisibleText("IT Manager");

        Select selectCountry=new Select(driver.findElement(By.name("CompanyCountry")));
//        selectCountry.selectByVisibleText("United Kingdom");
        selectCountry.selectByValue("GB");

        driver.findElement(By.name("CompanyName")).sendKeys("metlife");
        //click on checkbox
        driver.findElement(By.xpath("//div[@class='checkbox-ui']")).click();
        driver.findElement(By.name("start my free trial")).click();

        String actualHeaderText=driver.findElement(By.xpath("//span[contains(text(),'free tr')]")).getText();
        System.out.println(actualHeaderText);

        String actualError=driver.findElement(By.xpath("//span[contains(text(),'valid phone')]")).getText();
        System.out.println(actualError);
    }
}
