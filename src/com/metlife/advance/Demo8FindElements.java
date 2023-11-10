package com.metlife.advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.List;

public class Demo8FindElements {
    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://google.com");

        List<WebElement> elements = driver.findElements(By.xpath("//z"));
        System.out.println(elements.size());

//        elements.get(1).click();
//        System.out.println(elements.get(0).getText());
//        System.out.println(elements.get(0).getAttribute("href"));
        for (int i = 0; i < elements.size(); i++) {
            System.out.println(elements.get(i).getText());
            System.out.println(elements.get(i).getAttribute("href"));
        }
    }
}
