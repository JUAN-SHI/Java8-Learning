package com.java8.test;

/**
 * Created by shijuan on 2019/3/18.
 */
public class Lambda4 {
    static  int outerStaticnum;
    int outerNum;
    void testScopes() {
        Converter<Integer, String> stringConverter = (from) -> {
            outerNum = 23;
            return String.valueOf(from);
        };

        Converter<Integer, String> stringConverter1 = (from) -> {
            outerStaticnum = 72;
            return  String.valueOf(from);
        };
    }
}
