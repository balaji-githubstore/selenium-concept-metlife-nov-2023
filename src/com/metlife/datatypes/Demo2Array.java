package com.metlife.datatypes;

public class Demo2Array {

    public static void main(String[] args) {

        //10,20,30,40,50

        int[] numbers=new int[5]; //5*32 bits

        numbers[0]=10;
        //numbers[1]=20;
        numbers[2]=30;
        numbers[3]=40;
        numbers[4]=50;

        System.out.println(numbers);
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);

        double[] arr1=new double[2]; //2*64 bits
       // arr1[0]=10.2;
        arr1[1]=20;

        System.out.println(arr1);
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);

    //create an array to store red,green,yellow
        String[] colors=new String[3]; //
        //colors[0]="red";
        colors[1]="green";
        colors[2]="yellow";

        //colors=new String[5];

        System.out.println(colors);
        System.out.println(colors[0]);
        System.out.println(colors[1]);
        System.out.println(colors[2]);

        int[] arr2={12,4,65,44};

        System.out.println(arr2[2]);

    }
}
