package com.java8.test;

/**
 * Created by shijuan on 2019/3/18.
 */
interface Formula {

    double calculate(int a);

    default  double sqrt(int a){
        return  Math.sqrt(a);
    }
}
