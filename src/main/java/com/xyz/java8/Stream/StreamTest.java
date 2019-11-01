package com.xyz.java8.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String [] args) {
        //filter方法  这是一个Stream的过滤转换，此方法会生成一个新的流，其中包含符合某个特定条件的所有元素。
//        List<String> list = Arrays.asList("aaa", "bbb", "", "ccc", "ddd", "eee");
//
//        List<String> fList = list
//                .stream()
//                .filter(a -> !a.isEmpty())
//                .collect(Collectors.toList());
//
//        fList.forEach(a -> System.out.println(a));









//        //map方法指对一个流中的值进行某种形式的转换。需要传递给它一个转换的函数作为参数。
//        List<Integer> li = Arrays.asList(10, 46, 2, 15, 26, 13, 10, 155, 60, 200, 50);
//       List l= li.stream()
//                .filter(i -> i>100)
//                .map(i->String.valueOf(i))
//                .collect(Collectors.toList());
//
//        l.forEach(a -> System.out.println(a));
//


//       // limit(n)方法会返回一个包含n个元素的新的流（若总长小于n则返回原始流）。
       // skip(n)方法正好相反，它会丢弃掉前面的n个元素。
//        List<Integer> myList =new ArrayList<>();
//        myList.add(1);
//        myList.add(2);
//        myList.add(3);
//        myList.add(4);
//        myList.add(5);
//        myList.add(6);
//
//        List l=myList.stream().limit(3).collect(Collectors.toList());
//        l.forEach(a -> System.out.println(a));


//distinct方法会根据原始流中的元素返回一个具有相同顺序、去除了重复元素的流，这个操作显然是需要记住之前读取的元素。
        List<Integer> myTestList = new ArrayList<>();
        myTestList.add(10);
        myTestList.add(39);
        myTestList.add(10);
        myTestList.add(78);
        myTestList.add(10);
        List l=myTestList.stream()
                .distinct().collect(Collectors.toList());

        System.out.println("#"+l);



    }
}
