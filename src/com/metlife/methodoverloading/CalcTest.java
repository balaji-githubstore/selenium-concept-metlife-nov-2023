package com.metlife.methodoverloading;

public class CalcTest {
    public static void main(String[] args) {


        Calculator cal=new Calculator();
        cal.add(10.2,10);

        System.out.println( Math.max(10,10.2));
        System.out.println(Math.PI);
        System.out.println(Math.pow(2,3));

    }
}
