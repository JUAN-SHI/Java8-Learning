package com.java8.test;

import java.util.Arrays;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by shijuan on 2019/3/18.
 */
public class Lambda {

    public static void main(String[] args) {
        //排列字符串
        List<String> names = Arrays.asList("peter","anna","mike","xenia");
        Collections.sort(names, (o1, o2) -> o2.compareTo(o1));//替换成lambda表达式




//        Collections.sort(names,(String a,String b)->{
//            return b.compareTo(a);
//        });
    }




}


