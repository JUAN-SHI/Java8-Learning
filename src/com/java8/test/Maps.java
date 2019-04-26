package com.java8.test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by shijuan on 2019/4/23.
 */
public class Maps {
    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();
        for (int i = 0 ;i<10;i++){
            map.putIfAbsent(i,"val"+i);
        }
        map.forEach((id,val)-> System.out.println(val));

    }
}
