package com.metlife.formulae;

public class Area {
    //accessmodifier static returntype methodname(parameters)
    public double areaOfCircle(int r) {
        return 3.14 * r * r;
    }

    public static double areaOfRectangle(double length, double width) {
        return length * width;
    }

    public static double areaOfTriangle(double base, double height) {
        double area = (base * height) / 2;
        return area;
    }

    public static double areaOfSquare(double side) {
        return side * side;
    }

    public static double areaOfTrapezium(double base1, double base2, double height) {
        return (base1 + base2) * height / 2;
    }

    public static String getAuthorName()
    {
        return "Balaji Dinakaran";
    }

    public void quit()
    {

    }
}
