package com.metlife.datatypes;

import java.util.Locale;

public class Demo1 {

    public static void main(String[] args) {

        byte a=100;  //a is reserved for byte with size 8 bits

        short b=100; //16 bits

        int c=100; //32 bits

        //byte --> 1000 students * 8 bits = 8000 bits of memory
        //int --> 1000 students * 32 bits = 32000 bits of memory
        long d=999983888888L; //64 bits

        float e=1.123456789f; //32 bits

        double f=1.123456789; //64 bits

        char letter=' '; //16 bits
int z=0;//32 bits
        boolean check=true;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println(e);
        System.out.println(f);

       double result= c+f;
        System.out.println(result);

        int radius=10;

        //calculate area of circle and print it
        //3.14

        double result1= 3.14*radius*radius;
        System.out.println("The output is "+result1);

        String myName="balaji"; //6*16 bits of memory
        System.out.println(myName);

        System.out.println(myName.length());

        System.out.println(myName.toUpperCase());
        System.out.println(myName.charAt(0));
    }

}
