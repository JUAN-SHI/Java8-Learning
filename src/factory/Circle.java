package factory;

/**
 * Created by shijuan on 2019/3/19.
 */
public class Circle implements  Shape {
    @Override
    public void drow() {
        System.out.println("Draw Circle");
    }


    public Circle() {
        System.out.println("画圆");
    }
}
