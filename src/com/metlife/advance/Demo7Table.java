package com.metlife.advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.List;

public class Demo7Table {
    public static void main(String[] args) {

        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");

//for loop for page
        List<WebElement> elements= driver.findElements(By.xpath("//table[@id='example']/tbody/tr"));
        System.out.println(elements.size());
        for(int i=1;i<=elements.size();i++)
        {
            String name= driver.findElement(By.xpath("//table[@id='example']/tbody/tr["+i+"]/td[2]")).getText();
            System.out.println(name);
            //click on the checkbox when the name is Brenden Wagner
            if(name.equals("Brenden Wagner"))
            {
                //click on checkbox
                driver.findElement(By.xpath("//table[@id='example']/tbody/tr["+i+"]/td[1]")).click();
                break;
            }
        }

        driver.quit();


    }
}
