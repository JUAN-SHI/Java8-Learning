package com.java8.test;

/**
 * Created by shijuan on 2019/3/18.
 */
public interface PersonFactory<P extends  Person> {//指定一个用来创建Person对象的对象工厂接口
    P create(String firstName,String lastName);
}
