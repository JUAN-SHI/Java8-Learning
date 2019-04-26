package com.java8.test;

/**
 * Created by shijuan on 2019/3/18.
 */
public class Something {
    String startswith(String s){
        return  String.valueOf(s.charAt(0));
    }

    public static void main(String[] args) {
        Something something = new Something();
        Converter<String,String> converter = something::startswith;
        String coverted = converter.convert("123");
        System.out.println(coverted);
    }




}
