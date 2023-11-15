package com.metlife.assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Demo3OpenEMR {

    public static void main(String[] args) {
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://demo.openemr.io/b/openemr/index.php");

//        1. Navigate onto http://demo.openemr.io/b/openemr/
//
//        2. Update username as admin
//
//        3. Update password as pass
//
//        4. Select language as English (Indian)
//
//                5. Click on the login button
//
//        6. Click on Patient à Click New Search
//
//        7. Add the first name

    }
}
