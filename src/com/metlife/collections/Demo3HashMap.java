package com.metlife.collections;

import java.util.HashMap;

public class Demo3HashMap {

    public static void main(String[] args) {


        HashMap<Integer,Object> map=new HashMap<>();

        map.put(1,"red");
        map.put(2,"green");
        map.put(3,"yellow");

        map.put(2,"black");
        map.put(4,34.4);

        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map.size());
    }
}
