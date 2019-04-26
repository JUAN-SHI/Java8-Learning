package aop;

import springIoc.SimpleIOC;

import java.lang.reflect.Proxy;

/**
 * Created by shijuan on 2019/3/26.
 */
public class SimpleAOP {
    public  static  Object getProxy(Object bean,Advice advice){
        return Proxy.newProxyInstance(SimpleAOP.class.getClassLoader(),bean.getClass().getInterfaces(),advice);
    }
}
