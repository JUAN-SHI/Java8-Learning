package factory;

/**
 * Created by shijuan on 2019/3/19.
 */
public class CircleFactory implements  Factory
{
    @Override
    public Shape getShape() {
        return new Circle();
    }
}
