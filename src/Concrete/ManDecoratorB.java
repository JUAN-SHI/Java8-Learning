package Concrete;

/**
 * Created by shijuan on 2019/3/22.
 */
public class ManDecoratorB extends  Decorator {
    @Override
    public void eat() {
        super.eat();
        System.out.println("======================");
        System.out.println("ManDecoratorB类");
    }
}
