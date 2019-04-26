package com.java8.test;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

/**
 * Created by shijuan on 2019/3/19.
 */
public class Singleton {
    //饿汉式方式
//    //在静态初始化器中创建单例实例，这段代码保证了线程安全
//    private  static  Singleton uniqueInstance = new Singleton();
//    //Singleton类只有一个构造方法并且是被private修饰的，所以用户无法通过new方法创建该对象。
//    private Singleton(){};
//    public  static  Singleton getInstance(){
//        return  uniqueInstance;
//    }

//    //懒汉式
//    private static  Singleton uniqueInstance;
//    private  Singleton(){}
//    //没有加入synchronized关键字的版本是线程不安全的
//    private  static  Singleton gerInstance(){
//        if (uniqueInstance == null){
//            uniqueInstance  = new Singleton();
//        }
//
//        return  uniqueInstance;
//    }


//    private static Singleton uniquInstance = new Singleton();
//    public Singleton(){};
//    public static synchronized  Singleton getInstance() {
//        return uniquInstance;
//    }

//    //双重检查加锁版本
//    //volatile 保证，当uniqueInstance变量被初始化成Singleton实例时，多个线程可以正确处理uniqueInstance变量
//    private  volatile  static  Singleton uniqueInstance;
//    //volatile关键字来保证数据的可见性
//    private  Singleton(){};
//
//    public static Singleton getInstance() {
//        //检查实例，如果不存在，就进入同步代码块
//        if (uniqueInstance == null){
//            synchronized (Singleton.class){
//                //进入同步代码块后，再检查一次，如果仍是null，才创建实例
//                if (uniqueInstance == null){
//                    uniqueInstance = new Singleton();
//                }
//            }
//        }
//        return uniqueInstance;
//    }


//    //登记式、静态内部类方式
//    private static  class  SingletonHolder{
//
//        //只有通过显式调用getInstance方法时，才会显式装载SingletonHolder类，从而实例化Instance
//        //只有第一实例化的时候才加载，同时不会有线程安全问题。
//        private static  final  Singleton INSTANCE = new Singleton();
//
//    }
//    private Singleton(){
//
//    }
//    public static  final  Singleton getInstance(){
//        return  SingletonHolder.INSTANCE;
//    }



}
