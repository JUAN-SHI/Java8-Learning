package Concrete;

/**
 * Created by shijuan on 2019/3/22.
 */
public class ManDectractorA  extends Decorator{
    public  void eat(){
        super.eat();
        reEat();
        System.out.println("ManDecoratorA类");
    }

    public  void reEat(){
        System.out.println("在吃一顿饭");
    }
}
