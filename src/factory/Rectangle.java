package factory;

/**
 * Created by shijuan on 2019/3/19.
 */
public class Rectangle implements Shape {
    @Override
    public void drow() {
        System.out.println("Draw Rectangle");
    }

    public Rectangle() {
        System.out.println("Rectangle");
    }
}
