package aop;

import java.lang.reflect.Method;

/**
 * Created by shijuan on 2019/3/26.
 */
public class BeforeAdvice implements  Advice {
    private  Object bean;
    private  MethodInvcation methodInvcation;

    public BeforeAdvice(Object bean, MethodInvcation methodInvcation) {
        this.bean = bean;
        this.methodInvcation = methodInvcation;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        methodInvcation.invoke();
        return method.invoke(bean,args);
    }
}
