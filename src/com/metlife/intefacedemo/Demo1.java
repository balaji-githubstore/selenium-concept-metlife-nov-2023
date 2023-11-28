package com.metlife.intefacedemo;

interface WebDriver1
{
    public abstract void get(String url);
    void quit();
    void close();
    String getTitle();
}
class ChromeDriver1 implements WebDriver1
{
    public ChromeDriver1()
    {
        System.out.println("Launch Chrome");
    }
    public void get(String url) {

    }

    @Override
    public void quit() {

    }

    @Override
    public void close() {

    }

    @Override
    public String getTitle() {
        return null;
    }


}
class EdgeDriver1 implements WebDriver1 {
    public EdgeDriver1()
    {
        System.out.println("Launch Edge");
    }
    @Override
    public void get(String url) {

    }

    @Override
    public void quit() {

    }

    @Override
    public void close() {

    }

    @Override
    public String getTitle() {
        return null;
    }
}

public class Demo1 {
    public static void main(String[] args) {

        String b="edge";
        WebDriver1 driver=null;
        if(b.equalsIgnoreCase("edge"))
        {
            driver=new EdgeDriver1();
        }
        else {
            driver=new ChromeDriver1(); //Runtime polymorphism//method overriding
        }

//        driver=new EdgeDriver1();
        //method to be called is resolved during the runtime
        driver.get("http://google.com");
        driver.quit();

        driver.getTitle();
    }
}
