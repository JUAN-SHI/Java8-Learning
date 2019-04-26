package test;

import aop.*;
import org.junit.Test;

/**
 * Created by shijuan on 2019/3/26.
 */
public class SimpleAOPTest {
    @Test
    public  void getProxy()throws Exception{
        //1.创建一个MethodInvocation实现类
        MethodInvcation logTask = () -> System.out.println("log task start");
        HelloServiceImpl serviceImpl = new HelloServiceImpl();
        //2.创建一个Advice
        Advice beforeAdvice = new BeforeAdvice(serviceImpl,logTask);
        //3.为目标对象生成代理
        HelloService helloServiceImplProxy = (HelloService) SimpleAOP.getProxy(serviceImpl,beforeAdvice);
        helloServiceImplProxy.sayHelloWorld();
    }
}
