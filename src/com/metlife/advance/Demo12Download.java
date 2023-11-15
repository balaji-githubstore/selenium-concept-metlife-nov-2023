package com.metlife.advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class Demo12Download {
    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();

        HashMap<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("download.default_directory", "C:\\Automation Session\\SeleniumProject\\files");

        options.setExperimentalOption("prefs", prefs);
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
