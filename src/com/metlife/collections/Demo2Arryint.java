package com.metlife.collections;

import java.util.ArrayList;

public class Demo2Arryint {
    public static void main(String[] args) {

        ArrayList<Integer> colors=new ArrayList<Integer>();

        colors.add(23);
        colors.add(44);
//        colors.add("black");
//        colors.add("blue");

        System.out.println(colors);
        System.out.println(colors.size());
        System.out.println(colors.get(0));

//        colors.remove("blue");
        System.out.println(colors);

    }
}
