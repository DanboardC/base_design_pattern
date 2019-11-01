package com.xyz.java8.lambda;

import java.util.ArrayList;
import java.util.List;

public class ExampleList {
    private static List<String> list=new ArrayList<>();

        static {
            list.add("aaa");
            list.add("bbb");
            list.add("ccc");
            list.add("ddd");
        }

        public  static  void main(String [] args){
            //lambda写法
            list.forEach(a->System.out.println(a));
            System.out.println("--------------------");
            list.forEach(i->{
                if (i.equals("aaa")) {
                    System.out.println("aa  aa  aa  aa");
                }
            });
        }

}
