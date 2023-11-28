package com.metlife.propdemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Demo1Prop {

    public static void main(String[] args) throws IOException {

        FileInputStream file=new FileInputStream("test-data/data.properties");

        Properties properties=new Properties();
        properties.load(file);

        String val=properties.getProperty("url");
        System.out.println(val);



    }
}
