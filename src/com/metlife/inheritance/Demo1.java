package com.metlife.inheritance;

class Father
{
    public int fAge=60;
    public Father(String fname)
    {
        System.out.println("f constructor");
    }
    public void fStyle()
    {
        System.out.println("f style");
    }
}
class Son extends Father
{
    public int sAge=20;
    public Son(String fName,String sName)
    {
        super(fName);
        System.out.println("S Constructor");
    }
    public void sStyle()
    {
        System.out.println(super.fAge);
        super.fStyle();
        System.out.println("s style");
    }
}



public class Demo1 {
    public static void main(String[] args) {

        Son s=new Son("ja","fe");
        System.out.println(s.fAge);
        System.out.println(s.sAge);
        s.fStyle();
        s.sStyle();

    }
}
