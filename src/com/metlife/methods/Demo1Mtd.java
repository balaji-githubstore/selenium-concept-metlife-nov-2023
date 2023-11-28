package com.metlife.methods;


import com.metlife.formulae.Area;

public class Demo1Mtd {

    public static void main(String[] args) {
        int radius=10;

        Area obj=new Area();

        //calling the method
        double output= obj.areaOfCircle(10);
        System.out.println(output);

        output= obj.areaOfCircle(20);
        System.out.println(output);

        System.out.println(obj.areaOfCircle(30));

        double res=Area.areaOfRectangle(10.2,10.2);
        System.out.println(res);

        double res1= Area.areaOfTriangle(25,1);
        System.out.println(res1);

        System.out.println(Area.areaOfSquare(4));

       String name= Area.getAuthorName();
        System.out.println(name);

        obj.quit();
    }
}
