package com.metlife.advance;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Demo3ActionsKeys {
    public static void main(String[] args) {

        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://google.com");

        Actions actions=new Actions(driver);
        actions.keyDown(Keys.SHIFT).sendKeys("hello").keyUp(Keys.SHIFT)
                .pause(800).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).pause(800).sendKeys(Keys.ENTER)
                .perform();
    }
}
