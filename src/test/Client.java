package test;

import Facade.Computer;
import handler.ConcreteHandler;
import handler.DeptManager;
import handler.GeneralManager;
import handler.Handler;

/**
 * Created by shijuan on 2019/3/23.
 */
public class Client {

    public static void main(String[] args) {
//        Computer computer = new Computer();
//        computer.start();
//        computer.shutDown();


        //组装责任链接
//        Handler handler1 = new ConcreteHandler();
//        Handler handler2 = new ConcreteHandler();
//        handler1.setSuccessor(handler2);
//        handler1.handleRequest();
        //提交请求


        //费用测试

        Handler handler1 = new ConcreteHandler();
        Handler handler2 = new DeptManager();
        Handler handler3=  new GeneralManager();
        handler2.setSuccessor(handler1);
        handler3.setSuccessor(handler2);
        String test1 =  handler3.handleFeeRequest("张三",300);
        System.out.println("test1 = " + test1);
        String test2 = handler3.handleFeeRequest("李四", 300);
        System.out.println("test2 = " + test2);
        System.out.println("---------------------------------------");



        String test3 = handler3.handleFeeRequest("张三", 700);
        System.out.println("test3 = " + test3);
        String test4 = handler3.handleFeeRequest("李四", 700);
        System.out.println("test4 = " + test4);
        System.out.println("---------------------------------------");

        String test5 = handler3.handleFeeRequest("张三", 1500);
        System.out.println("test5 = " + test5);
        String test6 = handler3.handleFeeRequest("李四", 1500);
        System.out.println("test6 = " + test6);





    }




}
