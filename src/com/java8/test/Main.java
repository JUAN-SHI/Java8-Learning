package com.java8.test;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        //通过匿名内部类方式访问接口
//        Formula formula = new Formula() {
//            @Override
//            public double calculate(int a) {
//                return sqrt(a * 100);
//            }
//        };
//
//        System.out.println(formula.calculate(100));
//        System.out.println(formula.calculate(16));
//
//
//        PersonFactory personFactory = Person::new;//Person::new来获取Person类构造函数的引用，
//        personFactory.create("Peter","Parker");

        //Converter<String,Integer> converter = from -> Integer.valueOf(from);
//    Integer converted = converter.convert("123");

//    Converter<String,Integer> converter = Integer::valueOf;//允许通过::关键字传递方法或构造函数的引用
//    Integer coverterd = converter.convert("123");


//        final int num = 1;
//        Converter<Integer,String>  converter = (from) -> String.valueOf(from+num);
//        System.out.println(converter.convert(1));



        List<String> stringCollection = new ArrayList<>();
        stringCollection.add("ddd2");
        stringCollection.add("aaa2");
        stringCollection.add("bbb1");
        stringCollection.add("aaa1");
        stringCollection.add("bbb3");
        stringCollection.add("ccc");
        stringCollection.add("bbb2");
        stringCollection.add("ddd1");




    }



}
