package com.metlife.collections;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {

        List<String> colors=new ArrayList<String>();

        colors.add("red");
        colors.add("blue");
        colors.add("black");
        colors.add("blue");

        System.out.println(colors);
        System.out.println(colors.size());
        System.out.println(colors.get(0));

        colors.remove("blue");
        System.out.println(colors);

    }
}
