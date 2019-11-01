package com.xyz.java8.lambda;

import java.util.HashMap;
import java.util.Map;

public class ExampleMap {
    private static Map<String,Integer> map=new HashMap<>();

    static {
        map.put("aa",11);
        map.put("bb",22);
        map.put("cc",33);
        map.put("dd",44);
    }
    public  static void main(String [] args)
    {
        //lomdba
            map.forEach((x,y)->System.out.println(x+"   "+y));
    }
}
