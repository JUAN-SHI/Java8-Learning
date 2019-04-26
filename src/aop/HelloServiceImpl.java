package aop;

/**
 * Created by shijuan on 2019/3/26.
 */
public class HelloServiceImpl implements  HelloService {
    @Override
    public void sayHelloWorld() {
        System.out.println("hello world");
    }
}
