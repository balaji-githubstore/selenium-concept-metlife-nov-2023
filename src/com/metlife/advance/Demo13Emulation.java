package com.metlife.advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.time.Duration;
import java.util.HashMap;

public class Demo13Emulation {
    public static void main(String[] args) throws InterruptedException {


        HashMap<String,String> map=new HashMap<>();
        map.put("deviceName","Nexus 5");

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("mobileEmulation", map);
//        options.setAcceptInsecureCerts(true);
//        options.addArguments("--Headless");

        File file =new File("files/seleniumsample.pdf");
        String absPath=file.getAbsolutePath();
        System.out.println(absPath);

        WebDriver driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.get("https://www.ilovepdf.com/pdf_to_word");

        driver.findElement(By.xpath("//input[@type='file']"))
                .sendKeys(absPath);

    driver.findElement(By.id("processTaskTextBtn")).click();
    driver.findElement(By.partialLinkText("Download WORD")).click();
    }
}
